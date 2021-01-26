Feature: Edit Candidate List

  Scenario: Candidate Successful Edited Candidate List
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io/lists/candidates/aadb68c7-3705-4572-b0d6-1b9b98d722a3"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    When Clicks on SignIn button
    And User clicks on the Menu button as "menu"

    Then User clicks on the Candidate List link
    When User clicks on a Personal List link as "s a list"
    And User clicks the Edit button
    Then User enters the List new  Name as "New Postman list name"

    When User clicks the Update button