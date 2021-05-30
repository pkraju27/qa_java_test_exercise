package com.haud.qa.exercise.Util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ApiTestProperties {
   FileReader reader;
   private String baseUrl;
   private String apiKey;
   private String connectionTimeOut;

   public String getBaseUrl() {
      return baseUrl;
   }

   public void setBaseUrl(String baseUrl) {
      this.baseUrl = baseUrl;
   }

   public String getApiKey() {
      return apiKey;
   }

   public void setApiKey(String apiKey) {
      this.apiKey = apiKey;
   }

   public String getConnectionTimeOut() {
      return connectionTimeOut;
   }

   public void setConnectionTimeOut(String connectionTimeOut) {
      this.connectionTimeOut = connectionTimeOut;
   }


   public ApiTestProperties()
   {
      try {
         reader = new FileReader("src/test/resources/ApiTest.properties");
         Properties prop = new Properties();
         prop.load(reader);
         setBaseUrl(prop.getProperty("baseUrl"));
         setApiKey(prop.getProperty("ApiKey"));
         setConnectionTimeOut(prop.getProperty("connectionTimeOut"));
      } catch (IOException e) {
         e.printStackTrace();
      }
   }


}
