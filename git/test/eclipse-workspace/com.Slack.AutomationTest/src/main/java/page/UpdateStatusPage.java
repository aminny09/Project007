package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import model.UpdateStatusModel;

public class UpdateStatusPage extends UpdateStatusModel {

	public UpdateStatusPage(WebDriver drive) {
		super(drive);
	}
	public void clickProfilePage() {
		WebElement element=clickProfileModel();
		element.click();
	}
	    public void writeStatusCheckPage() {
	    	String checkStatus=writeStatusCheckModel().getText();    	
	    	WebElement clearStatus=clickClearModel();
	    	if(checkStatus.isEmpty()){
	    	}
	    	else{
	    		clearStatus.click();
	    		clickProfileModel().click();
	    		}    	
	    }
	public String beforeStatusValidatePage() {
		String element=boforeStatusValidateModel().getText();
		System.out.println("Update your status");
		return element;		
	}
	public void clickMyStatusPage() {
		WebElement element=typeMyStatusModel();
		element.click();
	}
	 public void checkActiveStatusPage() {
			String element=checkActiveStatusModel().getText();
			if(element.equals("Away")) {
				WebElement status= clickActiveStatusModel();
	     		status.click();
	     		clickProfileModel().click();
			} 
			else{
				System.out.println("Status active mode");
			}
	    }
}
