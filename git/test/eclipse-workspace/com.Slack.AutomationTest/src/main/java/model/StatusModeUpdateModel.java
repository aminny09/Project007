package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StatusModeUpdateModel extends ModelBase {

	public StatusModeUpdateModel(WebDriver drive) {
		super(drive);
	}
	public WebElement statusCheckModel(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'p-ia__main_menu__user__presence')]")));
		WebElement element=driver.findElement(By.xpath("//*[contains(@class,'p-ia__main_menu__user__presence')]")); 
		return element;
	}
	public WebElement activeStatusValidateModel() {
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[text()='Active']"), "Active"));
		WebElement element=driver.findElement(By.xpath("//*[text()='Active']"));
		return element;	
	}
	public WebElement clickAwayStatusModel() {
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[text()='Set yourself as ']"), "Set yourself as away"));
		WebElement element=driver.findElement(By.xpath("//*[text()='Set yourself as ']"));
		return element;	
	}
	public WebElement clickProfileModel() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@class,'p-ia__nav__user__avatar c-avatar')]")));
		WebElement element= driver.findElement(By.xpath("//*[contains(@class,'p-ia__nav__user__avatar c-avatar')]"));
		return element;
	}
	public WebElement awayStatusValidateModel() {
		WebElement element=driver.findElement(By.xpath("//*[text()='Away']"));
		return element;
	}
	public WebElement clickActiveStatusModel() {
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[text()='Set yourself as ']"), "Set yourself as active"));
		WebElement element=driver.findElement(By.xpath("//*[text()='Set yourself as ']"));
		return element;	
	}
	
}
