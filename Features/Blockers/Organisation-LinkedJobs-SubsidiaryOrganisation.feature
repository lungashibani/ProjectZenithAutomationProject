Feature: Organisation - Linked Jobs - Subsidiary Organisation

  Scenario: Successful creates Parent Organisation
    Given User launch Chrome browser
    When User opens URL "https://dev.digitalzenith.io"
    And User enters Username as "Onion"
    Then User enters Password as "Onion1000"
    When Clicks on SignIn button
    And User click on the Menu button as "menu"
    Then User click on the Organisation link
    When User click on the Organisation link item as "text"
    And User click on the Organisation link menu item as "textItem"

    Then User clicks on Linked Jobs link
    #When User clicks on Subsidiary Plus button (BLOCKER)
    And User enters Organisation name as "Pandemic Org"
    Then User clicks on Select to create Subsidiary Organisation

