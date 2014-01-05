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

	// check IED exists and that LD reference is at least one character long
	if (ied == NULL || slashIndex < 1) {
		return NULL;
	}

	char ldRef[slashIndex + 1];	// null-terminated
	lstrcpyn(ldRef, objectRefPath, slashIndex + 1);
	Item *ld = getLD(iedObjectRef, ldRef);

//	printf("ldRef: %s\n", ldRef);
//	fflush(stdout);

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

	item = findSingleItem(item, path);

	return item;
}

int itemToString(char *buf, Item *item) {
	void *data = item->data;
	int n = -1;

	// TODO add sprintf() statements; remove redundant breaks where possible
	switch (item->type) {
	case BASIC_TYPE_COMPOUND:
		break;
	case BASIC_TYPE_BOOLEAN:
		break;
	case BASIC_TYPE_INT8:
		break;
	case BASIC_TYPE_INT16:
		break;
	case BASIC_TYPE_INT32:
		break;
	case BASIC_TYPE_INT64:
		break;
	case BASIC_TYPE_INT8U:
		break;
	case BASIC_TYPE_INT16U:
		break;
	case BASIC_TYPE_INT24U:
		break;
	case BASIC_TYPE_INT32U:
		break;
	case BASIC_TYPE_FLOAT32:
		n = sprintf(buf, "%f", *((CTYPE_FLOAT32 *) data));
		break;
	case BASIC_TYPE_FLOAT64:
		n = sprintf(buf, "%f", *((CTYPE_FLOAT64 *) data));
		break;
	case BASIC_TYPE_ENUMERATED:
		break;
	case BASIC_TYPE_CODED_ENUM:
		break;
	case BASIC_TYPE_OCTET_STRING:
		break;
	case BASIC_TYPE_VISIBLE_STRING:
		break;
	case BASIC_TYPE_UNICODE_STRING:
		break;
	case BASIC_TYPE_CURRENCY:
		break;
	default:
		break;
	}

	return n;
}
