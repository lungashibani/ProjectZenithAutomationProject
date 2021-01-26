Feature: Organisation -Edit List

  Scenario: Successfully Edits Organisation list
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    When Clicks on SignIn button
    And User click on Menu button as "menu"
    Then User click on Organisation link
    When User click on Organisation link item as "text"
    And User click on Organisation link menu item as "textItem"
    Then User clicks on the Edit button
    When User edits List Name as "New Test"
    And User clicks on Update edited organisation