package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
		//declaration
	@FindAll({
		@FindBy(xpath="//*[name()='svg' and @data-testid='SettingsIcon']"),
		@FindBy(xpath="//button[@aria-label='Account setrings']")
	})
	private WebElement AccountSettingsbutton;
	
	public WebElement getAccountSettingsbutton() {
		return AccountSettingsbutton;
		
	}
	@FindBy(xpath="//a[@href='/men' and @id='men']")
	private WebElement menmenulink;
	
	
	public WebElement getmenmenulink() {
		return menmenulink;
	}
	
	
	@FindBy(xpath="//a[@href='/men' and @id='men']")
	private WebElement Tshirtpopuplink;
	
	public WebElement getTshirtpopuplink() {
		return Tshirtpopuplink;
	}
	
	@FindBy(xpath="//a[@id='cart']")
	private WebElement addtoCart;
	
	
	public WebElement getaddtoCartlink() {
		return addtoCart;
	}


	public void javaScriptClick(WebDriver driver2) {
		// TODO Auto-generated method stub
		
	}
}
