

# PatchClusterProperties

Properties of the payload to change a cluster
## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **cores** | **Integer** | The number of CPU cores per instance. |  [optional] |
| **ram** | **Integer** | The amount of memory per instance in megabytes. Has to be a multiple of 1024. |  [optional] |
| **storageSize** | **Integer** | The amount of storage per instance in megabytes. |  [optional] |
| **connections** | [**List&lt;Connection&gt;**](Connection.md) |  |  [optional] |
| **displayName** | **String** | The friendly name of your cluster. |  [optional] |
| **maintenanceWindow** | [**MaintenanceWindow**](MaintenanceWindow.md) |  |  [optional] |
| **postgresVersion** | **String** | The PostgreSQL version of your cluster. |  [optional] |
| **instances** | **Integer** | The total number of instances in the cluster (one master and n-1 standbys).  |  [optional] |


