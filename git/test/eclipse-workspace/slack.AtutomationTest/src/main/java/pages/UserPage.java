package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import model.UserModel;

public class UserPage extends UserModel {
	
    public WebDriver driver;

	public UserPage(WebDriver drive) {
		super(drive);

}
	public void clickChannelPage() {
      	WebElement page=clickChannelModel();
      	page.click();
	}
	public void clickProfilePage(){
		WebElement getProfile=clickProfileModel();
		getProfile.click();
	}
	public String loginValidatePage() {
		String element=loginValidateModel().getText();
		System.out.println("Login validation pass");
		return element;
	}
	public void clickBackProfilePage() {
		WebElement profile=clickProfileModel();
       action.moveToElement(profile).click().perform();
	}
	public boolean isChannelPresent(String channel) {
		   boolean result=false;
		List<WebElement> element= allChannelModel();
		for(WebElement allElement:element) {
			String all=allElement.getText();			
          if(all.equals(channel)) {
			result=true;
			break;
		}
		}
		return result;
	}
	public void checkChannel(String channel) {
		if(!isChannelPresent(channel)) {
			clickPlusPage();
			clickCreateChannelPage();
			
		}		
	}
	public void clickPlusPage() {
		  WebElement element=clickPlusModel();
		  element.click();
	}
     public void clickCreateChannelPage() {
		WebElement element=clickCreateChannelModel();
		element.click();
	}
     public void getDeleteChannel() {
    	 contextClickPage();   	   	 
     }
     public void contextClickPage() {
 		WebElement element=contextClickModel();
 		action.moveToElement(element).build().perform(); 
 		action.contextClick(element).build().perform();
     }
     public void getTypePostPage(String post) {
		  WebElement write= typePostModel();
		  write.sendKeys(post);	  
	}		 
	  public void getSubmitPostPage() {
	 WebElement element= submitPostModel();
	  action.moveToElement(element).click().perform();
	}
	public String getPostValiDatePage() { 
		String post=postValiDateModel().getText();
		System.out.println("Post validation successfull");
		return post;
	}
	public void getClickGetProfilePage() {
		WebElement wb=clickGetProfileModel();
		wb.click();
	}
}

