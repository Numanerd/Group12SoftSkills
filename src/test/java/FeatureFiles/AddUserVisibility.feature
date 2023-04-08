Feature: Add User Visibility
  Scenario: Visibility of Add user
    Given Navigate to OpenSource
    When Enter username and password then click
    Then User should login successfully
    Given Click on Admin Button
    When Click on Add Button
    And Add User Text should be displayed