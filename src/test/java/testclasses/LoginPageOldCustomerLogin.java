package testclasses;

import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.DriverSetup;

public class LoginPageOldCustomerLogin extends DriverSetup{
	
	LoginPage loginpage = new LoginPage();
	
	@Test (dataProvider = "logindata")
	public void customerLogin(String email, String pass) throws InterruptedException {
		loginpage.ReturningCustomerLOgin(email, pass);
		Thread.sleep(2000);
		
}

}
