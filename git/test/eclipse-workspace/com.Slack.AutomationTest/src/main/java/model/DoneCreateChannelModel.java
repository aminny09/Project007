package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DoneCreateChannelModel extends ModelBase{

	public DoneCreateChannelModel(WebDriver drive) {
		super(drive);
	}
	public WebElement clickDoneModel() {
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[contains(@data-qa,'invite_to_workspace_submit_button')]"), "Done"));
		WebElement element=driver.findElement(By.xpath("//*[contains(@data-qa,'invite_to_workspace_submit_button')]"));
		return element;
	}
	public WebElement channelCreateValidateModel() {
		WebElement element=driver.findElement(By.xpath("//*[text()='qatestingchannel']"));
		return element;
	}

}
