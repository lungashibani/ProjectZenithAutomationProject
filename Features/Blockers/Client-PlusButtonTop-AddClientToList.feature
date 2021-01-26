Feature: Client-PlusButtonTop-AddClientToList

  Scenario: Successful adds Client to list
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io/"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    When Clicks on SignIn button
    And User clicks on the Menu button as "menu"
    Then User clicks on the Client link
    When User clicks on the Client link item as "text"
    #And user clicks on the Plus Top button (BLOCKER)

    Then Selects List item

    When User clicks on Add button

