@LogininPage
Feature: SignIn
  I want to sign in slack webSite

  Scenario Outline: I want to verify user page with project name
    Given browser is open
    When Enter user <userName> and <passWord> for login
    And click the signIn button
    Then I verify the userPage <status>

    Examples: 
      | userName            | passWord    | status    |
      | aminny570@yahoo.com | Amin308101 | Base Camp |
