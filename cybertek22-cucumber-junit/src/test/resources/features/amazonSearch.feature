Feature: Amazon Search and Cart feature

  Scenario: Amazon search and cart functionality
    Given User is on the Amazon Home Page
    When User search for hats for men
    And User adds the first hat appearing to the cart with quantity two
    Then The total price and quantity should be correct
    When User reduce the quantity from two to one
    Then total price and quantity has been changed