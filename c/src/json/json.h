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
#ifdef _WIN32
#include <windows.h>
#else
#include <netinet/in.h>
#endif
#include "ctypes.h"
#include "dataModelIndex.h"

#define WEB_SERVER_SELECT_MAX_TIME		5	// ms
#define JSON_OUTPUT_PRETTIFY			1
#define JSON_USE_HTTP_AUTH				0

#if JSON_OUTPUT_PRETTIFY == 1
#define ACSI_RESPONSE_MAX_SIZE			64000
#else
#define ACSI_RESPONSE_MAX_SIZE			16000
#endif
#define ACSI_RESPONSE_SIZE_WARNING		128
#define ACSI_AUTO_ASSOCIATE				1
#define ACSI_ASSOCIATE					"associate"
#define ACSI_RELEASE					"release"
#define ACSI_ABORT						"abort"
#define ACSI_GET_DEFINITION				"definition"
#define ACSI_GET_DIRECTORY				"directory"
#define ACSI_OK							"ok"
#define ACSI_NOT_POSSIBLE				"not possible"
#define ACSI_NOT_FOUND					"404"
#define ACSI_BUFFER_OVERRUN				"buffer overrun; increase ACSI_RESPONSE_MAX_SIZE"
#define ACSI_REQUEST_CHECK_LENGTH(len)	if (len > ACSI_RESPONSE_MAX_SIZE - ACSI_RESPONSE_SIZE_WARNING) {return -1;}
#define ACSI_REQUEST_CHECK_LENGTH2(len)	if (len > ACSI_RESPONSE_MAX_SIZE - ACSI_RESPONSE_SIZE_WARNING) {return len;}


Item *getIED(char *iedObjectRef);
Item *getLD(char *iedObjectRef, char *objectRef);
Item *getLN(char *iedObjectRef, char *LDObjectRef, char *objectRef);

/**
 * Find an item within the specified Logical Node object hierarchy.
 *
 * Provide a list of item names (where num is the number), e.g., getItem(ln, 3, "C1", "LN0", "Mod").
 */
Item *getItem(Item *ln, int num, ...);

/**
 * Converts data object reference (DataObjectRef), e.g., "myLD/MMXU1.PhV.phsA", to the database Item, if found. Returns NULL otherwise.
 */
Item *getItemFromPath(char *iedObjectRef, char *objectRefPath);

/**
 * Sets the value of leaf data items. Returns the number of bytes written if successful, or 0 otherwise.
 */
int setItem(Item *item, char *input, int input_len);

/**
 * Prints leaf data items to the specified buffer. The buffer must be large enough. Returns the number of characters printed.
 */
int itemToJSON(char *buf, Item *item);

/**
 * Prints hierarchy of items without whitespace, starting from the root, to the specified buffer.
 *
 * The buffer must be large enough. Returns the number of characters printed.
 */
int itemTreeToJSON(char *buf, Item *root);

/**
 * Prints hierarchy of items with whitespace, starting from the root, to the specified buffer.
 *
 * The buffer must be large enough. Returns the number of characters printed.
 */
int itemTreeToJSONPretty(char *buf, Item *root);

/**
 * Prints a self-descriptive hierarchy of items with whitespace, starting from the root, to the specified buffer.
 *
 * The buffer must be large enough. Returns the number of characters printed.
 */
int itemDescriptionTreeToJSONPretty(char *buf, Item *root, unsigned char deep);

/**
 * Prints a self-descriptive hierarchy of items without whitespace, starting from the root, to the specified buffer.
 *
 * The buffer must be large enough. Returns the number of characters printed.
 */
int itemDescriptionTreeToJSON(char *buf, Item *root, unsigned char deep);

/**
 * Starts JSON HTTP-based interface.
 */
void start_json_interface();

/**
 * Send an HTTP request to a server.
 */
char *send_http_request_get(int port, int *len, char *url);

/**
 * Send an HTTP POST request to a server.
 */
char *send_http_request_post(int port, int *len, char *url, char *value);


unsigned char isClient(ACSIClient *client, char ip[48], int port);

ACSIClient *findClient(ACSIClient *client_list, char ip[48], int port);

ACSIClient *addClient(ACSIClient *client_list, char ip[48], int port);

ACSIClient *removeClient(ACSIClient *client_list, ACSIClient *remove);

ACSIClient *removeClientByConnection(ACSIClient *client_list, char ip[48], int port);


#ifdef __cplusplus /* If this is a C++ compiler, end C linkage */
}
#endif

#endif /* JSONRPC_H_ */

#endif
