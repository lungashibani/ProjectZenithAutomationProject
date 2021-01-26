Feature: Create New Client Contact

  Scenario: Successful Created New Client Contact
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io/"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    And Clicks on SignIn button
    When User Clicks on Universal Plus Button
    Then Clicks on Client Contact Button
    And User enters First Name of New Client as "New QA 3"
    Then User enters family Name of New Client as "New QA 3"
    When User Enters Job Title of New Client as "Tester"

    And User searches for Organisation Menu as "New Organisation"
    Then User selects an Organisation Menu Items

    Then User Searches for Locations Menu as "HQ"
    When User Selects Locations Menu Item

    When Clicks on Current Position Contact Details Plus button
    And Clicks on Mobile Phone
    Then Enters Mobile Phone as "0426272733"

    And Click on Create button for new Client




