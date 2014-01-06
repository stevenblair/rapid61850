/**
 * Rapid-prototyping protection schemes with IEC 61850
 *
 * Copyright (c) 2014 Steven Blair
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

#include "jsonRPC.h"

Item *getIED(char *iedObjectRef) {
	// check contains at least one IED
	if (database.items == NULL) {
		return NULL;
	}

	int i = 0;
	for (i = 0; i < database.numberOfItems; i++) {
		if (strcmp(iedObjectRef, database.items[i].objectRef) == 0) {
			return &database.items[i];
		}
	}

	return NULL;
}

Item *getLD(char *iedObjectRef, char *objectRef) {
	Item *ied = getIED(iedObjectRef);

	// check IED exists
	if (ied == NULL) {
		return NULL;
	}

	// check contains a server
	if (ied->items == NULL) {
		return NULL;
	}

	// check contains at least one LD
	if (ied->items[0].items == NULL) {
		return NULL;
	}

	int i = 0;
	for (i = 0; i < ied->items[0].numberOfItems; i++) {
		if (strcmp(objectRef, ied->items[0].items[i].objectRef) == 0) {
			return &ied->items[0].items[i];
		}
	}

	return NULL;
}

Item *getLN(char *iedObjectRef, char *LDObjectRef, char *objectRef) {
	Item *LD = getLD(iedObjectRef, LDObjectRef);

	if (LD == NULL) {
		return NULL;
	}

	int i = 0;
	for (i = 0; i < LD->numberOfItems; i++) {
		if (strcmp(objectRef, LD->items[i].objectRef) == 0) {
			return &(LD->items[i]);
		}
	}

	return NULL;
}

/**
 * Find an sub-item within an item, using the object reference string. Only checks within a single layer.
 */
Item *findSingleItem(Item *item, char *objectRef) {
	if (item == NULL || item->numberOfItems == 0) {
		return NULL;
	}

	int i = 0;
	for (i = 0; i < item->numberOfItems; i++) {
		if (strcmp(objectRef, item->items[i].objectRef) == 0) {
			return &item->items[i];
		}
	}

	return NULL;
}

/**
 * Find an item within the specified Logical Node object hierarchy.
 */
Item *getItem(Item *ln, int num, ...) {
	if (num < 1) {
		return NULL;
	}

	va_list arguments;
	va_start(arguments, num);

	Item *item = ln;
	int i = 0;

	for (i = 0; i < num; i++) {
		char *ref = va_arg(arguments, char *);
//		printf("  %d: %s\n", i, ref);

		item = findSingleItem(item, ref);

		if (item == NULL) {
			va_end(arguments);
			return NULL;
		}
	}

	va_end(arguments);
	return item;
}

int findCharIndex(char *s, char c) {
	int len = strlen(s);
	int i = 0;

	for (i = 0; i < len; i++) {
		if (s[i] == c) {
			return i;
		}
	}

	return -1;
}

/**
 * Converts data object reference (DataObjectRef), e.g., "myLD/MMXU1.PhV.phsA", to the database Item, if found.
 */
Item *getItemFromPath(char *iedObjectRef, char *objectRefPath) {
	Item *ied = getIED(iedObjectRef);
	int slashIndex = findCharIndex(objectRefPath, '/');

	// TODO check for no chars after slash

	// check IED exists
	if (ied == NULL) {
		return NULL;
	}

	// check if entire IED is requested
	if (strlen(objectRefPath) == 0) {
		return ied;
	}

	// check if just LD is specified
	if (slashIndex == -1) {
		Item *ld = getLD(iedObjectRef, objectRefPath);
		if (ld != NULL) {
			return ld;
		}
	}
	// check that LD reference is at least one character long
	else if (slashIndex < 1) {
		return NULL;
	}

	// copy LD reference string, and find item
	char ldRef[slashIndex + 1];	// null-terminated
	lstrcpyn(ldRef, objectRefPath, slashIndex + 1);
	Item *ld = getLD(iedObjectRef, ldRef);

//	printf("ldRef: %s\n", ldRef);
//	fflush(stdout);

	// find all items separated by '.'
	char *path = &objectRefPath[slashIndex + 1];
	int index = -1;
	Item *item = ld;
	while (item != NULL && (index = findCharIndex(path, '.')) > 0) {
		char objectRef[index + 1];	// null-terminated
		lstrcpyn(objectRef, path, index + 1);

//		printf("path: %s\n", path);
//		printf("objectRef: %s\n", objectRef);
//		fflush(stdout);

		item = findSingleItem(item, objectRef);
		path = &path[index + 1];
	}

	// find last item
	item = findSingleItem(item, path);

	return item;
}

/**
 * Prints leaf data items to the specified buffer. The buffer must be large enough. Returns the number of characters printed.
 */
int itemToJSON(char *buf, Item *item) {
	void *data = item->data;
	int i = 0;
	int len = 0;

	switch (item->type) {
		case BASIC_TYPE_COMPOUND:
			// compound data types are not allowed
			return 0;
		case BASIC_TYPE_BOOLEAN:
			if (*(CTYPE_BOOLEAN *) data == FALSE) {
				return sprintf(buf, "false");
			}
			else {
				return sprintf(buf, "true");
			}
		case BASIC_TYPE_INT8:
			return sprintf(buf, "%d", *((CTYPE_INT8 *) data));
		case BASIC_TYPE_INT16:
			return sprintf(buf, "%d", *((CTYPE_INT16 *) data));
		case BASIC_TYPE_INT32:
			return sprintf(buf, "%d", *((CTYPE_INT32 *) data));
		case BASIC_TYPE_INT64:
			return sprintf(buf, "%ld", *((CTYPE_INT64 *) data));
		case BASIC_TYPE_INT8U:
			return sprintf(buf, "%u", *((CTYPE_INT8U *) data));
		case BASIC_TYPE_INT16U:
			return sprintf(buf, "%u", *((CTYPE_INT16U *) data));
		case BASIC_TYPE_INT24U:
			return sprintf(buf, "%u", *((CTYPE_INT24U *) data));
		case BASIC_TYPE_INT32U:
			return sprintf(buf, "%u", *((CTYPE_INT32U *) data));
		case BASIC_TYPE_FLOAT32:
			return sprintf(buf, "%f", *((CTYPE_FLOAT32 *) data));
		case BASIC_TYPE_FLOAT64:
			return sprintf(buf, "%f", *((CTYPE_FLOAT64 *) data));
		case BASIC_TYPE_ENUMERATED:
			return sprintf(buf, "%u", *((CTYPE_ENUM *) data));
		case BASIC_TYPE_CODED_ENUM:
			return sprintf(buf, "%u", *((CTYPE_ENUM *) data));
		// all string types must be null-terminated in data model
		case BASIC_TYPE_OCTET_STRING:
			len = strlen((const char *) data);
			for (i = 0; i < len; i++) {
				sprintf(buf, "\"%02X\"", ((unsigned char*) data)[i]);
			}
			return len;
		case BASIC_TYPE_VISIBLE_STRING:
			return sprintf(buf, "\"%s\"", (CTYPE_VISSTRING255) data);
		case BASIC_TYPE_UNICODE_STRING:
			return sprintf(buf, "\"%ls\"", (wchar_t *) data);
		case BASIC_TYPE_CURRENCY:
			return sprintf(buf, "\"%s\"", (CTYPE_VISSTRING255) data);
		default:
			return 0;
	}
}

/**
 * Prints hierarchy of items with whitespace, starting from the root, to the specified buffer. The buffer must be large enough. Returns the number of characters printed.
 */
int itemTreeToJSONPretty(char *buf, Item *root, int tab) {
	int len = 0;
	int i = 0;
	Item *item = root;

	if (item == NULL) {
		return 0;
	}

	if (item->type == BASIC_TYPE_COMPOUND) {
		if (tab == 0) {
			len += sprintf(&buf[len], "{\n    \"%s\" : {", item->objectRef);
		}
		else {
			len += sprintf(&buf[len], "    %*s\"%s\" : {", tab, " ", item->objectRef);
		}
	}
	else {
		if (tab == 0) {
			len += sprintf(&buf[len], "    \"%s\" : ", item->objectRef);
		}
		else {
			len += sprintf(&buf[len], "    %*s\"%s\" : ", tab, " ", item->objectRef);
		}
	}

	if (item->type == BASIC_TYPE_COMPOUND && item->numberOfItems > 0) {
		len += sprintf(&buf[len], "\n");

		// loop through each sub-item
		for (i = 0; i < item->numberOfItems; i++) {
			len += itemTreeToJSONPretty(&buf[len], &item->items[i], tab + 4);
			if (i < item->numberOfItems - 1) {
				len += sprintf(&buf[len], ",\n");
			}
		}
	}
	else {
		len += itemToJSON(&buf[len], item);
	}

	if (item->type == BASIC_TYPE_COMPOUND) {
		if (tab == 0) {
			len += sprintf(&buf[len], "\n    }\n}");
		}
		else {
			len += sprintf(&buf[len], "\n    %*s}", tab, " ");
		}
	}

	return len;
}


/**
 * Prints hierarchy of items, starting from the root, to the specified buffer. The buffer must be large enough. Returns the number of characters printed.
 */
int itemTreeToJSON(char *buf, Item *root, int tab) {
	int len = 0;
	int i = 0;
	Item *item = root;

	if (item == NULL) {
		return 0;
	}

	if (item->type == BASIC_TYPE_COMPOUND) {
		if (tab == 0) {
			len += sprintf(&buf[len], "{\"%s\":{", item->objectRef);
		}
		else {
			len += sprintf(&buf[len], "\"%s\":{", item->objectRef);
		}
	}
	else {
		len += sprintf(&buf[len], "\"%s\":", item->objectRef);
	}

	if (item->type == BASIC_TYPE_COMPOUND && item->numberOfItems > 0) {
		// loop through each sub-item
		for (i = 0; i < item->numberOfItems; i++) {
			len += itemTreeToJSON(&buf[len], &item->items[i], tab + 4);
			if (i < item->numberOfItems - 1) {
				len += sprintf(&buf[len], ",");
			}
		}
	}
	else {
		len += itemToJSON(&buf[len], item);
	}

	if (item->type == BASIC_TYPE_COMPOUND) {
		if (tab == 0) {
			len += sprintf(&buf[len], "}}");
		}
		else {
			len += sprintf(&buf[len], "}");
		}
	}

	return len;
}
