# MetadataApi

All URIs are relative to *https://api.ionos.com/databases/postgresql*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**infosVersionGet**](MetadataApi.md#infosversionget) | **GET** /infos/version | Get the current API version |
| [**infosVersionsGet**](MetadataApi.md#infosversionsget) | **GET** /infos/versions | Fetch all API versions |


<a name="infosVersionGet"></a>
# **infosVersionGet**
> APIVersion infosVersionGet()

Get the current API version

Retrieves the current version of the responding API.

### Example
```java
// Import classes:
import com.ionoscloud.dbaaspostgres.ApiClient;
import com.ionoscloud.dbaaspostgres.ApiException;
import com.ionoscloud.dbaaspostgres.Configuration;
import com.ionoscloud.dbaaspostgres.auth.*;
import com.ionoscloud.dbaaspostgres.model.*;
import com.ionoscloud.dbaaspostgres.api.MetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    MetadataApi apiInstance = new MetadataApi(defaultClient);
    try {
      APIVersion result = apiInstance.infosVersionGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#infosVersionGet");
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
This endpoint does not need any parameter.

### Return type

[**APIVersion**](../models/APIVersion.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="infosVersionsGet"></a>
# **infosVersionsGet**
> List&lt;APIVersion&gt; infosVersionsGet()

Fetch all API versions

Retrieves all available versions of the responding API.

### Example
```java
// Import classes:
import com.ionoscloud.dbaaspostgres.ApiClient;
import com.ionoscloud.dbaaspostgres.ApiException;
import com.ionoscloud.dbaaspostgres.Configuration;
import com.ionoscloud.dbaaspostgres.auth.*;
import com.ionoscloud.dbaaspostgres.model.*;
import com.ionoscloud.dbaaspostgres.api.MetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    MetadataApi apiInstance = new MetadataApi(defaultClient);
    try {
      List<APIVersion> result = apiInstance.infosVersionsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#infosVersionsGet");
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
This endpoint does not need any parameter.

### Return type

[**List&lt;APIVersion&gt;**](../models/APIVersion.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

