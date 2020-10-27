package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.DoneCreateChannelModel;

public class DoneCreateChannelPage extends DoneCreateChannelModel{

	public DoneCreateChannelPage(WebDriver drive) {
		super(drive);
	}
	public void clickDonePage() {
		WebElement press=clickDoneModel();
		press.click();	
	}
   public String channelCreateValidatePage() {
	     String element=channelCreateValidateModel().getText();
	     System.out.println("Channel found-qatestingchannel");
       return element;
   }
}
