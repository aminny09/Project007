package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ClearStatusModel extends ModelBase {

	public ClearStatusModel(WebDriver drive) {
		super(drive);
	}
	public WebElement clickStatusModel() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='c-button-unstyled p-ia__sidebar_header__user__status p-top_nav__button']/span/span")));
		WebElement element=driver.findElement(By.xpath("//*[@class='c-button-unstyled p-ia__sidebar_header__user__status p-top_nav__button']/span/span"));
		return element;
	}
	public WebElement writeModel() {
		WebElement element=driver.findElement(By.xpath("//*[contains(@aria-label,'What’s your status?')]/p"));
		return element;
	}
	public WebElement clearStatusModel() {
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[contains(@class,'c-select_button--text-select-label')]"), "Clear after:"));
		WebElement element=driver.findElement(By.xpath("//*[text()='Clear Status']"));
		return element;
	}
	public WebElement clickProfileModel() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(@data-sk,'tooltip_parent')])[3]")));
		WebElement element=driver.findElement(By.xpath("(//*[contains(@data-sk,'tooltip_parent')])[3]"));
	  return element;
	} 
	public WebElement clearStatusValidateModel() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Update your status']")));
	 WebElement element=driver.findElement(By.xpath("//*[text()='Update your status']"));
   		return element;
	}
}
