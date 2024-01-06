package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	
	public WebDriver driver;
	
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(id="loginbtn"),@FindBy(xpath="//button[text()='Login']")})
private WebElement mainLoginButton;

public WebElement getmainLoginButton() {
	return mainLoginButton;
}
}
