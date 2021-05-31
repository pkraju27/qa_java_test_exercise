package com.haud.qa.exercise.stepDefinations;

import com.haud.qa.exercise.Log;
import com.haud.qa.exercise.Util.ApiHelper;
import com.haud.qa.exercise.Util.ApiResources;
import com.haud.qa.exercise.Util.GetProperty;
import com.haud.qa.exercise.Util.TestDataBuild;
import com.haud.qa.exercise.pojo.PetDetails;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.Assert;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class StepDefination extends ApiHelper {
   RequestSpecification requestSpecification;
   ResponseSpecification responseSpecification;
   Response postResponse;
   Response getResponse;
   TestDataBuild testData =new TestDataBuild();
   String petId;
   @Given("Add Pet Payload with {string}  {string} {string}")
   public void add_place_payload_with(String name, String category, String tag) throws IOException {
      // Building payload for add new pet to pet store
      requestSpecification=given().spec(requestSpecification())
         .body(testData.createPetPayLoad(name,category,tag));
   }
   @When("user calls {string} with {string} http request")
   public void user_calls_with_http_request(String resource, String method) {

      // Write code here that turns the phrase above into concrete actions
      responseSpecification =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
      if(method.equalsIgnoreCase("POST"))
         postResponse =requestSpecification.when().post(ApiResources.createPetApi);
      else if(method.equalsIgnoreCase("GET"))
         getResponse =requestSpecification.when().get(ApiResources.getPetApi+resource);

   }
   @Then("the API call got returned status code 200")
   public void the_api_call_got_returned_status_code() {
      // Write code here that turns the phrase above into concrete actions
      Assert.assertEquals(postResponse.getStatusCode(),200);

   }
   @Then("And verify pet_api created matches to {string} using {string}")
   public void and_verify_pet_api_created_matches_to_using(String expectedName, String resource) throws IOException {
      // Verification
      petId=getJsonPath(postResponse,"id");
      requestSpecification=given().spec(requestSpecification());
      user_calls_with_http_request(petId,"GET");
      String actualName=getJsonPath(getResponse,"name");
      Assert.assertEquals(actualName,expectedName);

   }
   @Then("verify get and post response")
   public void verify_get_and_post_response() {
      PetDetails createdPet = postResponse.as(PetDetails.class);
      PetDetails receivedPet = getResponse.as(PetDetails.class);
      Assert.assertEquals(createdPet.getName(),receivedPet.getName());
      Assert.assertEquals(createdPet.getCategory().getName(),receivedPet.getCategory().getName());
      Assert.assertEquals(createdPet.getTags().get(0).getName(),receivedPet.getTags().get(0).getName());
   }
}
