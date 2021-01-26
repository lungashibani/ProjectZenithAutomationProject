Feature: Client - Link Candidate

  Scenario: Successful creates New list
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io/"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    And Clicks on SignIn button
    And User clicks on the Menu button as "menu"
    Then User clicks on the Client link
    When User clicks on the Client link item as "text"
    #And User clicks on the Top Three Dots (BLOCKER)
    Then User clicks on Link Candidate
    When User enters Candidate "DemoCandidate"
    And User clicks on select
