package test;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelReader;

public class UpdateStatusTest extends TestBase{ 
	
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
 
			 getChangeActiveStutasPage();
		     cas.checkStatusPage();
		     String verifyActive=cas.activeStatusValidatePage();
		     Assert.assertEquals(verifyActive, "Active");
		   cas.clickAwayStatusPage();
		   cas.clickProfilePage();
		   String verifyAway=cas.awayStatusValidatePage();
		   Assert.assertEquals(verifyAway,"Away");
		   cas.clickActiveStatusPage();
		   cas.clickProfilePage();
		   String validateActive =cas.activeStatusValidatePage();
		    Assert.assertEquals(validateActive, "Active");
		    
		    getUpdateStatusPage();
		    ts.writeStatusCheckPage();
		    ts.checkActiveStatusPage();
		    String postCheck=ts.beforeStatusValidatePage();
		     Assert.assertEquals(postCheck,"Update your status");
		    ts.clickMyStatusPage();
  }  
        @DataProvider(name = "info")
       public Object[][] datafeeder() throws IOException {//

      String filePath = "data/Information.xlsx";// path
       String sheetName="Sheet2";

       Object[][] tabArray=ExcelReader.excelDataToObjectArray(filePath,sheetName);
      return tabArray;
  }
}
		