Feature: Candidate - Plus Button Top - Add To List

  Scenario: The user successfully adds candidate to List
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io/"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    When User clicks on search button
    And Searches for Candidate name as "New"
    Then User clicks on Candidate "New QA 3"
    #When user clicks on the Plus Top button (BLOCKER)
    And User clicks on Add To List button
    Then User selects a List
    When User clicks on Add candidate to list

