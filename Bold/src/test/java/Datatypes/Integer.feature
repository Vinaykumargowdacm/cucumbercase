
Feature: Paytm service
  @tag1
  Scenario: paytm option
    Given enter user id 12345
    And enter password "abc@123"
    And enter amount 100.50
   
    Then  proceed payment
    And logout

  