package PomClasses;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class OrderConformationPage {

	public WebDriver driver;
		
		public OrderConformationPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath="//h1[text()='Order Confirmed']")
		private WebElement OrderConfirmedText;
		
		public WebElement getOrderConfirmedText() {
			return OrderConfirmedText;
		}
	}



