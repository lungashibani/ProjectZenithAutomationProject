Feature: Candidate - Plus Button Top - Add Candidate Review List

  Scenario: The user navigates to the Candidate Review List page. When they navigate past the header, they are presented with the list of Candidates assigned to this list.
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io/"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    When User clicks on search button
    And Searches for Candidate name as "New"
    Then User clicks on Candidate "New QA 3"
    #When user clicks on the Plus Top button (BLOCKER)
    And User click on Candidate Review
    Then User adds Notes reviews as "Candidate is really impressive."
    When User selects the Create button
