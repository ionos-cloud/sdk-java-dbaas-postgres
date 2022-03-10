# RestoresApi

All URIs are relative to *https://api.ionos.com/databases/postgresql*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**clusterRestorePost**](RestoresApi.md#clusterrestorepost) | **POST** /clusters/{clusterId}/restore | In-place restore of a cluster |


<a name="clusterRestorePost"></a>
# **clusterRestorePost**
> clusterRestorePost(clusterId, createRestoreRequest)

In-place restore of a cluster

Triggers an in-place restore of the given PostgreSQL.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.RestoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    RestoresApi apiInstance = new RestoresApi(defaultClient);
    String clusterId = "clusterId_example"; // String | The unique ID of the cluster.
    CreateRestoreRequest createRestoreRequest = new CreateRestoreRequest(); // CreateRestoreRequest | The restore request to create.
    try {
      apiInstance.clusterRestorePost(clusterId, createRestoreRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling RestoresApi#clusterRestorePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clusterId** | **String**| The unique ID of the cluster. |
| **createRestoreRequest** |  [**CreateRestoreRequest**](CreateRestoreRequest.md)| The restore request to create. |

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

