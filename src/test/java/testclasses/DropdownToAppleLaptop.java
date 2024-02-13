package testclasses;

import org.testng.annotations.Test;

import pages.HomePage;
import utilities.DriverSetup;

public class DropdownToAppleLaptop extends DriverSetup{
	
	HomePage homepage = new HomePage();
	
   @Test	
   public void clickToAppleLaptopTest() throws InterruptedException {
      homepage.clickOnAppleLaptop();
      Thread.sleep(2000);
}
	
	

}
