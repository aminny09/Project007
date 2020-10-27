@LogininPage
Feature: SignIn
  I want to sign in slack website

  Scenario Outline: I want to verify user page with project name
    Given browser is open
    When Enter user <userName> and <passWord> for login
    And click the signin button
    And click the profileIcon
    Then I verify the userPage <status> with userProfile

    Examples: 
      | userName               | passWord     | status      |
      | " aminny570@yahoo.com" | "Amin308101" | "aminny570" |
