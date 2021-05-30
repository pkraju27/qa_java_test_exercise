package com.haud.qa.exercise.Util;

public interface GetProperty {
   ApiTestProperties property = new ApiTestProperties();
   String BASE_URL = property.getBaseUrl();
   String API_KEY = property.getApiKey();
   String CONNECTION_TIMEOUT= property.getConnectionTimeOut();
}
