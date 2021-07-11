Feature: NextBaseCrm login page
@wip
  Scenario: Login functionality on nextBaseCrm
    Given User is on nextBasecrm Login page
    When User enter correct email
    And User enter correct password
    And User click on "Log in" button
    Then User should see "Portal"