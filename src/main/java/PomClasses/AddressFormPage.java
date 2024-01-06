package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressFormPage {
	public WebDriver driver;
	//initialisation of Webelement
	
	public AddressFormPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(id="Name")
	private WebElement nametextfield;
	
		
		public WebElement getNametextfield() {
			return nametextfield;
			
		}
		@FindBy(id="House/Office Info")
		private WebElement Houseofficeinformationtextfield;
		
		public WebElement getHouseofficeinformationtextfield() {
			return Houseofficeinformationtextfield;
		}
		
		@FindBy(id="Street Info")
		private WebElement streetinformationtextfield;
		
		public WebElement getstreetinformationtextfield() {
			return streetinformationtextfield;
			
		}
		@FindBy(id="Landmark")
		private WebElement Lamndmarktextfield;
		
		public WebElement getLamndmarktextfield() {

			return Lamndmarktextfield;
			
		}
		@FindBy(id="Country")
		private WebElement Countrydropdown;
		
		public WebElement getCountrydropdown() {
			return Countrydropdown;
			
		} 
		@FindBy(id="State")
		private WebElement statedropdown;
		
		public WebElement getstatedropdown() {
			return statedropdown;
		}
		@FindBy(id="City")
		private WebElement Citydropdown;
		
		public WebElement getCitydropdown() {
			return Citydropdown;
			
		}
		@FindBy(id="Pincode")
		private WebElement pincodetextfield;
		
		public WebElement getpincodetextfield() {
			return pincodetextfield;
			
		}
		@FindBy(id="Phone Number")
		private WebElement phonenumbertextfield;
		
		public WebElement getPhonenumbertextfield() {
			return phonenumbertextfield;
			
			
		}
		@FindBy(xpath="//button[text()='Add Address']")
		private WebElement addaddressbutton;
		
		public WebElement getAddaddressbutton() {
			return addaddressbutton;
		}

		public WebElement getAddAddressButton() {
			// TODO Auto-generated method stub
			return null;
		}

		
		
	}


