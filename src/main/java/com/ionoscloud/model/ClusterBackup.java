/*
 * IONOS DBaaS REST API
 * An enterprise-grade Database is provided as a Service (DBaaS) solution that can be managed through a browser-based \"Data Center Designer\" (DCD) tool or via an easy to use API.  The API allows you to create additional database clusters or modify existing ones. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive. 
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionoscloud.model;

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
 * a backup object
 */
@ApiModel(description = "a backup object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-10T12:47:42.757Z[Etc/UTC]")

public class ClusterBackup {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CLUSTER_ID = "clusterId";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private String clusterId;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_EARLIEST_RECOVERY_TARGET_TIME = "earliestRecoveryTargetTime";
  @SerializedName(SERIALIZED_NAME_EARLIEST_RECOVERY_TARGET_TIME)
  private OffsetDateTime earliestRecoveryTargetTime;


  public ClusterBackup id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "498ae72f-411f-11eb-9d07-046c59cc737e", value = "The unique ID of the resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ClusterBackup clusterId(String clusterId) {
    
    this.clusterId = clusterId;
    return this;
  }

   /**
   * The unique ID of the cluster.
   * @return clusterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "498ae72f-411f-11eb-9d07-046c59cc737e", value = "The unique ID of the cluster.")

  public String getClusterId() {
    return clusterId;
  }


  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }


  public ClusterBackup version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The PostgreSQL version this backup was created from.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "The PostgreSQL version this backup was created from.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public ClusterBackup isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Whether a cluster currently backs up data to this backup.
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether a cluster currently backs up data to this backup.")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public ClusterBackup earliestRecoveryTargetTime(OffsetDateTime earliestRecoveryTargetTime) {
    
    this.earliestRecoveryTargetTime = earliestRecoveryTargetTime;
    return this;
  }

   /**
   * The oldest available timestamp to which you can restore.
   * @return earliestRecoveryTargetTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-23T01:21:10Z", value = "The oldest available timestamp to which you can restore.")

  public OffsetDateTime getEarliestRecoveryTargetTime() {
    return earliestRecoveryTargetTime;
  }


  public void setEarliestRecoveryTargetTime(OffsetDateTime earliestRecoveryTargetTime) {
    this.earliestRecoveryTargetTime = earliestRecoveryTargetTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterBackup clusterBackup = (ClusterBackup) o;
    return Objects.equals(this.id, clusterBackup.id) && Objects.equals(this.clusterId, clusterBackup.clusterId) && Objects.equals(this.version, clusterBackup.version) && Objects.equals(this.isActive, clusterBackup.isActive) && Objects.equals(this.earliestRecoveryTargetTime, clusterBackup.earliestRecoveryTargetTime);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterBackup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    earliestRecoveryTargetTime: ").append(toIndentedString(earliestRecoveryTargetTime)).append("\n");
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
