@statusMode
Feature: StatusMode
          I want to check the status

  Scenario Outline: I want to check the status mode and validate active mode status and away mode status
    Given I have the <userName> and <passWord> for the login page
    And click the signin button
    When click the profile Icon and check the status
    Then I have to validate the active status
    When click the Away mode
    And click the profile Icon
    Then I have to validate the Away status
    When click the Active mode
    And click the profile icon again
    Then I have to validate the active status again

    Examples: 
      | userName               | passWord     |
      | " aminny570@yahoo.com" | "Amin308101" |
