package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.AdditionalOptionModel;

public class AdditionalOptionPage extends AdditionalOptionModel {

	public AdditionalOptionPage(WebDriver drive) {
		super(drive);
	}
	public void clickDeleteOptionPage() {
		 WebElement element=clickDeleteOptionModel();
		 element.click();
	}

	
}
