Feature: Login Feature

  Background:

    Given Navigate to OpenSource
    When Enter username and password then click
    Then User should login successfully

  Scenario:

    Given User must click on Admin Feature
    When Click on Add Button
    Then fill up the form by entering the required info to the all input boxes
    And Click on Save Button
    Then Verify that ESS – user name is added on the list