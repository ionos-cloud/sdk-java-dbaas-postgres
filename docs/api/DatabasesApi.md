# DatabasesApi

All URIs are relative to *https://api.ionos.com/databases/postgresql*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**databasesDelete**](DatabasesApi.md#databasesdelete) | **DELETE** /clusters/{clusterId}/databases/{databasename} | Delete database |
| [**databasesGet**](DatabasesApi.md#databasesget) | **GET** /clusters/{clusterId}/databases/{databasename} | Get database |
| [**databasesList**](DatabasesApi.md#databaseslist) | **GET** /clusters/{clusterId}/databases | List databases |
| [**databasesPost**](DatabasesApi.md#databasespost) | **POST** /clusters/{clusterId}/databases | Create a database |


<a name="databasesDelete"></a>
# **databasesDelete**
> databasesDelete(clusterId, databasename)

Delete database

Deletes a single database

### Example
```java
// Import classes:
import com.ionoscloud.dbaaspostgres.ApiClient;
import com.ionoscloud.dbaaspostgres.ApiException;
import com.ionoscloud.dbaaspostgres.Configuration;
import com.ionoscloud.dbaaspostgres.auth.*;
import com.ionoscloud.dbaaspostgres.model.*;
import com.ionoscloud.dbaaspostgres.api.DatabasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    DatabasesApi apiInstance = new DatabasesApi(defaultClient);
    String clusterId = "498ae72f-411f-11eb-9d07-046c59cc737e"; // String | The unique ID of the cluster.
    String databasename = "benjamindb"; // String | The database name.
    try {
      apiInstance.databasesDelete(clusterId, databasename);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabasesApi#databasesDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clusterId** | **String**| The unique ID of the cluster. |
| **databasename** | **String**| The database name. |

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="databasesGet"></a>
# **databasesGet**
> DatabaseResource databasesGet(clusterId, databasename)

Get database

Retrieves a single database

### Example
```java
// Import classes:
import com.ionoscloud.dbaaspostgres.ApiClient;
import com.ionoscloud.dbaaspostgres.ApiException;
import com.ionoscloud.dbaaspostgres.Configuration;
import com.ionoscloud.dbaaspostgres.auth.*;
import com.ionoscloud.dbaaspostgres.model.*;
import com.ionoscloud.dbaaspostgres.api.DatabasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    DatabasesApi apiInstance = new DatabasesApi(defaultClient);
    String clusterId = "498ae72f-411f-11eb-9d07-046c59cc737e"; // String | The unique ID of the cluster.
    String databasename = "benjamindb"; // String | The database name.
    try {
      DatabaseResource result = apiInstance.databasesGet(clusterId, databasename);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabasesApi#databasesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clusterId** | **String**| The unique ID of the cluster. |
| **databasename** | **String**| The database name. |

### Return type

[**DatabaseResource**](../models/DatabaseResource.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="databasesList"></a>
# **databasesList**
> DatabaseList databasesList(clusterId, limit, offset)

List databases

Retrieves a list of databases

### Example
```java
// Import classes:
import com.ionoscloud.dbaaspostgres.ApiClient;
import com.ionoscloud.dbaaspostgres.ApiException;
import com.ionoscloud.dbaaspostgres.Configuration;
import com.ionoscloud.dbaaspostgres.auth.*;
import com.ionoscloud.dbaaspostgres.model.*;
import com.ionoscloud.dbaaspostgres.api.DatabasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    DatabasesApi apiInstance = new DatabasesApi(defaultClient);
    String clusterId = "498ae72f-411f-11eb-9d07-046c59cc737e"; // String | The unique ID of the cluster.
    Integer limit = 100; // Integer | The maximum number of elements to return. Use together with 'offset' for pagination.
    Integer offset = 0; // Integer | The first element to return. Use together with 'limit' for pagination.
    try {
      DatabaseList result = apiInstance.databasesList(clusterId, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabasesApi#databasesList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clusterId** | **String**| The unique ID of the cluster. |
| **limit** | **Integer**| The maximum number of elements to return. Use together with &#39;offset&#39; for pagination. | [optional] [default to 100]
| **offset** | **Integer**| The first element to return. Use together with &#39;limit&#39; for pagination. | [optional] [default to 0]

### Return type

[**DatabaseList**](../models/DatabaseList.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="databasesPost"></a>
# **databasesPost**
> DatabaseResource databasesPost(clusterId, database)

Create a database

Create a new database

### Example
```java
// Import classes:
import com.ionoscloud.dbaaspostgres.ApiClient;
import com.ionoscloud.dbaaspostgres.ApiException;
import com.ionoscloud.dbaaspostgres.Configuration;
import com.ionoscloud.dbaaspostgres.auth.*;
import com.ionoscloud.dbaaspostgres.model.*;
import com.ionoscloud.dbaaspostgres.api.DatabasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    DatabasesApi apiInstance = new DatabasesApi(defaultClient);
    String clusterId = "498ae72f-411f-11eb-9d07-046c59cc737e"; // String | The unique ID of the cluster.
    Database database = new Database(); // Database | a database to create
    try {
      DatabaseResource result = apiInstance.databasesPost(clusterId, database);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabasesApi#databasesPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clusterId** | **String**| The unique ID of the cluster. |
| **database** |  [**Database**](../models/Database.md)| a database to create |

### Return type

[**DatabaseResource**](../models/DatabaseResource.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

