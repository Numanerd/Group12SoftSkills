Feature: Admin password functionality

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    And Navigate to Admin panel
    And Click to Add Button

    Scenario: Try short password
      When Enter short password
      Then At password should message

      Scenario: Try lowercase password
        When Enter lowercase password
        Then At password try different message



