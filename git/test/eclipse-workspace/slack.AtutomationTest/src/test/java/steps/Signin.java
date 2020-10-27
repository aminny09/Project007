 package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.UserPage;

public class Signin {
	
	LoginPage lip;
	WebDriver driver;
	UserPage up;

@Given("^browser is open$")
public void browser_is_open() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://basecamp-0k29624.slack.com/?redir=%2Fgantry%2Fclient");
	lip=new LoginPage(driver);  
	  up=new UserPage(driver);

}

@When("^Enter user \"([^\"]*)\" and \"([^\"]*)\" for login$")
public void enter_user_and_for_login(String arg1, String arg2) throws Throwable {
	lip.enterEmailPage(arg1);
	lip.enterPassPage(arg2);
    
}

@When("^click the signin button$")
public void click_the_signin_button() throws Throwable {
	lip.clicksignInPage();
}

@When("^click the profileIcon$")
public void click_the_profileIcon() throws Throwable {
	up.getClickGetProfilePage();
}

@Then("^I verify the userPage \"([^\"]*)\" with userProfile$")
public void i_verify_the_userPage_with_userProfile(String arg1) throws Throwable {
	String actual=up.loginValidatePage();
	Assert.assertEquals(arg1, actual);   
  }
}