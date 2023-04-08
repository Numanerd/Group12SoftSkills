Feature: Notification Messages

  Scenario: Check the Notification Messages

    Given Navigate to OpenSource
    When Enter username and password then click
    Then User should login successfully
    Given Click on Admin Button
      When Click on Add Button
      Then Click on Save Button
      And Notification Messages on Red Should Be Displayed


