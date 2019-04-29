
Feature: user wants to puchase product
 
  Scenario: purchase sucess
    Given open webdriver
    And open url
    And enter user credential username and password
    |username|password|
    |lalitha|password123|
    And search product
    And make payment
    And  do logout
    