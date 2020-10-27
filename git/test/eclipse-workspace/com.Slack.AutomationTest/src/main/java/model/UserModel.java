package model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UserModel extends ModelBase{

	public UserModel(WebDriver drive) {
		super(drive);
	}
	public WebElement clickProfileModel() {
		WebElement element= driver.findElement(By.xpath("//*[contains(@class,'p-ia__nav__user__avatar c-avatar')]"));
		return element;
	}
	public WebElement loginValidateModel() {
		WebElement element=driver.findElement(By.xpath("(//*[contains(@class,'p-ia__main_menu__user__name')])[2] "));
		return element;
	}
	public WebElement clickChannelModel() {
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[text()='Channels']"),"Channels"));
		   WebElement channel=driver.findElement(By.xpath("//*[text()='Channels']"));
		return channel;
	}
	public List<WebElement> allChannelModel() {
		List<WebElement> element=driver.findElements(By.xpath("//*[contains(@data-qa-channel-sidebar-channel-type,'channel')]"));
   		return element;
	}
	public WebElement clickPlusModel() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='p-channel_sidebar__section_heading_right'])[1]")));
		WebElement element=driver.findElement(By.xpath("(//*[@class='p-channel_sidebar__section_heading_right'])[1]"));
		return element;	
	}
	public WebElement clickCreateChannelModel() {
		WebElement element=driver.findElement(By.xpath("//*[text()='Create a channel']"));
		return element;
	}
	 public WebElement contextClickModel() {
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='qatestingchannel']")));
			WebElement element=driver.findElement(By.xpath("//*[text()='qatestingchannel']"));
			return element;
	 }
	 public WebElement typePostModel() {
			WebElement post=driver.findElement(By.xpath("//*[@class='ql-editor ql-blank']"));
			return post;
		}
		public WebElement submitPostModel() {
			WebElement post=driver.findElement(By.xpath("//*[@class='c-icon c-icon--paperplane-filled']"));
			 return post;	
		}  
		public WebElement postValiDateModel() {
			 WebElement element=driver.findElement(By.xpath("//*[contains(@class,'p-rich_text_section')]"));
				  return element;
		}
		public WebElement clickGetProfileModel() {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='p-ia__nav__user']/span/img")));
			WebElement element= driver.findElement(By.xpath("(//*[@class='p-ia__nav__user']/span)[1]"));
			return element;
		}
  }
