package testclasses;

import org.testng.annotations.Test;

import pages.RegistrationPage;
import utilities.DriverSetup;

public class ResgistrationTest extends DriverSetup{
	
	RegistrationPage registrationpage = new RegistrationPage(); 
	
	@Test (dataProvider = "signupform")
	public void submitRegistration(String fn, String ln, String email, String tele, String pass) throws InterruptedException {
		registrationpage.inputCredentials(fn, ln, email, tele, pass);
}

}
