Feature: Organisation - Location - Plus Button Middle - Add Location

  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io/"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    When Clicks on SignIn button
    And User Clicks on Universal Plus Button
    Then User clicks on Organisation
    When User enters an Organisation Name as "Lu QA Organisation"
    And User enters Location Name as "Soweto"
    Then User selects Country
    When User enter City as "Johannesburg"
    When User clicks the Create button

