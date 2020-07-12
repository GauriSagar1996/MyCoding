package POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.AutoConstant;
import Generics.BaseMethods;
import Generics.ExcelLibrary;

public class POMFacebookNewAccount extends BaseMethods  implements AutoConstant{

	//Declaration 
	//@FindBy(xpath = "//a[.='Create New Account']")
//	private WebElement CreatenewAccountButton;
	
	@FindBy (xpath = "(//input[@type='text'])[1]")
	private WebElement FirstNameTextFeild;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement SurnameTextFeild;
	
	@FindBy (xpath = "(//input[@type='text'])[3]")
	private WebElement MobEmailTextFeild;
	
	@FindBy (xpath ="//input[@aria-label='Re-enter email address']")
	private WebElement ReenterEmailAddress;
	
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement PasswordTextFeild;

	@FindBy (xpath = "//select[@aria-label='Day']")
	private WebElement SelectDayDropDown;
	
	@FindBy  (xpath = "//select[@aria-label='Month']")
	private WebElement SelectMonthDropDown;
	
	@FindBy (xpath = "//select[@aria-label='Year']")
	private WebElement SelectYearDropDown;
	
	@FindBy (xpath = "(//input[@type='radio'])[1]")
	private WebElement FemaleRadioButton;
	
	@FindBy (xpath = "(//input[@type='radio'])[2]")
	private WebElement MaleRadioButton;
	
	@FindBy(xpath = "(//input[@type='radio'])[3]")
	private WebElement CustomeRadioButton;
	
	@FindBy (xpath ="(//button[@type='submit'])[1]")
	private WebElement SubmitButton;
	
	//Initialization
	
	public POMFacebookNewAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//Utilization
	
	public void facebookFormSubmition() throws Exception
	{
		
		FirstNameTextFeild.sendKeys(ExcelLibrary.getCellValue(excel_path, "Sheet1", 1, 0));
		SurnameTextFeild.sendKeys(ExcelLibrary.getCellValue(excel_path, "Sheet1", 1, 1));
		MobEmailTextFeild.sendKeys(ExcelLibrary.getCellValue(excel_path, "Sheet1", 1, 2));
		ReenterEmailAddress.sendKeys(ExcelLibrary.getCellValue(excel_path, "Sheet1", 1, 2));
		PasswordTextFeild.sendKeys(ExcelLibrary.getCellValue(excel_path, "Sheet1", 1, 3));
		
		dropDownByVisibleTest(SelectDayDropDown, "19");
		dropDownByVisibleTest(SelectMonthDropDown, "Jan");
		dropDownByVisibleTest(SelectYearDropDown, "1996 ");
		FemaleRadioButton.click();
		SubmitButton.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
