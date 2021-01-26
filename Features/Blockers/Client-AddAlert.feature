Feature: Client - Add Alert

  Scenario: Successful creates New list
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io/"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    And Clicks on SignIn button
    And User clicks on the Menu button as "menu"
    Then User clicks on the Client link
    When User clicks on the Client link item as "text"
    #And User clicks on the Top Plus button (BLOCKER)
    Then Clicks on Add Alert
    When User selects Alert Type
    And User adds alert to record


