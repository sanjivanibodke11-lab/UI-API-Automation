Feature: Scenario Outline Example

  @ScenarioOutline
  Scenario Outline: A Sample Scenario Outline
    Given the user opens the application
    When the user enters the username as "<username>"
    And the user enters the password as "<password>"
    And the user clicks on login
    Then the user must be able to login

    @Examples
    Examples:
      | username | password |
      | abc      | 123      |
      | bcd      | 234      |
      | cde      | 345      |
      | def      | 456      |