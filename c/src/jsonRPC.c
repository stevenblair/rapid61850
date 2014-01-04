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
			return &LD->items[i];
		}
	}

	return NULL;
}
