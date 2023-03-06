/*
 * IONOS DBaaS PostgreSQL REST API
 * An enterprise-grade Database is provided as a Service (DBaaS) solution that can be managed through a browser-based \"Data Center Designer\" (DCD) tool or via an easy to use API.  The API allows you to create additional PostgreSQL database clusters or modify existing ones. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionoscloud.dbaaspostgres.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * The restore request.
 */
@ApiModel(description = "The restore request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-06T18:14:39.019Z[Etc/UTC]")

public class CreateRestoreRequest {
  
  public static final String SERIALIZED_NAME_BACKUP_ID = "backupId";
  @SerializedName(SERIALIZED_NAME_BACKUP_ID)
  private String backupId;


  public static final String SERIALIZED_NAME_RECOVERY_TARGET_TIME = "recoveryTargetTime";
  @SerializedName(SERIALIZED_NAME_RECOVERY_TARGET_TIME)
  private OffsetDateTime recoveryTargetTime;

  

  public CreateRestoreRequest backupId(String backupId) {
    
    this.backupId = backupId;
    return this;
  }

   /**
   * The unique ID of the backup you want to restore.
   * @return backupId
  **/
  @ApiModelProperty(example = "dcd31531-3ac8-11eb-9feb-046c59cc737e", required = true, value = "The unique ID of the backup you want to restore.")

  public String getBackupId() {
    return backupId;
  }


  public void setBackupId(String backupId) {
    this.backupId = backupId;
  }



  public CreateRestoreRequest recoveryTargetTime(OffsetDateTime recoveryTargetTime) {
    
    this.recoveryTargetTime = recoveryTargetTime;
    return this;
  }

   /**
   * If this value is supplied as ISO 8601 timestamp, the backup will be replayed up until the given timestamp. If empty, the backup will be applied completely. 
   * @return recoveryTargetTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-12-10T13:37:50+01:00", value = "If this value is supplied as ISO 8601 timestamp, the backup will be replayed up until the given timestamp. If empty, the backup will be applied completely. ")

  public OffsetDateTime getRecoveryTargetTime() {
    return recoveryTargetTime;
  }


  public void setRecoveryTargetTime(OffsetDateTime recoveryTargetTime) {
    this.recoveryTargetTime = recoveryTargetTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRestoreRequest createRestoreRequest = (CreateRestoreRequest) o;
    return Objects.equals(this.backupId, createRestoreRequest.backupId) && Objects.equals(this.recoveryTargetTime, createRestoreRequest.recoveryTargetTime);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRestoreRequest {\n");
    
    sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");

    sb.append("    recoveryTargetTime: ").append(toIndentedString(recoveryTargetTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

