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


package com.ionoscloud.api;

import com.ionoscloud.ApiCallback;
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.Pair;
import com.ionoscloud.ProgressRequestBody;
import com.ionoscloud.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.ionoscloud.model.ClusterLogs;
import com.ionoscloud.model.ErrorResponse;
import org.threeten.bp.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogsApi {
    private ApiClient localVarApiClient;

    public LogsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LogsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for clusterLogsGet
     * @param clusterId The unique ID of the cluster. (required)
     * @param start The start time for the query in RFC3339 format. Must not be more than 30 days ago but before the end parameter. The default is 30 days ago. (optional)
     * @param end The end time for the query in RFC3339 format. Must not be greater than now. The default is the current timestamp. (optional)
     * @param direction The direction in which to scan through the logs. The logs are returned in order of the direction. (optional, default to BACKWARD)
     * @param limit The maximal number of log lines to return.  If the limit is reached then log lines will be cut at the end (respecting the scan direction). (optional, default to 100)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - application/problem+json <br>  </td></tr>
     </table>
     */
    public okhttp3.Call clusterLogsGetCall(String clusterId, OffsetDateTime start, OffsetDateTime end, String direction, Integer limit, final ApiCallback<ClusterLogs> _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/clusters/{clusterId}/logs"
            .replaceAll("\\{" + "clusterId" + "\\}", localVarApiClient.escapeString(clusterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (start != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start", start));
        }

        if (end != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end", end));
        }

        if (direction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("direction", direction));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

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
    private okhttp3.Call clusterLogsGetValidateBeforeCall(String clusterId, OffsetDateTime start, OffsetDateTime end, String direction, Integer limit, final ApiCallback<ClusterLogs> _callback) throws ApiException {
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling clusterLogsGet(Async)");
        }
        

        okhttp3.Call localVarCall = clusterLogsGetCall(clusterId, start, end, direction, limit, _callback);
        return localVarCall;

    }

    /**
     * Get logs of your cluster
     * Retrieves PostgreSQL logs based on the given parameters.
     * @param clusterId The unique ID of the cluster. (required)
     * @param start The start time for the query in RFC3339 format. Must not be more than 30 days ago but before the end parameter. The default is 30 days ago. (optional)
     * @param end The end time for the query in RFC3339 format. Must not be greater than now. The default is the current timestamp. (optional)
     * @param direction The direction in which to scan through the logs. The logs are returned in order of the direction. (optional, default to BACKWARD)
     * @param limit The maximal number of log lines to return.  If the limit is reached then log lines will be cut at the end (respecting the scan direction). (optional, default to 100)
     * @return ClusterLogs
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - application/problem+json <br>  </td></tr>
     </table>
     */
    public ClusterLogs clusterLogsGet(String clusterId, OffsetDateTime start, OffsetDateTime end, String direction, Integer limit) throws ApiException {
        ApiResponse<ClusterLogs> localVarResp = clusterLogsGetWithHttpInfo(clusterId, start, end, direction, limit);
        return localVarResp.getData();
    }

    /**
     * Get logs of your cluster
     * Retrieves PostgreSQL logs based on the given parameters.
     * @param clusterId The unique ID of the cluster. (required)
     * @param start The start time for the query in RFC3339 format. Must not be more than 30 days ago but before the end parameter. The default is 30 days ago. (optional)
     * @param end The end time for the query in RFC3339 format. Must not be greater than now. The default is the current timestamp. (optional)
     * @param direction The direction in which to scan through the logs. The logs are returned in order of the direction. (optional, default to BACKWARD)
     * @param limit The maximal number of log lines to return.  If the limit is reached then log lines will be cut at the end (respecting the scan direction). (optional, default to 100)
     * @return ApiResponse&lt;ClusterLogs&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - application/problem+json <br>  </td></tr>
     </table>
     */
    public ApiResponse<ClusterLogs> clusterLogsGetWithHttpInfo(String clusterId, OffsetDateTime start, OffsetDateTime end, String direction, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = clusterLogsGetValidateBeforeCall(clusterId, start, end, direction, limit, null);
        Type localVarReturnType = new TypeToken<ClusterLogs>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get logs of your cluster (asynchronously)
     * Retrieves PostgreSQL logs based on the given parameters.
     * @param clusterId The unique ID of the cluster. (required)
     * @param start The start time for the query in RFC3339 format. Must not be more than 30 days ago but before the end parameter. The default is 30 days ago. (optional)
     * @param end The end time for the query in RFC3339 format. Must not be greater than now. The default is the current timestamp. (optional)
     * @param direction The direction in which to scan through the logs. The logs are returned in order of the direction. (optional, default to BACKWARD)
     * @param limit The maximal number of log lines to return.  If the limit is reached then log lines will be cut at the end (respecting the scan direction). (optional, default to 100)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type, 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - application/problem+json <br>  </td></tr>
     </table>
     */
    public okhttp3.Call clusterLogsGetAsync(String clusterId, OffsetDateTime start, OffsetDateTime end, String direction, Integer limit, final ApiCallback<ClusterLogs> _callback) throws ApiException {

        okhttp3.Call localVarCall = clusterLogsGetValidateBeforeCall(clusterId, start, end, direction, limit, _callback);
        Type localVarReturnType = new TypeToken<ClusterLogs>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
