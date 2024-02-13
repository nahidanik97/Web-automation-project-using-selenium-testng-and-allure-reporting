package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegistrationPage extends BasePage{
	
	By FIRST_NAME_FIELD = By.xpath("//input[@id='input-firstname']");
	By LAST_NAME_FIELD = By.xpath("//input[@id='input-lastname']");
	By EMAIL_FIELD = By.xpath("//input[@id='input-email']");
	By TELEPHONE_FIELD = By.xpath("//input[@id='input-telephone']");
	By PASSWORD_FIELD = By.xpath("//input[@id='input-password']");
	By PASSWORD_CONFIRM_FIELD = By.xpath("//input[@id='input-confirm']");
	By SUBSCRIBE_YES = By.xpath("//div[@class='form-group']/div/label[1]");
	By SUBSCRIBE_NO = By.xpath("//div[@class='form-group']/div/label[2]");
	By PRIVACY_POLICY_CHECKBOX= By.xpath("//input[@name='agree']");
	By CONTINUE_BUTTON = By.xpath("//button[@class='btn btn-primary']");
	
	@Test
	public void inputCredentials(String fn , String ln ,String email , String telephone , String pass) throws InterruptedException {
		
		sendKeys(FIRST_NAME_FIELD, fn);
		sendKeys(LAST_NAME_FIELD, ln);
		sendKeys(EMAIL_FIELD, email);
		sendKeys(TELEPHONE_FIELD, telephone);
		sendKeys(PASSWORD_FIELD, pass);
		Thread.sleep(8000);
//		copyAll();
//		nextField();
//		paste();
		sendKeys(PASSWORD_CONFIRM_FIELD, pass);
		click(SUBSCRIBE_YES);
		click(PRIVACY_POLICY_CHECKBOX);
		takeScreanShot("signup_data");
		click(CONTINUE_BUTTON);
		Thread.sleep(8000);
		
		
		
	}
	
	

}
