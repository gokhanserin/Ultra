@ultra
Feature: Testing purchase functionality
  Background:
    Given user should be on the login page


  @ultra1
  Scenario Outline:User can login with correct credentials

    When user enters correct "<userName>" and "<passWord>"
    And click on the login button
    Then user can land on the products page

    Examples:
      | userName      | passWord     |
      | standard_user | secret_sauce |
