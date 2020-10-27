package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.SetStatusModel;

public class SetStatusPage extends SetStatusModel{

	public SetStatusPage(WebDriver drive) {
		super(drive);
	}
	public void writePage(String status) {
		WebElement element=writeModel();
		element.sendKeys(status);		
	}
	public void saveStatusPage() {
		WebElement element=saveStatusModel();
		element.click();	
	} 	
}
