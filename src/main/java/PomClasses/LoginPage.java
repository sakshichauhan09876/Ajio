 package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//declaration
	@FindBy(id="Email")
	private WebElement EmailTextField;
	
	public WebElement getEmailTextField() {
		return EmailTextField;
	}
	
	//declaration
	@FindBy(id="password")
	private WebElement PasswordTextField;
	
	public WebElement getPasswordTextField() {
		return PasswordTextField;
		
	}
	//declaration
	@FindBy(id="Login")
	private WebElement LogintextField;
	
	public WebElement getLogintextField() {
		return LogintextField;
	}

}
