

# ClusterBackup

A backup object.
## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The unique ID of the resource. |  [optional] |
| **clusterId** | **String** | The unique ID of the cluster. |  [optional] |
| **version** | **String** | The PostgreSQL version this backup was created from. |  [optional] |
| **isActive** | **Boolean** | Whether a cluster currently backs up data to this backup. |  [optional] |
| **earliestRecoveryTargetTime** | [**OffsetDateTime**](OffsetDateTime.md) | The oldest available timestamp to which you can restore. |  [optional] |
| **size** | **Integer** | Size of all base backups including the wal size in MB. |  [optional] |
| **location** | **String** | The S3 location where the backups will be stored. |  [optional] |


