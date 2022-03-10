

# CreateRestoreRequest

The restore request.
## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **backupId** | **String** | The unique ID of the backup you want to restore. |  |
| **recoveryTargetTime** | [**OffsetDateTime**](OffsetDateTime.md) | If this value is supplied as ISO 8601 timestamp, the backup will be replayed up until the given timestamp. If empty, the backup will be applied completely.  |  [optional] |


