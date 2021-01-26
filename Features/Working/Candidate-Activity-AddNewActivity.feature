Feature: Candidate - Activity - Add New Activity

  Scenario: Candidate Successful Adds New Activity
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io/"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    When Clicks on SignIn button
    And User clicks on search button
    Then Searches for Candidate name as "New"
    When User clicks on Candidate "New QA 3"
    And User clicks on Activity
    Then User clicks on the activity plus button
    #When User enters Position Type
    When User enters Activity Type
    Then User clicks on the Create button
