Feature: Validating pet store Api's
#
#   Scenario Outline: Verify if pet is created using create Pet Api
#      Given Create pet Payload with "<name>" ,"<category>","<tag>"
#      When user calls "" Create pet Api with "post" http request
#      Then the Api call is success with status code 200
#      And pet details in response body
#      And verify pet added with "<name>" using Get method
   @AddPlace @Regression
   Scenario Outline: Verify if Place is being Successfully added using AddPlaceAPI
      Given Add Pet Payload with "<name>"  "<category>" "<tag>"
      When user calls "createPetApi" with "POST" http request
      Then the API call got returned status code 200
      And And verify pet_api created matches to "<name>" using "getPetAPI"
      And verify get and post response

      Examples:
         | name  | category | tag    |code|
         | simba | dog      | golden |200 |
         |  roxy | dog      | Lab    |200 |

#   Scenario Outline: Get pet by passing pet ID
#      Given Pet id parameter
#      When user calls get pet Api with GET http request
#      Then the Api call is success with status code 200
#      And pet details in response body
#      Examples:
#         | ID   | status code |
#         | 101  | 200         |
#         | -101 | 400         |

