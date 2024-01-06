package TestCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PomClasses.AccountSettingPage;
import PomClasses.AddToCartPage;
import PomClasses.AddressFormPage;
import PomClasses.HomePage;
import PomClasses.MyAddressPage;
import PomClasses.MyProfile;
import PomClasses.NetBankingPage;
import PomClasses.OrderConformationPage;
import PomClasses.PaymentMethod;
import PomClasses.TshirtPage;
import PomClasses.addressPage;
import Utilities.BaseClass;

@Listeners(Utilities.ListenersUtility.class)
public class AddToCartTest extends BaseClass
{
	
	
	@Test(dataProvider="dataProviderAddress")
	public void Tc_AddAddress_001_Test(String home,String house_office,
		String street,String landmark,String country,String state,String city,String Dpin,String mobN) throws Throwable {
		System.out.println("add address");
		 Thread.sleep(5000);
		 HomePage hp=new HomePage(driver);
		 hp.javaScriptClick(driver);
	
		 Thread.sleep(3000);
		AccountSettingPage as=new AccountSettingPage(driver);
		as.getMyProfileLink().click();
Assert.assertEquals(driver.getCurrentUrl(),"https://www.shoppersstack.com/my-profile/my-profile-info");

		System.out.println("The my profile  page is opened");
		MyProfile mp=new MyProfile(driver);
		mp.getMyAddressLink().click();
		
		MyAddressPage ma=new MyAddressPage(driver);
		
		ma.getaddressformbutton().click();
		
		AddressFormPage afp=new AddressFormPage(driver);
		afp.getNametextfield().sendKeys(home);
		afp.getHouseofficeinformationtextfield().sendKeys(house_office);
		afp.getstreetinformationtextfield().sendKeys(street);
		afp.getLamndmarktextfield().sendKeys(landmark);
		WebElement counrtyDropdown=afp.getCountrydropdown();
		drpu.selectdropDownByVisibleText(country,counrtyDropdown);
		WebElement StateDropdown=afp.getstatedropdown();
		drpu.selectdropDownByVisibleText(state,StateDropdown);
		WebElement CityDropdown=afp.getCitydropdown();
		drpu.selectdropDownByVisibleText(city,CityDropdown);
		afp.getPhonenumbertextfield().sendKeys(Dpin);
		afp.getPhonenumbertextfield().sendKeys(mobN);
		afp.getAddAddressButton().click();		
	}
	
	@DataProvider
	public Object[][] dataProviderAddress() throws Throwable{	
		
		return du.accessAlladdress();
	}
	

	
	@Test(priority=1,dependsOnMethods="Tc_AddAddress_001_Test")
	public void Tc_EndToEndCashOnDelivery_Test() throws Throwable {	
	Thread.sleep(3000);
    System.out.println("first test case");
    String titleHomePage=driver.getTitle();
    Assert.assertEquals(titleHomePage,"ShoppersStack | Home"); 
    HomePage hp=new HomePage(driver);
    Thread.sleep(5000);
    WebElement menLink=hp.getmenmenulink(); 
    wu.mouseoverAction(driver,menLink);  
    hp.getTshirtpopuplink().click();  
    TshirtPage tsp=new TshirtPage(driver);
String currentUrl=driver.getCurrentUrl();
  Assert.assertEquals(currentUrl,"https://www.shoppersstack.com/sub-category/men-tshirt"); 
  wu.mouseoverAction(driver,tsp.gettshirttoplink());
    tsp.getLevisMensRegularfitProduct_addToCartButton().click();    hp.getaddtoCartlink().click();
   Assert.assertEquals(driver.getCurrentUrl(),"https://www.shoppersstack.com/cart"); 
    System.out.println("The cart page has opened");
   
    AddToCartPage ac=new AddToCartPage(driver);
   String levisProductTest= ac.getLevisproduct().getText();
   Assert.assertEquals(levisProductTest,"Levis Mens Regular Fit Tee");
    System.out.println("the product is added to cart");
    ac.getbuynowButtonInAddtoCartPage().click();
     String addresPageUrl = driver.getCurrentUrl();
     Assert.assertEquals(addresPageUrl,"https://www.shoppersstack.com/selectaddress");
     System.out.println("the address page is displayed"); 
    
    addressPage ap= new addressPage(driver);
     ap.getlovwebirdAddress().click();
     ap.getprocedButton().click();
     
     PaymentMethod pm=new PaymentMethod(driver);
     pm.getcashOndeliveryRadioButton().click();
     pm.getProceedButton().click();
     
     OrderConformationPage oc=new OrderConformationPage(driver);
     
     Assert.assertEquals(oc.getOrderConfirmedText().getText(),"Order Confirmed");
     System.out.println("The order got confiremed in cash on delivery");
	}

	@Test(priority=2,dependsOnMethods="Tc_AddAddress_001_Test")
	public void EndToEnd_NetBanikng() throws Throwable {
		Thread.sleep(3000);
	    System.out.println("first test case");
	    String titleHomePage=driver.getTitle();
	    Assert.assertEquals(titleHomePage,"ShoppersStack | Home"); 
	    HomePage hp=new HomePage(driver);
	    Thread.sleep(5000);
	    WebElement menLink=hp.getmenmenulink(); 
	    wu.mouseoverAction(driver,menLink);  
	    hp.getTshirtpopuplink().click();  
	    TshirtPage tsp=new TshirtPage(driver);
	String currentUrl=driver.getCurrentUrl();
	  Assert.assertEquals(currentUrl,"https://www.shoppersstack.com/sub-category/men-tshirt"); 
	  wu.mouseoverAction(driver,((TshirtPage) tsp).gettshirttoplink());
	    tsp.getLevisMensRegularfitProduct_addToCartButton().click();    hp.getaddtoCartlink().click();
	   Assert.assertEquals(driver.getCurrentUrl(),"https://www.shoppersstack.com/cart"); 
	    System.out.println("The cart page has opened");
	   
	   AddToCartPage ac=new AddToCartPage(driver);
	   String levisProductTest= ac.getLevisproduct().getText();
	   Assert.assertEquals(levisProductTest,"Levis Mens Regular Fit Tee");
	    System.out.println("the product is added to cart");
	    ac.getbuynowButtonInAddtoCartPage().click();
	     String addresPageUrl = driver.getCurrentUrl();
	     Assert.assertEquals(addresPageUrl,"https://www.shoppersstack.com/selectaddress");
	     System.out.println("the address page is displayed"); 
	    
	    addressPage ap= new addressPage(driver);
	     ap.getlovwebirdAddress().click();
	     ap.getprocedButton().click();
	     PaymentMethod pm=new PaymentMethod(driver);
	    WebElement netbankingbutton= pm.getNetBankingButton();
	    wu.javaScriptclick(driver,netbankingbutton);
	    
	     pm.getProceedButton().click();
	     NetBankingPage nb= new NetBankingPage(driver);
	     driver.switchTo().frame(nb.getnetBankingFrameTag());
	     
	     nb.getIDHC_radioButton().click();
	     nb.getsubmitButton().click();
	     
	     
	     
	}
	
}
