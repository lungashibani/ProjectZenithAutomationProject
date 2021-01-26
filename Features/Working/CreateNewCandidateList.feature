Feature: Create Candidate List

  Scenario: Candidate Successful Adds New List
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io/"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    And Clicks on SignIn button
    When User clicks on search button
    Then User clicks on the universal Plus button
    And User clicks on List
    When User clicks on Candidate
    Then User enters List Name as "New Candidate List 3"
    And User click on the Create button

