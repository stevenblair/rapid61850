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

#if JSON_INTERFACE == 1

#ifndef JSONRPC_H_
#define JSONRPC_H_

#ifdef __cplusplus /* If this is a C++ compiler, use C linkage */
extern "C" {
#endif


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdarg.h>
#include <stdint.h>
#include <windows.h>	// TODO cross-platform version?
#include "dataModelIndex.h"
#include "ctypes.h"

#define WEB_SERVER_SELECT_MAX_TIME		10	// ms

Item *getIED(char *iedObjectRef);
Item *getLD(char *iedObjectRef, char *objectRef);
Item *getLN(char *iedObjectRef, char *LDObjectRef, char *objectRef);

/**
 * Find an item within the specified Logical Node object hierarchy. Provide a list of item names (where num is the number), e.g., getItem(ln, 3, "C1", "LN0", "Mod").
 */
Item *getItem(Item *ln, int num, ...);

/**
 * Converts data object reference (DataObjectRef), e.g., "myLD/MMXU1.PhV.phsA", to the database Item, if found.
 */
Item *getItemFromPath(char *iedObjectRef, char *objectRefPath);

/**
 * Sets the value of leaf data items. Returns 1 if successful, or 0 otherwise.
 */
int setItem(Item *item, char *input);

/**
 * Prints leaf data items to the specified buffer. The buffer must be large enough. Returns the number of characters printed.
 */
int itemToJSON(char *buf, Item *item);

/**
 * Prints hierarchy of items without whitespace, starting from the root, to the specified buffer. The buffer must be large enough. Returns the number of characters printed.
 */
int itemTreeToJSON(char *buf, Item *root);

/**
 * Prints hierarchy of items with whitespace, starting from the root, to the specified buffer. The buffer must be large enough. Returns the number of characters printed.
 */
int itemTreeToJSONPretty(char *buf, Item *root);

/**
 * Prints a self-descriptive hierarchy of items with whitespace, starting from the root, to the specified buffer. The buffer must be large enough. Returns the number of characters printed.
 */
int itemDescriptionTreeToJSONPretty(char *buf, Item *root, unsigned char deep);

/**
 * Prints a self-descriptive hierarchy of items without whitespace, starting from the root, to the specified buffer. The buffer must be large enough. Returns the number of characters printed.
 */
int itemDescriptionTreeToJSON(char *buf, Item *root, unsigned char deep);

/**
 * Starts JSON HTTP-based interface.
 */
void start_json_interface();

/**
 * Send an HTTP request to a server.
 */
char *send_http_request(int port, int *len, char *method, char *url);



#ifdef __cplusplus /* If this is a C++ compiler, end C linkage */
}
#endif

#endif /* JSONRPC_H_ */

#endif
