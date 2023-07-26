# UsersApi

All URIs are relative to *https://api.ionos.com/databases/postgresql*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**usersDelete**](UsersApi.md#usersdelete) | **DELETE** /clusters/{clusterId}/users/{username} | Delete user |
| [**usersGet**](UsersApi.md#usersget) | **GET** /clusters/{clusterId}/users/{username} | Get user |
| [**usersList**](UsersApi.md#userslist) | **GET** /clusters/{clusterId}/users | List users |
| [**usersPatch**](UsersApi.md#userspatch) | **PATCH** /clusters/{clusterId}/users/{username} | Patch user |
| [**usersPost**](UsersApi.md#userspost) | **POST** /clusters/{clusterId}/users | Create a user |


<a name="usersDelete"></a>
# **usersDelete**
> usersDelete(clusterId, username)

Delete user

Deletes a single user

### Example
```java
// Import classes:
import com.ionoscloud.dbaaspostgres.ApiClient;
import com.ionoscloud.dbaaspostgres.ApiException;
import com.ionoscloud.dbaaspostgres.Configuration;
import com.ionoscloud.dbaaspostgres.auth.*;
import com.ionoscloud.dbaaspostgres.model.*;
import com.ionoscloud.dbaaspostgres.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String clusterId = "498ae72f-411f-11eb-9d07-046c59cc737e"; // String | The unique ID of the cluster.
    String username = "benjamin"; // String | The authentication username.
    try {
      apiInstance.usersDelete(clusterId, username);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersDelete");
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
| **username** | **String**| The authentication username. |

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersGet"></a>
# **usersGet**
> UserResource usersGet(clusterId, username)

Get user

Retrieves a single user

### Example
```java
// Import classes:
import com.ionoscloud.dbaaspostgres.ApiClient;
import com.ionoscloud.dbaaspostgres.ApiException;
import com.ionoscloud.dbaaspostgres.Configuration;
import com.ionoscloud.dbaaspostgres.auth.*;
import com.ionoscloud.dbaaspostgres.model.*;
import com.ionoscloud.dbaaspostgres.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String clusterId = "498ae72f-411f-11eb-9d07-046c59cc737e"; // String | The unique ID of the cluster.
    String username = "benjamin"; // String | The authentication username.
    try {
      UserResource result = apiInstance.usersGet(clusterId, username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersGet");
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
| **username** | **String**| The authentication username. |

### Return type

[**UserResource**](../models/UserResource.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersList"></a>
# **usersList**
> UserList usersList(clusterId, limit, offset, system)

List users

Retrieves a list of users

### Example
```java
// Import classes:
import com.ionoscloud.dbaaspostgres.ApiClient;
import com.ionoscloud.dbaaspostgres.ApiException;
import com.ionoscloud.dbaaspostgres.Configuration;
import com.ionoscloud.dbaaspostgres.auth.*;
import com.ionoscloud.dbaaspostgres.model.*;
import com.ionoscloud.dbaaspostgres.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String clusterId = "498ae72f-411f-11eb-9d07-046c59cc737e"; // String | The unique ID of the cluster.
    Integer limit = 100; // Integer | The maximum number of elements to return. Use together with 'offset' for pagination.
    Integer offset = 0; // Integer | The first element to return. Use together with 'limit' for pagination.
    Boolean system = true; // Boolean | If set to 'true' all users, including system users are returned. System users cannot be deleted or updated.
    try {
      UserList result = apiInstance.usersList(clusterId, limit, offset, system);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersList");
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
| **system** | **Boolean**| If set to &#39;true&#39; all users, including system users are returned. System users cannot be deleted or updated. | [optional]

### Return type

[**UserList**](../models/UserList.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersPatch"></a>
# **usersPatch**
> UserResource usersPatch(clusterId, username, usersPatchRequest)

Patch user

Patches a single user. Only changing the password is supported. System users cannot be patched.

### Example
```java
// Import classes:
import com.ionoscloud.dbaaspostgres.ApiClient;
import com.ionoscloud.dbaaspostgres.ApiException;
import com.ionoscloud.dbaaspostgres.Configuration;
import com.ionoscloud.dbaaspostgres.auth.*;
import com.ionoscloud.dbaaspostgres.model.*;
import com.ionoscloud.dbaaspostgres.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String clusterId = "498ae72f-411f-11eb-9d07-046c59cc737e"; // String | The unique ID of the cluster.
    String username = "benjamin"; // String | The authentication username.
    UsersPatchRequest usersPatchRequest = new UsersPatchRequest(); // UsersPatchRequest | Patch containing all properties that should be updated
    try {
      UserResource result = apiInstance.usersPatch(clusterId, username, usersPatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersPatch");
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
| **username** | **String**| The authentication username. |
| **usersPatchRequest** |  [**UsersPatchRequest**](../models/UsersPatchRequest.md)| Patch containing all properties that should be updated |

### Return type

[**UserResource**](../models/UserResource.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersPost"></a>
# **usersPost**
> UserResource usersPost(clusterId, user)

Create a user

Create a new Postgres User

### Example
```java
// Import classes:
import com.ionoscloud.dbaaspostgres.ApiClient;
import com.ionoscloud.dbaaspostgres.ApiException;
import com.ionoscloud.dbaaspostgres.Configuration;
import com.ionoscloud.dbaaspostgres.auth.*;
import com.ionoscloud.dbaaspostgres.model.*;
import com.ionoscloud.dbaaspostgres.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String clusterId = "498ae72f-411f-11eb-9d07-046c59cc737e"; // String | The unique ID of the cluster.
    User user = new User(); // User | 
    try {
      UserResource result = apiInstance.usersPost(clusterId, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersPost");
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
| **user** |  [**User**](../models/User.md)|  |

### Return type

[**UserResource**](../models/UserResource.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

