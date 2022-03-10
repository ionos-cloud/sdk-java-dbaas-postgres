# BackupsApi

All URIs are relative to *https://api.ionos.com/databases/postgresql*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**clusterBackupsGet**](BackupsApi.md#clusterbackupsget) | **GET** /clusters/{clusterId}/backups | List backups of cluster |
| [**clustersBackupsFindById**](BackupsApi.md#clustersbackupsfindbyid) | **GET** /clusters/backups/{backupId} | Fetch a cluster backup |
| [**clustersBackupsGet**](BackupsApi.md#clustersbackupsget) | **GET** /clusters/backups | List cluster backups |


<a name="clusterBackupsGet"></a>
# **clusterBackupsGet**
> ClusterBackupList clusterBackupsGet(clusterId)

List backups of cluster

Retrieves a list of all backups of the given PostgreSQL cluster.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.BackupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    BackupsApi apiInstance = new BackupsApi(defaultClient);
    String clusterId = "clusterId_example"; // String | The unique ID of the cluster.
    try {
      ClusterBackupList result = apiInstance.clusterBackupsGet(clusterId);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clusterId** | **String**| The unique ID of the cluster. |

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
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.BackupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    BackupsApi apiInstance = new BackupsApi(defaultClient);
    String backupId = "backupId_example"; // String | The unique ID of the backup.
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
> ClusterBackupList clustersBackupsGet()

List cluster backups

Retrieves a list of all PostgreSQL cluster backups.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.BackupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    BackupsApi apiInstance = new BackupsApi(defaultClient);
    try {
      ClusterBackupList result = apiInstance.clustersBackupsGet();
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

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterBackupList**](../models/ClusterBackupList.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

