package Generics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BaseMethods {

	public void dropDownByVisibleTest(WebElement ele,String text) {
		Select sel=new Select(ele);
		sel.selectByVisibleText(text);
	}
	public void dropDownByValue(WebElement ele,String value) {
		Select sel=new Select(ele);
		sel.selectByValue(value);
	}
	public void dropDownByIndex(WebElement ele,int index) {
		Select sel=new Select(ele);
		sel.selectByIndex(index);
	}
	
	
	
	
}
