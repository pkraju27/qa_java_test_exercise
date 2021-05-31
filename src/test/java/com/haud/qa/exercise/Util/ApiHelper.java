package com.haud.qa.exercise.Util;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ApiHelper {
   public String getJsonPath(Response response, String key)
   {
      String resp=response.asString();
      JsonPath js = new JsonPath(resp);
      return js.get(key).toString();
   }
   public static RequestSpecification req;
   public RequestSpecification requestSpecification() throws IOException
   {
      if(req==null)
      {
         PrintStream log =new PrintStream(new FileOutputStream("logging.log"));
         req=new RequestSpecBuilder().setBaseUri(GetProperty.BASE_URL)
            .addFilter(RequestLoggingFilter.logRequestTo(log))
            .addFilter(ResponseLoggingFilter.logResponseTo(log))
            .setContentType(ContentType.JSON).build();
         return req;
      }
      return req;


   }
}

