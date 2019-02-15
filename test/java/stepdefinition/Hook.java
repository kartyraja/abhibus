package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	
	public static WebDriver driver;

	@Before()
	public static void x() {
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\cucumber3\\jar\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	
	@After
	public static void y() {
		
		driver.close();
		driver.quit();
	}

}
