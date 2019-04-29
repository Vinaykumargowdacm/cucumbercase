
@tag
Feature: Add to cart
  I want to use this template for my feature file

  @tag1
  Scenario: Product search in testmeapp
    Given tester creates webdriver instance
    And open the url
    And enters the credentials and login
      | username  | password    | 
      | lalitha   | password123 | 
      
    And  enter avlue in search and click find button
    And add the product to cart and check out
    And proceed to payment
    And signout from testmeapp
    
    
  