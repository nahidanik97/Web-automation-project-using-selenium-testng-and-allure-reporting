package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	
	By NEW_CUSTOMER_CONTINUE_BUTTON = By.xpath("//a[contains(text(),'Continue')]");
	By RETURNING_CUSTOMER_LOGIN_BUTTON = By.xpath("//button[@class='btn btn-primary']");
	By RETURNING_CUSTOMER_EMAIL = By.xpath("//input[@id='input-email']");
	By RETURNING_CUSTOMER_PASSWORD = By.xpath("//input[@id='input-password']");
	
	public void clickOnNewCustomerContinueButton() {
		
		click(NEW_CUSTOMER_CONTINUE_BUTTON);
		
	}
	
	public void ReturningCustomerLOgin(String email, String pass) throws InterruptedException {
		
		sendKeys(RETURNING_CUSTOMER_EMAIL, email);
		//Thread.sleep(4000);
		sendKeys(RETURNING_CUSTOMER_PASSWORD, pass);
		//Thread.sleep(4000);
		click(RETURNING_CUSTOMER_LOGIN_BUTTON);
		//Thread.sleep(8000);
		
	}

}
