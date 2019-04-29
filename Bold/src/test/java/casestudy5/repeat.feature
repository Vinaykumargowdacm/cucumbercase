
Feature: add product as per given
  
  Scenario: added success
    Given open proper web browser
    And open  url
    And enter  username and password
    |username|password|
    |admin   |password456|
    And enter "Electronics" , "Head Phone" , "Jabra 100" , "$300" , "10" , "Jabra" and "office work" 
   And  close app    
   
