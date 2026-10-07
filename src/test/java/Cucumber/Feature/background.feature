Feature: Background concept

  Background: Sample Background
    Given the user opens the application

    @Scenario1
  Scenario: Sample Scenario
    When the user enters the credentials
    And the user clicks on login
    Then the user must be able to login

  Scenario: Sample Scenario2
    When the user enters incorrect credentials
    But the user clicks on login
    Then the user must not be able to login