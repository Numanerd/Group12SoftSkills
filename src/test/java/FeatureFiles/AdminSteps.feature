Feature: Admin username functionality

  Background:

    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    And Navigate to Admin panel
    And Click to Add Button


  Scenario: Unavailable admin account

    When Add an admin account which is already taken
    Then Already exists message should be displayed


  Scenario: Username character size

    When Add a username that has less than five characters
    Then At least five chars message should be displayed