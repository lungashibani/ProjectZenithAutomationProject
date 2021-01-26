Feature: Organisation - Add Organisation To List

  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    When Clicks on SignIn button
    And User clicks on Menu button as "menu"
    Then User clicks on Organisation link
    When User clicks on Organisation link item as "text"
    And User clicks on Organisation link menu item as "textItem"
    Then User clicks on Add To List
    When User selects an Organisation
    And User Clicks on Add organisation