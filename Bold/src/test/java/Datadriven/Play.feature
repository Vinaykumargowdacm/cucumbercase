Feature: Facebook login
  I want to use this template for my feature file

  @tag1
  Scenario: Facebook login done
    Given i enter url
    And i enter username and password
      | username | password |
      | Vinay    | acb@123  |
      | Manish   | sdf@456  |
      | Ram      | tyu@344  |
    When i click on login
    Then home page is displayed
