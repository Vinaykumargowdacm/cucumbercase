
Feature: Add specific product to app

 
  Scenario: product added succesfully
    Given open web browser
    And open specific url
    And login with proper credential username and password
    |username|password|
    |Admin|password456|
    And add new product
    |category name|Sub category name|Product Name |Price|Quantity|Brand|Description|
    |Electronics  |Head Phone       |Jabra 11     |$300 |10      |Jabra|best use for office|
    And sign out