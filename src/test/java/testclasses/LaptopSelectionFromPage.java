package testclasses;

import org.testng.annotations.Test;

import pages.AppleLaptopSelectionPage;
import utilities.DriverSetup;

public class LaptopSelectionFromPage extends DriverSetup{
	
	AppleLaptopSelectionPage applepage = new AppleLaptopSelectionPage();
	
	@Test
	public void selectLaptop() throws InterruptedException {
		
		applepage.selectProduct();
		Thread.sleep(2000);
		
	}

}
