

# CreateClusterProperties

Properties with all data needed to create a new PostgreSQL cluster. 
## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **postgresVersion** | **String** | The PostgreSQL version of your cluster. |  |
| **instances** | **Integer** | The total number of instances in the cluster (one master and n-1 standbys).  |  |
| **cores** | **Integer** | The number of CPU cores per instance. |  |
| **ram** | **Integer** | The amount of memory per instance in megabytes. Has to be a multiple of 1024. |  |
| **storageSize** | **Integer** | The amount of storage per instance in megabytes. |  |
| **storageType** | [**StorageType**](StorageType.md) |  |  |
| **connections** | [**List&lt;Connection&gt;**](Connection.md) |  |  |
| **location** | **String** | The physical location where the cluster will be created. This will be where all of your instances live. Property cannot be modified after datacenter creation.  |  |
| **backupLocation** | **String** | The S3 location where the backups will be stored. |  [optional] |
| **displayName** | **String** | The friendly name of your cluster. |  |
| **maintenanceWindow** | [**MaintenanceWindow**](MaintenanceWindow.md) |  |  [optional] |
| **credentials** | [**DBUser**](DBUser.md) |  |  |
| **synchronizationMode** | [**SynchronizationMode**](SynchronizationMode.md) |  |  |
| **fromBackup** | [**CreateRestoreRequest**](CreateRestoreRequest.md) |  |  [optional] |


