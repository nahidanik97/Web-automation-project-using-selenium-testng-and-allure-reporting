package pages;

import org.openqa.selenium.By;

public class AppleLaptopSelectionPage extends BasePage{
	
	By LAPTOP_ON_PAGE = By.xpath("//div[@class='main-products product-grid']/div[2]");
	
	public void selectProduct() throws InterruptedException {
		
		click(LAPTOP_ON_PAGE);
		//Thread.sleep(10000);
		
	}
	

}
