Feature: Candidates - Three Dots Top - Link Client Contact

  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io/"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    And Clicks on SignIn button
    When User clicks on search button
    Then Searches for Candidate name as "New"
    And User clicks on Candidate "New QA 3"
    #Then Clicks on three dots on top right (BLOCKER)

    When User Links Client contact
    And Searches for Client contact as "new QA 3"
    Then Selects contact
    And Clicks on button Select
