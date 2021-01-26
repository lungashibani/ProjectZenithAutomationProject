Feature: Candidate - Summary - Add Qualification

  Scenario: Candidate Successful Adds Qualification
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io/candidates/81216f9b-7aeb-4d4a-83d0-1777b2870352"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    And Clicks on SignIn button
    When User clicks on search button
    Then Searches for Candidate name as "New"
    And User clicks on Candidate "New QA 3"
    When User clicks on the middle plus button
    Then User enters Qualification Name "Computer Engineering"
    And User enters name of Institution "UNISA"
    When User selects Date Issued
    Then User enters achieved Grade "B"
    And User clicks on Create button