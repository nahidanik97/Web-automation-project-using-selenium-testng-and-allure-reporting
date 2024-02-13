package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.DriverSetup;

public class HomePage extends BasePage{
	
	public String HOMEPAGE_TITLE = "Trusted Retail Computer Store In Bangladesh | PC House BD";
	
	By ACCOUNT_BUTTON = By.xpath("//span[contains(text(),'Account')]");
	By Monitor_Button = By.xpath("//span[contains(text(),'Monitor')]");
	By MONITOR_BUTTON_DELL = By.xpath("//li[@class='menu-item main-menu-item main-menu-item-3 multi-level dropdown drop-menu']/div/ul/li[3]");
	By LAPTOPS_BUTTON_DROPDOWN = By.xpath("//span[contains(text(),'Laptops')]");
	By LAPTOP_BUTTON_INSIDE_DROPDOWN =By.xpath("//header/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/ul[1]/li[1]");
	By APPLE_INSIDE_LAPTOP_INSIDE_LAPTOPS= By.xpath("//header/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[2]");
	
	
	
	

	
	
	public void clickOnAccountButton() {
		click(ACCOUNT_BUTTON);
}
	
	public void clickOnAppleLaptop() throws InterruptedException {
		Actions action = new Actions(getDriver());

		action.moveToElement(getDriver().findElement(LAPTOPS_BUTTON_DROPDOWN)).perform();
		//Thread.sleep(2000);
		action.moveToElement(getDriver().findElement(LAPTOP_BUTTON_INSIDE_DROPDOWN)).perform();
		//Thread.sleep(2000);
		click(APPLE_INSIDE_LAPTOP_INSIDE_LAPTOPS);
		//Thread.sleep(3000);
}
	
	
	
}
