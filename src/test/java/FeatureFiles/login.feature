Feature: Login Funcitonalty

  Background: Navigate to OrangeHRM

    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    And Navigate to Admin panel
    And Click to Add Button

  Scenario: Navigate to Admin

    Then enter an invalid name
    And verify that notification messages