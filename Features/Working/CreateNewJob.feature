Feature: Create New Job

  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io/"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    And Clicks on SignIn button
    When User Clicks on Universal Plus Button
    And Clicks on Create Job Button
    Then User enters Job Title as "Testing"
    When User searches for Organisation Menu as "New Organisation"
    And User selects an Organisation Menu Item
    Then User searches for Location Menu as "HQ"
    When User selects Location Menu Item
    And User searches for Main Client Contact Menu as "Bob Hardy"
    Then User selects Main Client Contact Menu Item
    When User clicks on selected Job Status Item

    And User clicks on Agreement Type menu
    Then User clicks on selected Agreement Type Item


    When User clicks on Exclusivity Type menu
    And User clicks on selected Exclusivity Type Item

    Then User clicks on Source Item
    When User clicks on selected Source Type Item

    And User clicks on Job Type Item
    Then User clicks on selected Job Type Item




    Then Click on Client Email button
    And User enters Link as "IT"
    Then Click Check Box
    And User enters Background info as "This is just a test"
    Then Click on Create button






#    When User clicks on View button
#    And User clicks on Ellipses
#    Then Clicks on Link Client Contact
#    When User enters Organisation as {string}
#    And User enters Client Contact as {string}
#    Then Clicks on Select button





