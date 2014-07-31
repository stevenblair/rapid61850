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


#include "ctypes.h"
#if JSON_INTERFACE == 1

#ifndef JSON_DATABASE_H
#define JSON_DATABASE_H

#ifdef __cplusplus /* If this is a C++ compiler, use C linkage */
extern "C" {
#endif

#include <stdlib.h>
#include <string.h>
#include "mongoose.h"

/**
 * The basic data types defined in IEC 61850-7-2:2010, with an additional identifier for constructed data types.
 */
typedef enum {
	BASIC_TYPE_CONSTRUCTED = 0,
	BASIC_TYPE_BOOLEAN,
	BASIC_TYPE_INT8,
	BASIC_TYPE_INT16,
	BASIC_TYPE_INT32,
	BASIC_TYPE_INT64,
	BASIC_TYPE_INT8U,
	BASIC_TYPE_INT16U,
	BASIC_TYPE_INT24U,
	BASIC_TYPE_INT32U,
	BASIC_TYPE_FLOAT32,
	BASIC_TYPE_FLOAT64, // not specified in IEC 61850-7-2:2010
	BASIC_TYPE_ENUMERATED,
	BASIC_TYPE_CODED_ENUM,
	BASIC_TYPE_OCTET_STRING,
	BASIC_TYPE_VISIBLE_STRING,
	BASIC_TYPE_UNICODE_STRING,
	BASIC_TYPE_CURRENCY
} BasicType;

/**
 * Trigger Option state. Will default to 'not specified'.
 */
typedef enum {
	TRIGGER_OPTION_NOT_SPECIFIED = 0,
	TRIGGER_OPTION_FALSE = 1,
	TRIGGER_OPTION_TRUE = 2
} TriggerOptionValue;

/**
 * A generic description of any data "item" in IEC 61850. Some fields are not needed for all data types.
 */
typedef struct Item {
	char *objectRef;
	BasicType type;
	char *typeSCL;
	void *data;			// a pointer to the data within the data model
	int numberOfItems;
	struct Item *items;
	char *lnClass;
	char *CDC;
	char *FC;
	TriggerOptionValue dchg;
	TriggerOptionValue qchg;
} Item;

/**
 * Linked list definition for associated clients.
 */
typedef struct ACSIClient {
	char ip[48];         		// max IPv6 string length is 45 characters
	int port;            		// client's port
	struct ACSIClient *next;
} ACSIClient;

/**
 * Defines an ACSI server, which contains a mongoose web server instance.
 */
typedef struct ACSIServer {
	char *iedName;				// the name of the IED
	char *apName;				// the name of the Access Point
	struct mg_server *mg;		// mongoose web server instance
	ACSIClient *clients;		// list of associated clients
	Item *dataModel;			// pointer to root of data model index
} ACSIServer;

/**
 * Linked list definition for DataSet items.
 */
typedef struct ItemList {
   Item *item;
   struct ItemList *next;
} ItemList;

/**
 * Linked list definition of DataSets.
 */
typedef struct DataSet {
   char *name;
   ItemList *itemList;
   struct DataSet *next;
} DataSet;

/**
 * Calls auto-generated function to instantiate the index of the data model.
 */
void init_data_model_index();

/**
 * Calls auto-generated function to start a webserver for each IED. Each server is started in a new thread to avoid blocking the main thread.
 */
void init_webservers(mg_handler_t handler, void *(*serve)(void *));

/**
 * Stores the data model index hierarchy.
 */
extern Item dataModelIndex;

//extern const unsigned char scd_file[];

#ifdef __cplusplus /* If this is a C++ compiler, end C linkage */
}
#endif

#endif // JSON_DATABASE_H

#endif // JSON_INTERFACE
