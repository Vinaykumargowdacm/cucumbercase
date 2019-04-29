Feature: sign in process

  @unit
  Scenario: Sign in complete
    Given press name "abd"
    And press security " abc@123"
    When click login
    Then large page

  @smoke
  Scenario: Sign in comple
    Given press name
    And press security
    When click login
    Then large page
