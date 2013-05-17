package com.ikkerens.apifetcher.methods;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.StringEntity;

import com.ikkerens.apifetcher.ApiMethod;

public class Get extends HttpGet implements ApiMethod {

    public String getHeader() {
        return null;
    }

    public HttpEntity getBody( Map< String, Object > arguments ) throws UnsupportedEncodingException {
        String returnValue = "";

        for ( Entry< String, Object > entry : arguments.entrySet() )
            returnValue += ( !returnValue.equals( "" ) ? "&" : "" ) + entry.getKey() + "=" + URLEncoder.encode( entry.getValue().toString(), "UTF-8" );

        return new StringEntity( returnValue );
    }

}
