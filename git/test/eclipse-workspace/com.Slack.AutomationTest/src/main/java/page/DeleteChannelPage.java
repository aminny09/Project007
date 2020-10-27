package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.DeleteChannelModel;

public class DeleteChannelPage extends DeleteChannelModel{

	public DeleteChannelPage(WebDriver drive) {
		super(drive);
	}
	public void clickYesBoxPage() {
		WebElement element=clickYesBoxModel(); 
		element.click();
	}
	public void clickDeleteChannelPage() {
		WebElement element=clickDeleteChannelModel();
		element.click();
	}
	public boolean channelDeleteValidatePage() {		    
			List<WebElement> element= channelDeleteValidateModel();
			for(WebElement allElement:element) {
				String all=allElement.getText();
			if(all.equals("qatestingchannel")) {			
				System.out.println("Channel is exist"+all);
				return true;
			}
			else {
				System.out.println("Channel delete successfully");
				return false;
			}
		}
			return false;
	}
}
