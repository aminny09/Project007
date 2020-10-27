
	 package steps;

	 import org.junit.Assert;
	 import cucumber.api.java.en.Given;
	 import cucumber.api.java.en.Then;
	 import cucumber.api.java.en.When;
	 
   import test.TestBase;

	 public class SignInTest extends TestBase {

	 @Given("^browser is open$") 
	 public void browser_is_open() throws Throwable {
	 	  setUp();
	 }

	 @When("^Enter user \"([^\"]*)\" and \"([^\"]*)\" for login$")
	 public void enter_user_and_for_login(String arg1, String arg2) throws Throwable {
		 getLoginPage();
	 	lip.enterEmailPage(arg1);
	 	lip.enterPassPage(arg2);
	    
	 }

	 @When("^click the signin button$")
	 public void click_the_signin_button() throws Throwable {
	 	lip.signInPage();
	 }

	 @When("^click the profileIcon$")
	 public void click_the_profileIcon() throws Throwable {
		 getUserPage();
	 	up.getClickGetProfilePage();
	 }

	 @Then("^I verify the userPage \"([^\"]*)\" with userProfile$")
	 public void i_verify_the_userPage_with_userProfile(String arg1) throws Throwable {
	 	String actual=up.loginValidatePage();
	 	Assert.assertEquals(arg1, actual); 
	 	up.clickBackProfilePage();
	   
	 }
}
