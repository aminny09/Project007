package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.StatusModeUpdateModel;

public class StatusModeUpdatePage extends StatusModeUpdateModel{

	public StatusModeUpdatePage(WebDriver drive) {
		super(drive);
	}
	public void checkStatusPage() {
		String element=statusCheckModel().getText();
		if(element.equals("Away")) {
			WebElement status= clickActiveStatusModel();
     		status.click();
     		clickProfileModel().click();
		} 
		else{
			System.out.println("Status on active mode");
		}
}
	public String activeStatusValidatePage() {
		String element=activeStatusValidateModel().getText();
		System.out.println("Active validation pass");
		return element;
	}
	public void clickAwayStatusPage() {
		    WebElement element= clickAwayStatusModel();
		    System.out.println("status away");
		    element.click();
	} 
	public void clickProfilePage() {
		WebElement element=clickProfileModel();
		element.click();
	}
	public String awayStatusValidatePage() {
		String element=awayStatusValidateModel().getText();
		System.out.println("Away validation pass");
		return element;	
 }
	public void clickActiveStatusPage() {
		WebElement element=clickActiveStatusModel();
		System.out.println("Status Active");
		element.click();		
	}
}
