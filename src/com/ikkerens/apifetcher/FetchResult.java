package com.ikkerens.apifetcher;

public interface FetchResult {
    /**
     * Called when the ApiFetcher action ends in a success
     * 
     * @param result
     *            The result
     */
    public void onSuccess( String result ) throws Exception;

    /**
     * Called when the ApiFetcher action fails
     */
    public void onFail() throws Exception;
}
