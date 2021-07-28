Feature: Adidas verification functionality

#  Scenario: Verification for phone category
#    Given User is on the Home Page
#    When User clicks on "Phones" category
#    Then User should see "Selected category"

  Scenario Outline:
    Given User is on the Home Page
    When User clicks on "<Categories>" category
    And User should see in "<Categories>"
    Then user should see"<devices>"







    Examples:Verification for phone category

#      | Categories        |
#      | Phones            |
#      | Laptops           |
#      | Monitors          |


      | devices           |
      | Samsung galaxy s6 |
      | Nokia lumia 1520  |
      | Nexus 6           |
      | Samsung galaxy s7 |
      | Iphone 6 32gb     |
      | Sony xperia z5    |
      | HTC One M9        |