package pages;

import org.openqa.selenium.By;

public class ShoppingCartPage extends BasePage{
	
	By CHECKOUT_BUTTON = By.xpath("//div[@class='buttons clearfix']/div[2]/a");
	
	public void clickCheckout() throws InterruptedException {
		click(CHECKOUT_BUTTON);
		//Thread.sleep(5000);
		
	}

}
