package steps;

import org.junit.Assert;

import apps.Bank;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WithDrawMoneyStep {

	Bank bk;

	@Given("^I have (\\d+) in my account$")
	public void I_have_in_my_account(int arg1) throws Throwable {
	   bk=new Bank(arg1);
	}

	@When("^I want to (\\d+) from my account$")
	public void i_want_to_from_my_account(int arg1) throws Throwable {
	  bk.withDraw(arg1);
	}

	@Then("^I verify the (\\d+) will be in my account$")
	public void i_verify_the_will_be_in_my_account(int arg1) throws Throwable {
	  int actual=bk.getBalance();
	  Assert.assertEquals(arg1, actual);
	}
}