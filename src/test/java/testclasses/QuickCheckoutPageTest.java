package testclasses;

import org.testng.annotations.Test;

import pages.QuickCheckoutPage;
import utilities.DriverSetup;

public class QuickCheckoutPageTest extends DriverSetup{
	
	QuickCheckoutPage checkout = new QuickCheckoutPage();
	
	@Test (dataProvider = "checkoutdata")
	public void checkoutFormFillup(String name, String address, String region, String coupon, String comment) throws InterruptedException {
		
		checkout.fillQuickCheckout(name, address, region, coupon, comment);
	
		
		Thread.sleep(15000);
	}
	
}
