package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.CreateChannelModel;

public class CretateChannelPage extends CreateChannelModel {

	public CretateChannelPage(WebDriver drive) {
		super(drive); 
	}
	public void typeChannelPage(String write) {
		   WebElement element=typeChannelModel();
			   element.sendKeys(write);;
		   }	
	public void clickCreatePage() {
		   WebElement element=clickCreateModel();
			   element.click();
	}
}
