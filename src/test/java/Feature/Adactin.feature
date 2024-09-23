 @SearchHotel
Feature:  Adactin Hotel Automation

  Scenario: Select a hotel

    Given Launch "chrome" and url "https://adactinhotelapp.com/index.php"
    When User login by entering username as "FerdinSilvia" and password as "silvia3112"
    Then User lands on search hotel page and verifies the URL contains "SearchHotel" text
    When User selects Los Angeles in location
    And User selects Hotel Hervey
    And User selcts Double room type
    And User selects two number of rooms
    And User adds check in date "10/10/2024"
    And User adds check out date "17/10/2024"
    And User selects two adults
    And User selects two children
    And User clicks on search button
    Then User lands on select hotel page and verifies the URL contains "SelectHotel" text
    When User selects radio button
    When User clicks on continue button
    Then User lands on book hotel page and verifies the URL contains "BookHotel" text
    And User enters first name as "Ferdin"
    And User enters last name as "Silvia"
    And User enters billing address as "349, TV Salai, RedHills, Chennai"
    And User enters credit card number "1234567898765432"
    And User selects Visa credit card
    And User selects month and year in expiry date
    And User enters CVV number "714"
    And User click on book now button
    Given User takes screenshot of the booking confirmation page
    Then User quits the browser