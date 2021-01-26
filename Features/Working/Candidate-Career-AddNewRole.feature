Feature: Candidate - Career - Add New Role

  Scenario: Candidate Successful Adds New Role
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io/"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    And Clicks on SignIn button
    When User clicks on search button
    Then Searches for Candidate name as "New"
    And User clicks on Candidate "New QA 3"
    When User clicks on Career
    Then User clicks on the current roles plus button
    And User enters Job Tile as "Auditor"
    When User enters Position Type
    Then User enters Salary rate "200"
    And User selects Pay Period
    When User clicks Add button
