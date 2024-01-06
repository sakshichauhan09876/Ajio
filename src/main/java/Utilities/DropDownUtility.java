package Utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtility {
	
	public void selectdropDownByVisibleText(String textofoption,WebElement selectTagOfDropDown) {
	Select select=new Select(selectTagOfDropDown);
	select.selectByVisibleText(textofoption);
	}
public void selectdropDownByValueattributeValue(String valueattributevalue,WebElement selectTagOfDropDown) {
		Select select=new Select(selectTagOfDropDown);
		select.selectByValue(valueattributevalue);
	}
public void selectdropDownByIndex(int index,WebElement selectTagOfDropDown) {
	Select select=new Select(selectTagOfDropDown);
	select.selectByIndex(index);
}
public void deselectdropDownByVisibleText(String textofoption,WebElement selectTagOfDropDown) {
	Select select=new Select(selectTagOfDropDown);
	select.deselectByVisibleText(textofoption);
}	
public void deselectdropDownByValueattributeValue(String valueattributevalue,WebElement selectTagOfDropDown) {
	Select select=new Select(selectTagOfDropDown);
	select.deselectByValue(valueattributevalue);
}
public void deselectdropDownByIndex(int index,WebElement selectTagOfDropDown) {
	Select select=new Select(selectTagOfDropDown);
	select.deselectByIndex(index);
	
}
public ArrayList<String> ToGetAlloptiont(WebElement selectTagOfDropDown){
	Select select=new Select(selectTagOfDropDown);
	List<WebElement> alloptions=select.getOptions();
	ArrayList<String> alloptionsTexts=new ArrayList<String>();
	for(WebElement ele:alloptions) {
		
	}
	return alloptionsTexts;
	}
public WebElement ToGetParticularOptionsIndex(WebElement selectTagOfDropDown,int indexofOptions) {
	Select select=new Select(selectTagOfDropDown);
	List<WebElement> alloptions=select.getOptions();
	WebElement particularOptionsWebElement=alloptions.get(indexofOptions);
	return particularOptionsWebElement;
	
}
}