package pages;

import org.openqa.selenium.By;

public class AppleSelectedPage extends BasePage {
	
	By AddToCart = By.xpath("//a[@id='button-cart']");
	
	public void clickOnAddToCart() throws InterruptedException {
		click(AddToCart);
		//Thread.sleep(4000);
		
	}

}
