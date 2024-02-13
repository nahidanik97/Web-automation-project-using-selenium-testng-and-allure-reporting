package testclasses;

import org.testng.annotations.Test;

import pages.ShoppingCartPage;
import utilities.DriverSetup;

public class ShoppingCartTest extends DriverSetup{
	
	ShoppingCartPage cart = new ShoppingCartPage();
	
	@Test
	public void ckeckOutClick() throws InterruptedException {
		
		cart.clickCheckout();
		Thread.sleep(2000);
		
		
	}

}
