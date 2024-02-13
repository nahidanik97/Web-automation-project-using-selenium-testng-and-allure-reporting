package testclasses;

import org.testng.annotations.Test;

import pages.AppleLaptopSelectionPage;
import pages.AppleSelectedPage;
import utilities.DriverSetup;

public class SelectedProductPageTest extends DriverSetup{
	
	AppleSelectedPage selectedpage = new AppleSelectedPage();
	
	@Test
	public void addToCartTest() throws InterruptedException {
		
		selectedpage.clickOnAddToCart();
		Thread.sleep(2000);
		
	}

}
