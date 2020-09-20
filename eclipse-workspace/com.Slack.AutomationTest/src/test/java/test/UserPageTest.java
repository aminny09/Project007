package test;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelReader;

public class UserPageTest extends TestBase{ 
	
     static Sheet excelSheet;
	
	@Test(dataProvider="info")
	public void channelPageTest(String email,String pass,String channel,String post) throws InterruptedException {
		  getLoginPage();
		   lip.enterEmailPage(email); 
		   lip.enterPassPage(pass);
		   lip.signInPage();

		   getUserPage();
		   up.clickProfilePage();
	 		  String verify=up.loginValidatePage();
			   Assert.assertEquals(verify,"aminny570","verification failed");
	 		  up.clickBackProfilePage();
		   up.clickChannelPage();
		     up.isChannelPresent(channel);
		   getCreateChannel(channel);
     	   boolean result=up.isChannelPresent(channel);
			   Assert.assertTrue(result);
			   getDeleteChannel();
			   
			   up.isChannelPresent(channel);
//           boolean deleteChannel=up.isChannelPresent(channel);
//          Assert.assertFalse(deleteChannel);
			  up.getTypePostPage(post);
			 up.getSubmitPostPage(); 
			   String postValidate=up.getPostValiDatePage();
			   Assert.assertEquals(postValidate, "Welcome to QA Automation");
			  up.clickBackProfilePage();
    } 
          @DataProvider(name = "info")
         public Object[][] datafeeder() throws IOException {//

        String filePath = "data/Information.xlsx";// path
         String sheetName="Sheet2";

         Object[][] tabArray=ExcelReader.excelDataToObjectArray(filePath,sheetName);
        return tabArray;
    }
}