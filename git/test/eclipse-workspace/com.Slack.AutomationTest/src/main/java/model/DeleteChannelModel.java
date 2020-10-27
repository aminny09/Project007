package model;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

     public class DeleteChannelModel extends ModelBase{

	public DeleteChannelModel(WebDriver drive) {
		super(drive);
	}
	public WebElement clickYesBoxModel() {
		WebElement element=driver.findElement(By.xpath("(//*[contains(@id,'delete_channel_cb')])[1]"));
        return element; 
	}
	public WebElement clickDeleteChannelModel() {
		WebElement element=driver.findElement(By.xpath("//*[text()='Delete Channel']"));
        return element; 
	}
	public List<WebElement> channelDeleteValidateModel() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[text()='qatestingchannel']")));
		List<WebElement>element=driver.findElements(By.xpath("//*[contains(@class,'p-channel_sidebar__name')]"));
   		return element;
   }
}
            