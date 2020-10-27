package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateChannelModel extends ModelBase {

	public CreateChannelModel(WebDriver drive) {
		super(drive);
		}

	public WebElement typeChannelModel() {
	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[text()='Create a channel']"), "Create a channel"));
		WebElement element=driver.findElement(By.xpath("//*[contains(@name,'channel-name')] "));
		return element;
	}
	public WebElement clickCreateModel() {
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[contains(@data-qa,'channel_create_modal_cta')]"), "Create"));
		WebElement element=driver.findElement(By.xpath("//*[contains(@data-qa,'channel_create_modal_cta')]"));
		return element;
  }
}
