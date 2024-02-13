package testclasses;

import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.DriverSetup;

public class LoginPageNewCustomerTest extends DriverSetup{
	
	LoginPage loginpage = new LoginPage();
	
	@Test
	public void clickOnNewCustomerContinueButton() {
		loginpage.clickOnNewCustomerContinueButton();
}
	

}
