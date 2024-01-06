package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSettingPage {
	
	public WebDriver driver;
	
	//initialisation of Webelement
	
	public AccountSettingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
//declaration
	
	@FindAll({@FindBy(xpath="//*[name()='svg' and @data-testid='LogoutIcon']"),@FindBy(xpath="//*[@id=\"account-menu\"]/div[3]/ul/li[7]/text()")})
	private WebElement LogoutIcon;
	//getters
	public WebElement getLogoutIcon() {
		return LogoutIcon;
	}
	@FindBy(xpath="//li[text()='My Profile']")
	private WebElement MyProfilelink;
	
	public WebElement getMyProfileLink() {
		return MyProfilelink;
	}

		
}
