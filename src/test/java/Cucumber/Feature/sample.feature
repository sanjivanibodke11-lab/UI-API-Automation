Feature: This is a sample Feature file

  @Smoke @Regression @NIT
  Scenario: Sample Scenario
    Given the user opens the application
    When the user enters the credentials
    And the user clicks on login
    Then the user must be able to login

  @Sanity @Regression
  Scenario: Sample Scenario2
    Given the user opens the application
    When the user enters incorrect credentials
    But the user clicks on login
    Then the user must not be able to login

    @Params
  Scenario: Parameters
    Given the user opens the application
    When the user enters the username as "nit9amSep2026"
    And the user enters the password as "0123456789"
    And the user clicks on login
    Then the user must be able to login