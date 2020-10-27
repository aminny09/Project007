package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.ClearStatusModel;

public class ClearStatusPage extends ClearStatusModel {

	public ClearStatusPage(WebDriver drive) {
		super(drive);
	}
	public void clickStatusPage() {
		WebElement element=clickStatusModel();
		element.click();
	}
	public String statusValidatePage() {
		String status=writeModel().getText();
		System.out.println("Post validation pass");
		return status;	
		}
	public void clearStatusPage() {
		WebElement element=clearStatusModel(); 
		element.click(); 
	}
	public void clickProfilepage(){
		WebElement element=clickProfileModel();
		element.click();		
	}
    public String clearStatusValidatePage() {
	   String element=clearStatusValidateModel().getText();
	   System.out.println("Post delete pass");
	   return element;
	}
}