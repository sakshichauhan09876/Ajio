package Utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
/** Author : Rohan Goyal
 * When we get element click intercepted exception (When element is hidden by other element)
 * Then we will use java script click
 * it will take WebDriver object and element ref on which you want to perform java script click
 *   @param driver 
 *   @param ele
 */
	
	public void javaScriptclick(WebDriver driver, WebElement ele) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",ele);
		}
	
	/**
	 * to avoid Element click Intercepted exception
	 * @param driver
	 * @param ele
	 */
	public void javaScriptSendKeys(WebDriver driver, WebElement ele,String data) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value=arguments[1];",ele,data);
		}

	/** Author : Rohan Goyal
ss	 * this method will scroll the webpage till given element 
	 * @param driver
	 * @param ele
	 */
	

	public void javaScriptScrollTillWebElement(WebDriver driver,WebElement ele) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoview(true);",ele);
		}

	/** Author: Rohan Goyal
	 * this method will scroll the web page with given coordinates
	 * @param driver
	 * @param xcoordinate
	 * @param ycoordinate
	 */
	

	public void javaScriptScrollBycoordinates(WebDriver driver, int xcoordinate,int ycoordinate) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scrollBy("+xcoordinate+","+ycoordinate+");");
		}
	/**Author: Rohan Goyal
	 * this method Will highlight the web Element border 2px red color
	 * @param driver
	 * @param ele
	 */

	public void javaScripthighlightwebelement(WebDriver driver, WebElement ele) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].style.border='2px solid red';",ele);
		}

	/**Author: Rohan Goyal
	 * To perform mouse over action on web element 
	 * @param driver
	 * @param ele
	 */
	 public  void mouseoverAction(WebDriver driver, WebElement ele) {
	Actions action=new Actions(driver);
	action.moveToElement(ele).perform();
	 }
	 
	 /**Author: Rohan Goyal
	 * To perform right operation on web element
	 * @param driver
	 * @param ele
	 */
	
	 public void rightclick(WebDriver driver, WebElement ele)
	 {
		 Actions action = new Actions(driver); 
		 action.contextClick(ele).perform();
	 }
	 
	 /**
		 * To perform double operation on web element
		 * @param driver
		 * @param ele
		 */
	 
	 public void doubleclick(WebDriver driver, WebElement ele)
	 {
		 Actions action = new Actions(driver); 
		 action.contextClick(ele).perform();
	 }
	

	 /**
		 * To perform drag and drop operation on web element
		 * @param driver
		 * @param ele
		 */
	 
	 public void draganddrop(WebDriver driver, WebElement draggingElment,WebElement dropingElment )
	 {
		 Actions action = new Actions(driver); 
		 action.dragAndDrop(draggingElment,dropingElment).perform();
	 }
	
	 /**
		 * To perform drag and drop operation on webelement
		 * @param driver
		 * @param ele
		 */
	 
	 public void clickonhold(WebDriver driver, WebElement ele)
	 {
		 Actions action = new Actions(driver); 
		 action.contextClick(ele).perform();
	 }
	 /**
		 * To perform scrolling of web page till the web element
		 * @param driver
		 * @param ele
		 */
	 
	 public void scrolltowebelementByActionclass(WebDriver driver, WebElement ele)
	 {
		 Actions action = new Actions(driver); 
		 action.contextClick(ele).perform();
	 }

	 /**
		 * This method will wait until given element reaches to click able state
		 * @param driver
		 * @param ele
		 */
	 
	 public void explicitlywaitelementtobeclickable(WebDriver driver,By locator, int timeDelay)
	 {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeDelay));
		 wait.until(ExpectedConditions.elementToBeClickable(locator));
	 }
	 /**
		 * This method will wait until given element is visible
		 * @param driver
		 * @param ele
		 */
	 
	 public void explicitlywaitelementtobeVisible(WebDriver driver,WebElement ele, int timeDelay)
	 {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeDelay));
		 wait.until(ExpectedConditions.visibilityOf(ele));
	 }
	 /**
		 * This method will wait until alert is present
		 * @param driver
		 * @param ele
		 */
	 
	 public void explicitlywaitforAlert(WebDriver driver, int timeDelay)
	 {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeDelay));
		 wait.until(ExpectedConditions.alertIsPresent());
	 }
	 
	 /**
		 * This method will wait particular page or particular(given) url is appeArs
		 * @param driver
		 * @param ele
		 */
	 
	 public void explicitlywaitforUrl(WebDriver driver, int timeDelay, String completeurl)
	 {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeDelay));
		 wait.until(ExpectedConditions.urlToBe(completeurl));
	 }
	 /**
		 * This method will wait particular page displayed/appeArs
		 * @param driver
		 * @param ele
		 */
	 
	 public void explicitlywaitforTitle(WebDriver driver, int timeDelay, String completeTitle)
	 {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeDelay));
		 wait.until(ExpectedConditions.titleIs(completeTitle));
	 }
}