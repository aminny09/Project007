package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginModel extends ModelBase {

	public LoginModel(WebDriver drive) { 
		super(drive);
	}
	public WebElement loginEmailModel() {
		WebElement email=driver.findElement(By.xpath("//*[contains(@name,'email')] "));
		return email;
	}
	public WebElement LoginPassModel() {
		WebElement pass=driver.findElement(By.xpath("//*[contains(@name,'password')]"));
		return pass;
	}
	public WebElement LoginSignInModel() {
		WebElement sign=driver.findElement(By.xpath("//*[contains(@id,'signin_btn')] "));
		return sign;	
	}
}
