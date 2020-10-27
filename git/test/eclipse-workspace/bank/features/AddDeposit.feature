@deposit
Feature: Deposit
  I want to deposit method to add some money to my account.

  Scenario Outline: Verify the amount after deposit amount
    Given I have <initial> balance in my account
    When I want to <depositMoney> in my account
    Then I want to check <currentAmount> my account

    Examples: 
      | initial | depositMoney | currentAmount |
      |     100 |         1000 |          1100 |
      |     500 |          800 |          1300 |
