Feature: Login Funcitonalty

  Background: Navigate to OrangeHRM

    Given Navigate to OrangeHRm
    When Enter username and passworD
    Then click login buttonn

  Scenario: Navigate to Admin

    Given Navigate to Admin page
    When click on Add button
    Then enter an invalid name
    And verify that notification messages