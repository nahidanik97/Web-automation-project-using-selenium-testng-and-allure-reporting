package testclasses;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.HomePage;
import utilities.DriverSetup;

public class HomePageTest extends DriverSetup{
	
	HomePage homepage = new HomePage();
	
	@Test (priority = 0)
	public void homePageStartup() {

		getDriver().get("https://www.pchouse.com.bd/");
		assertEquals(getDriver().getTitle(), homepage.HOMEPAGE_TITLE);
		System.out.println(getDriver().getTitle());
	}
	
	
	@Test (priority = 1)
	public void clickOnAccountButton() throws InterruptedException {
		homepage.clickOnAccountButton();
		Thread.sleep(2000);
	}


}
