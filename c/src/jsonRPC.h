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

#ifndef JSONRPC_H_
#define JSONRPC_H_

#ifdef __cplusplus /* If this is a C++ compiler, use C linkage */
extern "C" {
#endif


#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdarg.h>
#include <windows.h>	// TODO cross-platform version?
#include "jsonDatabase.h"
#include "ctypes.h"

#define JSON_WEB_SERVER_SELECT_MAX_TIME		10		// ms


Item *getIED(char *iedObjectRef);
Item *getLD(char *iedObjectRef, char *objectRef);
Item *getLN(char *iedObjectRef, char *LDObjectRef, char *objectRef);
Item *getItem(Item *ln, int num, ...);
Item *getItemFromPath(char *iedObjectRef, char *objectRefPath);
int setItem(Item *item, char *input);
int itemToJSON(char *buf, Item *item);
int itemTreeToJSON(char *buf, Item *root);
int itemTreeToJSONPretty(char *buf, Item *root);
void start_JSON_RPC();

#ifdef __cplusplus /* If this is a C++ compiler, end C linkage */
}
#endif

#endif /* JSONRPC_H_ */
