package test;

import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelReader;

public class LoginTest extends TestBase {
	static Sheet excelSheet;
	
	@Test(dataProvider="info")
	public void signInTest(String email,String pass) {
		   getLoginPage();
		   lip.enterEmailPage(email); 
		   lip.enterPassPage(pass);
 		   lip.signInPage();
	} 
	@DataProvider(name = "info")
	public Object[][] datafeeder() throws IOException {//

	String filePath = "data/slackSigninData.xlsx";// path
	String sheetName="Sheet1";

	Object[][] tabArray=ExcelReader.excelDataToObjectArray(filePath,sheetName);
	return tabArray;
	}
}