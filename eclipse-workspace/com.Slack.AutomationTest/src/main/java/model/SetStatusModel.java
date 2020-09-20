package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SetStatusModel extends ModelBase {

	public SetStatusModel(WebDriver drive) {
		super(drive);
	}
	public WebElement writeModel() {
		WebElement element=driver.findElement(By.xpath("//*[contains(@aria-label,'What’s your status?')]/p"));
		return element;
	}
	public WebElement saveStatusModel() {
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[contains(@class,'c-select_button--text-select-label')]"), "Clear after:"));
		WebElement element=driver.findElement(By.xpath("//*[contains(@class,'c-button c-button--primary c-button--medium')]"));
		return element;
	}
	 
}
 