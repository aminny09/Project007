package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseModel {
	
		 WebDriver driver;
		 static WebDriverWait wait;
		 
		protected static  Actions action;
		
		public BaseModel(WebDriver drive ){
			driver=drive;
			
		     action = new Actions(driver);
			 wait=new WebDriverWait(driver,20);
		}
			
}
