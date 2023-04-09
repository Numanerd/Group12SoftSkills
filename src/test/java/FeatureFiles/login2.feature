Feature: Login Feature

  Background:

    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    And Navigate to Admin panel
    And Click to Add Button

  Scenario:

    Then fill up the form by entering the required info to the all input boxes
    And Click on Save Button
    Then Verify that ESS – user name is added on the list