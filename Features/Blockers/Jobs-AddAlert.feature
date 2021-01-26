Feature: Jobs - Add Aler

  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    When Clicks on SignIn button
    And User click on the Menu button as "menu"

    Then User click on My Jobs link
    When User click on a Job link item as "text"
    #And Click on the Plus Top button as "text" (BLOCKERS)
    Then User clicks on  add Alert

    Then User select Type
    When User writes a Reason as "Just a test"
    And User select Expiry Date
    Then User click on button OK
    When User clicks on button Add

