Feature: Organisation - Location - Plus Button Middle - Add Location

  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    When Clicks on SignIn button
    And User clicks on the Menu button as "menu"
    Then User clicks on the Organisation link
    When User clicks on the Organisation link item as "text"
    And User clicks on the Organisation link menu item as "textItem"
    When User clicks on the Location link
    And User clicks on the Location Plus button
    Then User enters the Location Name as "HG"
    And User selects their Country
    #Then Clicks on Make this primary location
    When User enters their City as "Johannesburg"
    When User clicks Create button







