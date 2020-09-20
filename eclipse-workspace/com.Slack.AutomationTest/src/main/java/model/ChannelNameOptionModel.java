package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ChannelNameOptionModel extends ModelBase {

	public ChannelNameOptionModel(WebDriver drive) {
		super(drive);
   } 
   public WebElement clickAdditionalModel() {
	   wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[text()='Additional options…']"), "Additional options…"));
	   WebElement element=driver.findElement(By.xpath("//*[text()='Additional options…']"));
	   return element;
   }
} 
