Feature: Organisation -Add To List - New List

  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    When Clicks on SignIn button
    And User click on Menu button as "menu"
    Then User click on Organisation link
    When User click on Organisation link item as "text"
    And User click on Organisation link menu item as "textItem"
    Then User click on Add To List
    When User clicks on the New List button
    And User enters the new Organisation List Name as "New List Org"
    And User clicks on Add

