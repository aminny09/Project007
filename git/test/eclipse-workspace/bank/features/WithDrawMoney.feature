@withDraw
Feature: WithDraw
  
  I want to withdraw some money from my account.

  Scenario Outline: verify the current balance after withdrawing.
    Given I have <initialBalance> in my account
    When I want to <withDrawMoney> from my account
    Then I verify the <currentBalance> will be in my account

    Examples: 
      | initialBalance | withDrawMoney | currentBalance |
      |            500 |           200 |            300 |
      |            400 |            50 |            350 |
