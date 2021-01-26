Feature: Client - Information - Plus Button Middle - Add New Position

  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    When Clicks on SignIn button
    And User clicks on the Menu button as "menu"
    Then User clicks on the Client link
    When User clicks on the Client link item as "text"
    And User clicks on Information link

    #When User clicks on Position History Plus button (Blocker_

    Then User enter Job Title as "IT Specialist"
    When User search for Organisation Menu as "New Organisation"
    And User select an Organisation Menu Items
    Then User search for Location Menu as "HQ"
    When User select Location Menu Item
    Then User selects Duration
    And User clicks on OK
#    When User clicks on Current at this role
    And Clicks on Current Position Contact Details Plus
    Then Click on Mobile Phone
    When Enter Mobile Phone as "0426272733"
    And Clicks on the Create button


