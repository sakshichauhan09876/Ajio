package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomClasses.AccountSettingPage;
import PomClasses.HomePage;
import PomClasses.LoginPage;
import PomClasses.WelcomePage;

public class BaseClass {
	public static WebDriver driver;
	public DataUtility du=new DataUtility();
	public WebDriverUtility wu=new WebDriverUtility();
	public DropDownUtility drpu=new DropDownUtility();
	
	@BeforeClass
	public void LaunchingBrowser() throws Throwable {
		System.out.println("-------Launch The Browser--------");
		String Browser=du.DataFromPropertiesFile("browser");
		if(Browser.equals("firefox")) {
			driver=new ChromeDriver();
		}
		else if(Browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(Browser.equals("edge")) {
		driver=new EdgeDriver();
		
		}
		else {
			driver=new ChromeDriver();
		}
	String URL=du.DataFromPropertiesFile("Url");
	driver.get(URL);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@BeforeMethod
	public void LoginToApplication() throws Throwable{
		System.out.println("------Login To Application");
		
		WelcomePage wlpage=new WelcomePage(driver);
		Thread.sleep(2000);
		wlpage.getmainLoginButton().click();
		
		LoginPage Lpage=new LoginPage(driver);
		String emailid=du.DataFromPropertiesFile("UserName");
		Lpage.getEmailTextField().sendKeys(emailid);
		
		Thread.sleep(1000);
		String password =du.DataFromPropertiesFile("password");
		Lpage.getPasswordTextField().click();
	}
		
	@AfterMethod
	public void LogoutFromApplication() {
		System.out.println("----Logout To application----");
		HomePage Hpage=new HomePage(driver);
		
		wu.javaScriptclick(driver, Hpage.getAccountSettingsbutton());
		AccountSettingPage Aspage=new AccountSettingPage(driver);
		Aspage.getLogoutIcon().click();
		
		
	}
	
	@AfterClass
	public void QuitBrowser() {
		System.out.println("----Quit The browser----");
		driver.quit();
	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
	}


