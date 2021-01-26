Feature: Organisation - Location - Plus Top Button - Add Alert To Record

  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    When Clicks on SignIn button

    And User click on the Menu button as "menu"
    Then User click on the Organisation link
    When User click on the Organisation link item as "text"
    And User click on the Organisation link menu item as "textItem"

#    And User clicks on Plus Top button  (BLOCKER)

    Then User selects Type
    When User writes Reason as "Just a test"
    And User selects Expiry Date
    Then User clicks on button OK
    When User click on button Add
