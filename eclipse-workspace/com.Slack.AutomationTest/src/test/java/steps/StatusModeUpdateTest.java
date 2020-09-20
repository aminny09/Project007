package steps;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.TestBase;

public class StatusModeUpdateTest extends TestBase {
	@Given("^I have the \"([^\"]*)\" and \"([^\"]*)\" for the login page$")
	public void i_have_the_and_for_the_login_page(String arg1, String arg2) throws Throwable {
		setUp();
		getLoginPage();
	 	lip.enterEmailPage(arg1);
	 	lip.enterPassPage(arg2);
	}

	@When("^click the profile Icon and check the status$")
	public void click_the_profile_Icon_and_check_the_status() throws Throwable {
		getUserPage();
	 	up.clickProfilePage();
	 	getChangeActiveStutasPage();
	     cas.checkStatusPage();
	}
	@Then("^I have to validate the active status$")
	public void i_have_to_validate_the_active_status() throws Throwable {
		 String verifyActive=cas.activeStatusValidatePage();
	     Assert.assertEquals(verifyActive, "Active");
	}
	@When("^click the Away mode$")
	public void click_the_Away_mode() throws Throwable {
		cas.clickAwayStatusPage();   
	}
	@When("^click the profile Icon$")
	public void click_the_profile_Icon() throws Throwable {
		cas.clickProfilePage();
	}

	@Then("^I have to validate the Away status$")
	public void i_have_to_validate_the_Away_status() throws Throwable {
		String verifyAway=cas.awayStatusValidatePage();
		   Assert.assertEquals(verifyAway,"Away");
	}
	@When("^click the Active mode$")
	public void click_the_Active_mode() throws Throwable {
		cas.clickActiveStatusPage();	    
	}
	@When("^click the profile icon again$")
	public void click_the_profile_icon_again() throws Throwable {
		cas.clickProfilePage();    
	}
	@Then("^I have to validate the active status again$")
	public void i_have_to_validate_the_active_status_again() throws Throwable {
		String verifyActive=cas.activeStatusValidatePage();
	     Assert.assertEquals(verifyActive, "Active");	
	}
}

