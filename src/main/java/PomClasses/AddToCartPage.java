package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
 public WebDriver driver ;
 
 public AddToCartPage(WebDriver driver )
 {
	 PageFactory.initElements(driver, this);
	 
 }
 @FindBy(xpath="//p[text()='Levis Mens Regular Fit Tee']")
 private WebElement levisproduct;
 
 public WebElement getLevisproduct() {
	 return levisproduct;
 }
 @FindBy(xpath="//button[@id='buynow_fl']")
 private WebElement buynowButtonInAddtoCartPage;
 
 public WebElement getbuynowButtonInAddtoCartPage() {
	 return buynowButtonInAddtoCartPage;
 }
}
