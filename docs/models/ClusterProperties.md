

# ClusterProperties

Properties of a database cluster.
## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **displayName** | **String** | The friendly name of your cluster. |  [optional] |
| **postgresVersion** | **String** | The PostgreSQL version of your cluster. |  [optional] |
| **location** | **String** | The physical location where the cluster will be created. This will be where all of your instances live. Property cannot be modified after datacenter creation.  |  [optional] |
| **dnsName** | **String** | The DNS name pointing to your cluster. |  [optional] |
| **backupLocation** | **String** | The S3 location where the backups will be stored. |  [optional] |
| **instances** | **Integer** | The total number of instances in the cluster (one master and n-1 standbys).  |  [optional] |
| **ram** | **Integer** | The amount of memory per instance in megabytes. Has to be a multiple of 1024. |  [optional] |
| **cores** | **Integer** | The number of CPU cores per instance. |  [optional] |
| **storageSize** | **Integer** | The amount of storage per instance in megabytes. |  [optional] |
| **storageType** | [**StorageType**](StorageType.md) |  |  [optional] |
| **connections** | [**List&lt;Connection&gt;**](Connection.md) |  |  [optional] |
| **maintenanceWindow** | [**MaintenanceWindow**](MaintenanceWindow.md) |  |  [optional] |
| **synchronizationMode** | [**SynchronizationMode**](SynchronizationMode.md) |  |  [optional] |


