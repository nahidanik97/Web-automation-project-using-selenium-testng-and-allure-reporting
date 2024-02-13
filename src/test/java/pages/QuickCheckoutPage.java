package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class QuickCheckoutPage extends BasePage {
	
	By BILLINGADDRESS_NAME = By.xpath("//input[@id='input-payment-firstname']");
	By BILLINGADDRESS_ADDRESS = By.xpath("//input[@id='input-payment-address-1']");
	By REGION_STATE_DROPDOWN = By.xpath("//select[@id='input-payment-zone']");
	By ENTER_COUPON = By.xpath("//input[@id='input-coupon']");
	By COMMENT_AREA = By.xpath("//textarea[@placeholder='Add Comments About Your Order']");
	By CONFIRM_ORDER_BUTTON = By.xpath("//button[@id='quick-checkout-button-confirm']");
	By COUPON_SUBMIT_BUTTON = By.xpath("//div[@class='form-group form-coupon']/div/span/button");
	By TERMS_AND_CONDITION_CHECKBOX = By.xpath("//label[contains(text(),'I have read and agree to the ')]");
	
	
	
	
	public void fillQuickCheckout(String name,String address,String region_name , String coupon ,String comment) throws InterruptedException {
		
		sendKeys(BILLINGADDRESS_NAME, name);
		sendKeys(BILLINGADDRESS_ADDRESS, address);
		WebElement region = getDriver().findElement(REGION_STATE_DROPDOWN);
		Select select = new Select(region);
		select.selectByVisibleText(region_name);
		//Thread.sleep(2000);
		sendKeys(ENTER_COUPON, coupon);
		click(COUPON_SUBMIT_BUTTON);
		//Thread.sleep(2000);
		sendKeys(COMMENT_AREA, comment);
		//Thread.sleep(8000);
		click(TERMS_AND_CONDITION_CHECKBOX);
		takeScreanShot("checkout_data");
}

//	public void confirmButton() throws InterruptedException {
//		
//		click(CONFIRM_ORDER_BUTTON);
//		Thread.sleep(2000);
//		
//	}
	

}
