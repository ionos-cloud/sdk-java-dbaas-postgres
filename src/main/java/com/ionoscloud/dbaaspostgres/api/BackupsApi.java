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


package com.ionoscloud.dbaaspostgres.api;

import com.ionoscloud.dbaaspostgres.ApiCallback;
import com.ionoscloud.dbaaspostgres.ApiClient;
import com.ionoscloud.dbaaspostgres.ApiException;
import com.ionoscloud.dbaaspostgres.ApiResponse;
import com.ionoscloud.dbaaspostgres.Configuration;
import com.ionoscloud.dbaaspostgres.Pair;
import com.ionoscloud.dbaaspostgres.ProgressRequestBody;
import com.ionoscloud.dbaaspostgres.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.ionoscloud.dbaaspostgres.model.BackupResponse;
import com.ionoscloud.dbaaspostgres.model.ClusterBackupList;
import com.ionoscloud.dbaaspostgres.model.ErrorResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BackupsApi {
    private ApiClient localVarApiClient;

    public BackupsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BackupsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for clusterBackupsGet
     * @param clusterId The unique ID of the cluster. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - application/problem+json <br>  </td></tr>
     </table>
     */
    public okhttp3.Call clusterBackupsGetCall(String clusterId, final ApiCallback<ClusterBackupList> _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/clusters/{clusterId}/backups"
            .replaceAll("\\{" + "clusterId" + "\\}", localVarApiClient.escapeString(clusterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call clusterBackupsGetValidateBeforeCall(String clusterId, final ApiCallback<ClusterBackupList> _callback) throws ApiException {
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling clusterBackupsGet(Async)");
        }
        

        okhttp3.Call localVarCall = clusterBackupsGetCall(clusterId, _callback);
        return localVarCall;

    }

    /**
     * List backups of cluster
     * Retrieves a list of all backups of the given PostgreSQL cluster.
     * @param clusterId The unique ID of the cluster. (required)
     * @return ClusterBackupList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - application/problem+json <br>  </td></tr>
     </table>
     */
    public ClusterBackupList clusterBackupsGet(String clusterId) throws ApiException {
        ApiResponse<ClusterBackupList> localVarResp = clusterBackupsGetWithHttpInfo(clusterId);
        return localVarResp.getData();
    }

    /**
     * List backups of cluster
     * Retrieves a list of all backups of the given PostgreSQL cluster.
     * @param clusterId The unique ID of the cluster. (required)
     * @return ApiResponse&lt;ClusterBackupList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - application/problem+json <br>  </td></tr>
     </table>
     */
    public ApiResponse<ClusterBackupList> clusterBackupsGetWithHttpInfo(String clusterId) throws ApiException {
        okhttp3.Call localVarCall = clusterBackupsGetValidateBeforeCall(clusterId, null);
        Type localVarReturnType = new TypeToken<ClusterBackupList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List backups of cluster (asynchronously)
     * Retrieves a list of all backups of the given PostgreSQL cluster.
     * @param clusterId The unique ID of the cluster. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - application/problem+json <br>  </td></tr>
     </table>
     */
    public okhttp3.Call clusterBackupsGetAsync(String clusterId, final ApiCallback<ClusterBackupList> _callback) throws ApiException {

        okhttp3.Call localVarCall = clusterBackupsGetValidateBeforeCall(clusterId, _callback);
        Type localVarReturnType = new TypeToken<ClusterBackupList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for clustersBackupsFindById
     * @param backupId The unique ID of the backup. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - application/problem+json <br>  </td></tr>
     </table>
     */
    public okhttp3.Call clustersBackupsFindByIdCall(String backupId, final ApiCallback<BackupResponse> _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/clusters/backups/{backupId}"
            .replaceAll("\\{" + "backupId" + "\\}", localVarApiClient.escapeString(backupId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call clustersBackupsFindByIdValidateBeforeCall(String backupId, final ApiCallback<BackupResponse> _callback) throws ApiException {
        
        // verify the required parameter 'backupId' is set
        if (backupId == null) {
            throw new ApiException("Missing the required parameter 'backupId' when calling clustersBackupsFindById(Async)");
        }
        

        okhttp3.Call localVarCall = clustersBackupsFindByIdCall(backupId, _callback);
        return localVarCall;

    }

    /**
     * Fetch a cluster backup
     * Retrieve a PostgreSQL cluster backup by using its ID. This value can be found when you GET a list of PostgreSQL cluster backups. 
     * @param backupId The unique ID of the backup. (required)
     * @return BackupResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - application/problem+json <br>  </td></tr>
     </table>
     */
    public BackupResponse clustersBackupsFindById(String backupId) throws ApiException {
        ApiResponse<BackupResponse> localVarResp = clustersBackupsFindByIdWithHttpInfo(backupId);
        return localVarResp.getData();
    }

    /**
     * Fetch a cluster backup
     * Retrieve a PostgreSQL cluster backup by using its ID. This value can be found when you GET a list of PostgreSQL cluster backups. 
     * @param backupId The unique ID of the backup. (required)
     * @return ApiResponse&lt;BackupResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - application/problem+json <br>  </td></tr>
     </table>
     */
    public ApiResponse<BackupResponse> clustersBackupsFindByIdWithHttpInfo(String backupId) throws ApiException {
        okhttp3.Call localVarCall = clustersBackupsFindByIdValidateBeforeCall(backupId, null);
        Type localVarReturnType = new TypeToken<BackupResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Fetch a cluster backup (asynchronously)
     * Retrieve a PostgreSQL cluster backup by using its ID. This value can be found when you GET a list of PostgreSQL cluster backups. 
     * @param backupId The unique ID of the backup. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - application/problem+json <br>  </td></tr>
     </table>
     */
    public okhttp3.Call clustersBackupsFindByIdAsync(String backupId, final ApiCallback<BackupResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = clustersBackupsFindByIdValidateBeforeCall(backupId, _callback);
        Type localVarReturnType = new TypeToken<BackupResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for clustersBackupsGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - application/problem+json <br>  </td></tr>
     </table>
     */
    public okhttp3.Call clustersBackupsGetCall(final ApiCallback<ClusterBackupList> _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/clusters/backups";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call clustersBackupsGetValidateBeforeCall(final ApiCallback<ClusterBackupList> _callback) throws ApiException {
        

        okhttp3.Call localVarCall = clustersBackupsGetCall(_callback);
        return localVarCall;

    }

    /**
     * List cluster backups
     * Retrieves a list of all PostgreSQL cluster backups.
     * @return ClusterBackupList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - application/problem+json <br>  </td></tr>
     </table>
     */
    public ClusterBackupList clustersBackupsGet() throws ApiException {
        ApiResponse<ClusterBackupList> localVarResp = clustersBackupsGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * List cluster backups
     * Retrieves a list of all PostgreSQL cluster backups.
     * @return ApiResponse&lt;ClusterBackupList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - application/problem+json <br>  </td></tr>
     </table>
     */
    public ApiResponse<ClusterBackupList> clustersBackupsGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = clustersBackupsGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<ClusterBackupList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List cluster backups (asynchronously)
     * Retrieves a list of all PostgreSQL cluster backups.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - application/problem+json <br>  </td></tr>
     </table>
     */
    public okhttp3.Call clustersBackupsGetAsync(final ApiCallback<ClusterBackupList> _callback) throws ApiException {

        okhttp3.Call localVarCall = clustersBackupsGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<ClusterBackupList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}