Feature: Notification Messages

  Scenario: Check the Notification Messages

    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully
    Given Click on Admin Button
      When Click on Add Button
      Then Click on Save Button
      And Notification Messages on Red Should Be Displayed


