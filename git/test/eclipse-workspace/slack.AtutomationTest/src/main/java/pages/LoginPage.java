package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.LoginModel;

public class LoginPage extends LoginModel {

	public LoginPage(WebDriver drive) {
		super(drive);
	}
	public void enterEmailPage(String email) {
		WebElement element=loginEmailModel();
		element.sendKeys(email);
	}
	public void enterPassPage(String passWord){
		WebElement pass=LoginPassModel();
		pass.sendKeys(passWord);	
	}
	public void clicksignInPage() {
		WebElement sign=LoginSignInModel();
		sign.click();
	}
}
