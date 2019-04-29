
Feature: add product as per examples
  
  Scenario: product added successfully
    Given open webbrowsers
    And open exacts url
    And login with adminn usernam and password
    |username|password|
    |admin|password456|
    And enter category
    |value|
    |hassan|
    |ckm|
    And enter subcategory
    |variable|
    |cool|
    |hot|
    And Add product
    |name|
    |volleyball|
    |basketball|
    And add image
    |img|
    |screenshot(3)|
    |screenshot(4)|
    And sign out from appp
    
   