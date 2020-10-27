package steps;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.TestBase;

public class UserPageTest extends TestBase {
	
	@Given("^I have \"([^\"]*)\" and \"([^\"]*)\" for the login page$")
	public void i_have_and_for_the_login_page(String arg1, String arg2) throws Throwable {
		   setUp();
		   getLoginPage();
		   lip.enterEmailPage(arg1);
		 	lip.enterPassPage(arg2);
		
	}

	@When("^create a channel \"([^\"]*)\" under the channels in userPage$")
	public void create_a_channel_under_the_channels_in_userPage(String arg1) throws Throwable {
		//up.clickBackProfilePage();
		  getUserPage();
		getCreateChannel(arg1);
	   
	}
	@Then("^I want to verify \"([^\"]*)\"channel name in the channels$")
	public void i_want_to_verify_channel_name_in_the_channels(String arg1) throws Throwable {
		boolean result=up.isChannelPresent(arg1);
		   Assert.assertTrue(result);
}
	@When("^I want delete the channel and verify the channel name exist$")
	public void i_want_delete_the_channel_and_verify_the_channel_name_exist() throws Throwable {
		getDeleteChannel();
	}

	@When("^I want to write post \"([^\"]*)\"on the user page$")
	public void i_want_to_write_post_on_the_user_page(String arg1) throws Throwable {
		up.getTypePostPage(arg1);
		up.getSubmitPostPage();
	   
	}

	@Then("^I want to validate post\"([^\"]*)\" in userPage$")
	public void i_want_to_validate_post_in_userPage(String arg1) throws Throwable {
		 		   
		   String postValidate=up.getPostValiDatePage();
		   Assert.assertEquals(postValidate,arg1);
	}
}
