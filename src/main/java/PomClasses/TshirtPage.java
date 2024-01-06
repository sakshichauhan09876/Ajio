package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TshirtPage {
	public WebDriver driver;
	
	public TshirtPage(WebDriver driver ) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='T-Shirts']")
	private WebElement tshirttoplink;
	
	public WebElement gettshirttoplink() {
		return tshirttoplink;
	}
	
	@FindBy(xpath="//span[text()='Levis Mens Reguler fit Tee']/../..//button")
	private WebElement LevisMensRegularfitProduct_addToCartButton;
	
	public WebElement getLevisMensRegularfitProduct_addToCartButton() {
		return LevisMensRegularfitProduct_addToCartButton;
	}

	

}
