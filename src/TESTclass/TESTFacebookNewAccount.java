package TESTclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Generics.BaseMethods;
import Generics.BaseTest;
import POMclass.POMFacebookNewAccount;

public class TESTFacebookNewAccount extends BaseTest  {
	//WebDriver driver;

	@Test
	public void submit() throws Exception {
		
		POMFacebookNewAccount obj=new POMFacebookNewAccount(driver);
		obj.facebookFormSubmition();
	}
}
