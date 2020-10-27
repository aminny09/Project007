package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import model.ChannelNameOptionModel;

public class ChannelNameOptionPage extends ChannelNameOptionModel {
   	
	public ChannelNameOptionPage(WebDriver drive) {
		super(drive);
	}
	public void clickAdditionalPage() {
		WebElement element=clickAdditionalModel();
		element.click();
	}
}
