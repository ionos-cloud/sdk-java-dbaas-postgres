

# ClusterProperties

Properties of a database cluster
## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **displayName** | **String** | The friendly name of your cluster. |  [optional] |
| **postgresVersion** | **String** | The PostgreSQL version of your cluster. |  [optional] |
| **location** | [**Location**](Location.md) |  |  [optional] |
| **backupLocation** | [**BackupLocation**](BackupLocation.md) |  |  [optional] |
| **instances** | **Integer** | The total number of instances in the cluster (one master and n-1 standbys).  |  [optional] |
| **ram** | **Integer** | The amount of memory per instance in megabytes. Has to be a multiple of 1024. |  [optional] |
| **cores** | **Integer** | The number of CPU cores per instance. |  [optional] |
| **storageSize** | **Integer** | The amount of storage per instance in megabytes. |  [optional] |
| **storageType** | [**StorageType**](StorageType.md) |  |  [optional] |
| **connections** | [**List&lt;Connection&gt;**](Connection.md) |  |  [optional] |
| **maintenanceWindow** | [**MaintenanceWindow**](MaintenanceWindow.md) |  |  [optional] |
| **synchronizationMode** | [**SynchronizationMode**](SynchronizationMode.md) |  |  [optional] |


