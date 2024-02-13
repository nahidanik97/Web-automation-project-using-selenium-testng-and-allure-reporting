package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {

	private static String browsername = System.getProperty("browser", "chrome");


	private static final ThreadLocal<WebDriver> DRIVER_LOCAL = new ThreadLocal();

	public static WebDriver getDriver() {
		return DRIVER_LOCAL.get();
	}

	public static void setDriver(WebDriver driver) {

		DriverSetup.DRIVER_LOCAL.set(driver);
	}

	public static WebDriver getBrowser(String browsername) {

		switch (browsername.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
		case "edge":
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();
		default:
			throw new RuntimeException("Browser not found");
		}

	}

	@BeforeSuite
	public static synchronized void setBrowser() {
		WebDriver webdriver = getBrowser(browsername);
		webdriver.manage().window().maximize();
		setDriver(webdriver);
	}

	@AfterSuite
	public static synchronized void quitBrowser() {
		getDriver().quit();

	}
	
	@DataProvider (name = "signupform")
	public static Object dataSet1() {
		
		
		Object[][] objects= {{"Aaaa","Bbbb","test3@test.com","01711111111","qwerty1"}};
		
		return objects;
	}
	
	@DataProvider (name = "logindata")
	public static Object dataSet2() {
		
		
		Object[][] objects= {{"test1@test.com","qwerty"}};
		
		return objects;
	}
	
	@DataProvider (name = "checkoutdata")
	public static Object dataSet3() {
		
		
		Object[][] objects= {{"Abul","mirpur","Dhaka","cpupon","ASAP"}};
		
		return objects;
	}

}