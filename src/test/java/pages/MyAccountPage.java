package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.testng.annotations.Test;

public class MyAccountPage extends BasePage{
	
	By BACK_TO_HOME_PAGE = By.xpath("//img[@alt='PC House']");
	
	
	public void backToHomePageClick() throws InterruptedException {
        
		click(BACK_TO_HOME_PAGE);
		//Thread.sleep(2000);
		
	}

}
