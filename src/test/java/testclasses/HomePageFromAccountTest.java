package testclasses;

import org.testng.annotations.Test;

import pages.MyAccountPage;
import utilities.DriverSetup;

public class HomePageFromAccountTest extends DriverSetup{
	
	MyAccountPage accountpage = new MyAccountPage();
	
	@Test
	public void toHomePage() throws InterruptedException {
		
		accountpage.backToHomePageClick();
		Thread.sleep(2000);
		
	}

}
