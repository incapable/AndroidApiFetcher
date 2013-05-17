package com.ikkerens.apifetcher;

import java.util.Map;

import org.apache.http.HttpEntity;

public interface ApiMethod {
    /**
     * Header to be sent when using this method. (pref hardcoded)
     * 
     * @return The header
     */
    public String getHeader();

    /**
     * The body for POST and JSON requests, or the url in case of a GET.
     * 
     * @param arguments
     *            Arguments bound to this method
     * @return Http ready entity
     * @throws Exception
     *             Throw whatever the hell you want ;)
     */
    public HttpEntity getBody( Map< String, Object > arguments ) throws Exception;
}
