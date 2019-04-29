
Feature:  add new product to the testmeapp
this is feature of the testmeapp

  Scenario: add of product
   Given call the web browser
   And enter the url
   And enter the valid password and username
       |username|password   |
       |admin   |password456|
   And ADd new product
   And Fill all mandatory fields
   And click add product

    