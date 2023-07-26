# BackupsApi

All URIs are relative to *https://api.ionos.com/databases/postgresql*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**clusterBackupsGet**](BackupsApi.md#clusterbackupsget) | **GET** /clusters/{clusterId}/backups | List backups of cluster |
| [**clustersBackupsFindById**](BackupsApi.md#clustersbackupsfindbyid) | **GET** /clusters/backups/{backupId} | Fetch a cluster backup |
| [**clustersBackupsGet**](BackupsApi.md#clustersbackupsget) | **GET** /clusters/backups | List cluster backups |


<a name="clusterBackupsGet"></a>
# **clusterBackupsGet**
> ClusterBackupList clusterBackupsGet(clusterId, limit, offset)

List backups of cluster

Retrieves a list of all backups of the given PostgreSQL cluster.

### Example
```java
// Import classes:
import com.ionoscloud.dbaaspostgres.ApiClient;
import com.ionoscloud.dbaaspostgres.ApiException;
import com.ionoscloud.dbaaspostgres.Configuration;
import com.ionoscloud.dbaaspostgres.auth.*;
import com.ionoscloud.dbaaspostgres.model.*;
import com.ionoscloud.dbaaspostgres.api.BackupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    BackupsApi apiInstance = new BackupsApi(defaultClient);
    String clusterId = "498ae72f-411f-11eb-9d07-046c59cc737e"; // String | The unique ID of the cluster.
    Integer limit = 100; // Integer | The maximum number of elements to return. Use together with 'offset' for pagination.
    Integer offset = 0; // Integer | The first element to return. Use together with 'limit' for pagination.
    try {
      ClusterBackupList result = apiInstance.clusterBackupsGet(clusterId, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupsApi#clusterBackupsGet");
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

[**ClusterBackupList**](../models/ClusterBackupList.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="clustersBackupsFindById"></a>
# **clustersBackupsFindById**
> BackupResponse clustersBackupsFindById(backupId)

Fetch a cluster backup

Retrieve a PostgreSQL cluster backup by using its ID. This value can be found when you GET a list of PostgreSQL cluster backups. 

### Example
```java
// Import classes:
import com.ionoscloud.dbaaspostgres.ApiClient;
import com.ionoscloud.dbaaspostgres.ApiException;
import com.ionoscloud.dbaaspostgres.Configuration;
import com.ionoscloud.dbaaspostgres.auth.*;
import com.ionoscloud.dbaaspostgres.model.*;
import com.ionoscloud.dbaaspostgres.api.BackupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    BackupsApi apiInstance = new BackupsApi(defaultClient);
    String backupId = "498ae72f-411f-11eb-9d07-046c59cc737e-4oymiqu-12"; // String | The unique ID of the backup.
    try {
      BackupResponse result = apiInstance.clustersBackupsFindById(backupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupsApi#clustersBackupsFindById");
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
| **backupId** | **String**| The unique ID of the backup. |

### Return type

[**BackupResponse**](../models/BackupResponse.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="clustersBackupsGet"></a>
# **clustersBackupsGet**
> ClusterBackupList clustersBackupsGet(limit, offset)

List cluster backups

Retrieves a list of all PostgreSQL cluster backups.

### Example
```java
// Import classes:
import com.ionoscloud.dbaaspostgres.ApiClient;
import com.ionoscloud.dbaaspostgres.ApiException;
import com.ionoscloud.dbaaspostgres.Configuration;
import com.ionoscloud.dbaaspostgres.auth.*;
import com.ionoscloud.dbaaspostgres.model.*;
import com.ionoscloud.dbaaspostgres.api.BackupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    BackupsApi apiInstance = new BackupsApi(defaultClient);
    Integer limit = 100; // Integer | The maximum number of elements to return. Use together with 'offset' for pagination.
    Integer offset = 0; // Integer | The first element to return. Use together with 'limit' for pagination.
    try {
      ClusterBackupList result = apiInstance.clustersBackupsGet(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupsApi#clustersBackupsGet");
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
| **limit** | **Integer**| The maximum number of elements to return. Use together with &#39;offset&#39; for pagination. | [optional] [default to 100]
| **offset** | **Integer**| The first element to return. Use together with &#39;limit&#39; for pagination. | [optional] [default to 0]

### Return type

[**ClusterBackupList**](../models/ClusterBackupList.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

