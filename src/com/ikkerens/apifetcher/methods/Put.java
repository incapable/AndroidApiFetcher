package com.ikkerens.apifetcher.methods;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.message.BasicNameValuePair;

import com.ikkerens.apifetcher.ApiMethod;

public class Put extends HttpPut implements ApiMethod {

    public String getHeader() {
        return "application/x-www-form-urlencoded";
    }

    public HttpEntity getBody( Map< String, Object > arguments ) throws UnsupportedEncodingException, IOException {
        ArrayList< NameValuePair > nameValuePairs = new ArrayList< NameValuePair >();

        for ( Entry< String, Object > entry : arguments.entrySet() )
            nameValuePairs.add( new BasicNameValuePair( entry.getKey(), entry.getValue().toString() ) );

        nameValuePairs.trimToSize();
        return new UrlEncodedFormEntity( nameValuePairs );
    }

}
