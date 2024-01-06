package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfile {
	public WebDriver driver;
	
	public MyProfile(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//div[text()='My Address']")
private WebElement MyAddressLink;

public WebElement getMyAddressLink() {
	return MyAddressLink;
	
}

public WebElement getMyProfileLink() {
	// TODO Auto-generated method stub
	return null;
}

}
