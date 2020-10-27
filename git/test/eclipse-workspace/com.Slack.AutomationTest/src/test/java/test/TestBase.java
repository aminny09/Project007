package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import page.UserPage;
import page.LoginPage;
import page.SetStatusPage;
import page.UpdateStatusPage;
import page.StatusModeUpdatePage;
import page.AdditionalOptionPage;
import page.ClearStatusPage;
import page.CretateChannelPage;
import page.DeleteChannelPage;
import page.ChannelNameOptionPage;
import page.DoneCreateChannelPage;

public class TestBase {
	static WebDriver driver;
	public static LoginPage lip;
	public static UserPage up;
	static CretateChannelPage ccp;
	static DoneCreateChannelPage dc;
	static ChannelNameOptionPage cno;
	static AdditionalOptionPage ao;
	static DeleteChannelPage dcp;
	public static StatusModeUpdatePage cas;
	static UpdateStatusPage ts;
	static SetStatusPage ss;
	static ClearStatusPage cs;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://basecamp-0k29624.slack.com/?redir=%2Fgantry%2Fclient");
	}
	public LoginPage getLoginPage() {
		lip=new LoginPage(driver); 
		return lip;
	}
	public UserPage getUserPage() {
		up=new UserPage(driver);
			return up; 
	}
	
	public UserPage getCreateChannel(String channel) {
		up.checkChannel(channel);
		getCreateChannelPage();
		ccp.typeChannelPage(channel);
		ccp.clickCreatePage();
		getDoneChannelPage();
		dc.clickDonePage();	
		return up;	
	}
	public UserPage getDeleteChannel() {
       up.contextClickPage();	
		getChannelNameOption();
		cno.clickAdditionalPage();
		getDeleteOptionPage();
		ao.clickDeleteOptionPage();
		getDeleteChannelPage();
		dcp.clickYesBoxPage();
		dcp.clickDeleteChannelPage();
		return up;
		
	}
	public CretateChannelPage getCreateChannelPage() {
		ccp=new CretateChannelPage(driver);
			return ccp;
	}
	public DoneCreateChannelPage getDoneChannelPage() {
		dc=new DoneCreateChannelPage(driver);
		return dc;
	}
	public ChannelNameOptionPage getChannelNameOption() {
		cno=new ChannelNameOptionPage(driver);
		return cno;
	}
	public AdditionalOptionPage getDeleteOptionPage() {
		ao=new AdditionalOptionPage(driver);
		return ao;
	}
	public DeleteChannelPage getDeleteChannelPage() {
		dcp=new DeleteChannelPage(driver);
		return dcp;
	}
	public StatusModeUpdatePage getChangeActiveStutasPage() {
		cas=new StatusModeUpdatePage(driver);
		return cas;
	}
	public UpdateStatusPage getUpdateStatusPage() {
		ts=new UpdateStatusPage(driver);
		return ts;
	}
	public SetStatusPage getSetStatusPage() {
		ss=new SetStatusPage(driver);
		return ss;
	}
	public ClearStatusPage getClearStatusPage() {
		cs=new ClearStatusPage(driver);
				return cs;
	}
	@AfterClass
	public void TearDown() {
		driver.close();
	}
	
}
