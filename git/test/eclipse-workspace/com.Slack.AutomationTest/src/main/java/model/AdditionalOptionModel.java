package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdditionalOptionModel extends ModelBase{

	public AdditionalOptionModel(WebDriver drive) {
		super(drive);
	}
	public WebElement clickDeleteOptionModel() {
		WebElement element=driver.findElement(By.xpath("//*[contains(@data-action,'delete')]"));
	  return element;
	}
 
	

}
