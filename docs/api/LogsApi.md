# LogsApi

All URIs are relative to *https://api.ionos.com/databases/postgresql*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**clusterLogsGet**](LogsApi.md#clusterlogsget) | **GET** /clusters/{clusterId}/logs | Get logs of your cluster |


<a name="clusterLogsGet"></a>
# **clusterLogsGet**
> ClusterLogs clusterLogsGet(clusterId, limit, start, end)

Get logs of your cluster

Retrieves PostgreSQL logs based on the given parameters.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LogsApi apiInstance = new LogsApi(defaultClient);
    String clusterId = "clusterId_example"; // String | The unique ID of the cluster.
    Integer limit = 56; // Integer | The maximal number of log lines to return.
    OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | The start time for the query in RFC3339 format.
    OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | The end time for the query in RFC3339 format.
    try {
      ClusterLogs result = apiInstance.clusterLogsGet(clusterId, limit, start, end);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsApi#clusterLogsGet");
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
| **limit** | **Integer**| The maximal number of log lines to return. | [optional]
| **start** | **OffsetDateTime**| The start time for the query in RFC3339 format. | [optional]
| **end** | **OffsetDateTime**| The end time for the query in RFC3339 format. | [optional]

### Return type

[**ClusterLogs**](../models/ClusterLogs.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

