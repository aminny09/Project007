package steps;

import org.junit.Assert;

import apps.Bank;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddDepositStep {
	
	Bank bk;

	@Given("^I have (\\d+) balance in my account$")
	public void i_have_balance_in_my_account(int arg1) throws Throwable {
	 bk=new Bank(arg1);		
}

@When("^I want to (\\d+) in my account$")
public void i_want_to_in_my_account(int arg1) throws Throwable {
	bk.deposit(arg1);
}

@Then("^I want to check (\\d+) my account$")
public void i_want_to_check_my_account(int arg1) throws Throwable {
	int actual=bk.getBalance();
	Assert.assertEquals(arg1, actual);
  }
}
