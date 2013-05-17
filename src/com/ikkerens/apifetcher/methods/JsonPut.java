package com.ikkerens.apifetcher.methods;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.json.JSONException;
import org.json.JSONObject;

import com.ikkerens.apifetcher.ApiMethod;

public class JsonPut extends HttpPut implements ApiMethod {

    public String getHeader() {
        return "application/json";
    }

    public HttpEntity getBody( Map< String, Object > arguments ) throws UnsupportedEncodingException, JSONException {
        JSONObject jObj = new JSONObject();

        for ( Entry< String, Object > entry : arguments.entrySet() )
            jObj.put( entry.getKey(), entry.getValue().toString() );

        return new StringEntity( jObj.toString() );
    }

}
