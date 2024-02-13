package pages;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Allure;
import utilities.DriverSetup;

public class BasePage extends DriverSetup {
	
	public void click(By x) {
		getDriver().findElement(x).click();
	}

	public void copyAll() {
		Actions action = new Actions(getDriver());
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
	}
	
	public void nextField() {
		
		Actions action = new Actions(getDriver());
		action.sendKeys(Keys.TAB);
		
	}

	public void paste() {
		Actions action = new Actions(getDriver());
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
	}

	public void sendKeys(By x , String y) {
		getDriver().findElement(x).sendKeys(y);	
	}


	public WebElement elementViaPath(String x, String y) {
		if (y.toLowerCase().equals("xpath"))
			return getDriver().findElement(By.xpath(x));
		else if (y.toLowerCase().equals("name"))
			return getDriver().findElement(By.name(x));
		else if (y.toLowerCase().equals("id"))
			return getDriver().findElement(By.id(x));
		else if (y.toLowerCase().equals("class"))
			return getDriver().findElement(By.className(x));
		else if (y.toLowerCase().equals("cssid"))
			return getDriver().findElement(By.cssSelector("." + x));
		else if (y.toLowerCase().equals("cssclass"))
			return getDriver().findElement(By.cssSelector("#" + x));
		else
			return null;

	}

	public WebElement elementViaLocator(By locator) {
		return getDriver().findElement(locator);

	}
	
	public void waitForElementVisible(By x) {
		
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(x));
		
	}
	
	public void takeScreanShot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
		
	}

}
	


