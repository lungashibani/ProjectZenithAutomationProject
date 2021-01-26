Feature: Candidate-Personal-UpdateAddress

  Scenario: Candidate Successful Adds Qualification
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io/"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    And Clicks on SignIn button
    When User clicks on search button
    Then Searches for Candidate name as "New"
    And User clicks on Candidate "New QA 3"
    When User clicks on Personal link
    #Then User clicks on Change button
    Then User clicks on Change button as "text"
    And Selects Country
    When User enters Address Line 1 "162 Anderson Street"
    Then User enters City name as "Johannesburg"
    And User enters Province name as "Gauteng"
    When User enters Post Code as "2001"
    Then User clicks on Save button
