package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UpdateStatusModel extends ModelBase {

	public UpdateStatusModel(WebDriver drive) {
		super(drive);		
	} 
	public WebElement clickProfileModel() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(@data-sk,'tooltip_parent')])[3]")));
		WebElement element=driver.findElement(By.xpath("(//*[contains(@data-sk,'tooltip_parent')])[3]"));
	  return element;
	}
	public WebElement writeStatusCheckModel() {
		WebElement element=driver.findElement(By.xpath("//*[contains(@class,'c-button-unstyled p-ia__main_menu__custom_status_button')]"));
		return element;
	}
	public WebElement clickClearModel() {
		WebElement element=driver.findElement(By.xpath("//*[@class='c-menu']/div/div/div[3]/button/div"));
		return element;
	}
	public WebElement boforeStatusValidateModel() {
		 WebElement element=driver.findElement(By.xpath("//*[text()='Update your status']"));
	   		return element;
	}
	public WebElement typeMyStatusModel() {
		WebElement element=driver.findElement(By.xpath("//*[contains(@aria-label,'Update your status')]"));
	  return element;
	}
	public WebElement checkActiveStatusModel(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'p-ia__main_menu__user__presence')]")));
		WebElement element=driver.findElement(By.xpath("//*[contains(@class,'p-ia__main_menu__user__presence')]")); 
		return element;
	}
	public WebElement clickActiveStatusModel() {
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[text()='Set yourself as ']"), "Set yourself as active"));
		WebElement element=driver.findElement(By.xpath("//*[text()='Set yourself as ']"));
		return element;	
	}
}
