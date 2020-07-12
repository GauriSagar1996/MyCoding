package Generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest implements AutoConstant{

	public WebDriver driver;
	@BeforeMethod
	public void basic() {
		System.setProperty(chrome_key,chrome_value);
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
	    
	
	}

	@AfterMethod
	public void close() {
		//driver.quit();
	}
}
