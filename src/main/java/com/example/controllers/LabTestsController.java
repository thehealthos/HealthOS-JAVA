/*
 * HealthOSLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

import com.example.*;
import com.example.models.*;
import com.example.exceptions.*;
import com.example.http.client.HttpClient;
import com.example.http.client.HttpContext;
import com.example.http.request.HttpRequest;
import com.example.http.response.HttpResponse;
import com.example.http.response.HttpStringResponse;
import com.example.http.client.APICallBack;
import com.example.controllers.syncwrapper.APICallBackCatcher;

public class LabTestsController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static LabTestsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the LabTestsController class 
     */
    public static LabTestsController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new LabTestsController();
            }
        }
        return instance;
    }

    /**
     * Get labtest by id
     * @param    labTestId    Required parameter: Example: 
     * @return    Returns the DynamicResponse response from the API call 
     */
    public DynamicResponse getLabTest(
                final String labTestId
    ) throws Throwable {
        APICallBackCatcher<DynamicResponse> callback = new APICallBackCatcher<DynamicResponse>();
        getLabTestAsync(labTestId, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Get labtest by id
     * @param    labTestId    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void getLabTestAsync(
                final String labTestId,
                final APICallBack<DynamicResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = String.format(Configuration.baseUri, Configuration.host);
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/lab_tests/{lab_test_id}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4639148913383671857L;
            {
                    put( "lab_test_id", labTestId );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4955802888686550144L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
                    put( "host", Configuration.host );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            DynamicResponse _result = new DynamicResponse(_response);

                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * All Lab tests
     * @param    page    Required parameter: Example: 
     * @param    size    Required parameter: Example: 
     * @return    Returns the DynamicResponse response from the API call 
     */
    public DynamicResponse getAllLabTests(
                final int page,
                final int size
    ) throws Throwable {
        APICallBackCatcher<DynamicResponse> callback = new APICallBackCatcher<DynamicResponse>();
        getAllLabTestsAsync(page, size, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * All Lab tests
     * @param    page    Required parameter: Example: 
     * @param    size    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void getAllLabTestsAsync(
                final int page,
                final int size,
                final APICallBack<DynamicResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = String.format(Configuration.baseUri, Configuration.host);
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/lab_tests");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5760624142181648363L;
            {
                    put( "page", page );
                    put( "size", size );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4732033036040890763L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
                    put( "host", Configuration.host );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            DynamicResponse _result = new DynamicResponse(_response);

                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Search a lab test by name
     * @param    labTestQuery    Required parameter: Example: 
     * @return    Returns the DynamicResponse response from the API call 
     */
    public DynamicResponse searchLabTests(
                final String labTestQuery
    ) throws Throwable {
        APICallBackCatcher<DynamicResponse> callback = new APICallBackCatcher<DynamicResponse>();
        searchLabTestsAsync(labTestQuery, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Search a lab test by name
     * @param    labTestQuery    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void searchLabTestsAsync(
                final String labTestQuery,
                final APICallBack<DynamicResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = String.format(Configuration.baseUri, Configuration.host);
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/search/lab_tests/{lab_test_query}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5738339445275911551L;
            {
                    put( "lab_test_query", labTestQuery );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5319203229530644146L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
                    put( "host", Configuration.host );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            DynamicResponse _result = new DynamicResponse(_response);

                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}