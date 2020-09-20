package model;

import java.sql.Timestamp;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModelBase {
	 WebDriver driver;
	 static WebDriverWait wait;
	 
	protected static  Actions action;
	
	public ModelBase(WebDriver drive ){
		driver=drive;
		
	     action = new Actions(driver);

		 wait=new WebDriverWait(driver,20);
	}
		
	  public  void getCurrentTimeUsingDate() {
	    	Date date = new Date(); 
	    	long dt=date.getTime();
	          Timestamp st=new Timestamp(dt);
			System.out.println(st);	  	
 }
}