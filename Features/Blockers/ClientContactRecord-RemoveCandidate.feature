Feature: Client Contact Record - Remove Candidate

  Scenario: Successful removes candidate
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io/"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    And Clicks on SignIn button
    And User clicks on the Menu button as "menu"
    Then User clicks on the Client link
    When User clicks on the Client link item as "text"
    #And User clicks on ThreE Dots button (BLOCKER)
    Then clicks on unlink Candidate button