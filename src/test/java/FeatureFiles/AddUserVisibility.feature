Feature: Add User Visibility
  Scenario: Visibility of Add user
    Given Navigate to OpenSource
    When Enter username and password and click login button
    Then User should login successfully
    Given Click on Admin Button
    When Click on Add Button
    And Add User Text should be displayed