package SeleniumSessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

		//1. Local Execution - Supports cross browser
//		WebDriver driver = new ChromeDriver();
//		
//		 driver = new FirefoxDriver();
//	
//		 driver = new SafariDriver();
//		
//		//2. chrome specific/ generally not used and not recommended for cross browser
//		ChromeDriver d1 = new ChromeDriver();
//		
//		
		//3. Local - Topcasting btwn RemoteWebDriver - Chrome driver
		
//		System.setProperty("webdriver.chrome.driver", "C:/Users/16468/Downloads/chromedriver_win32");
//		RemoteWebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		
		//4. Remote Execution - Topcasting btwn WD - RemoteWebDriver
	//	WebDriver driver = new RemoteWebDriver(remoteURLAddress, capabilities);
		
		//5. SearchContext - CD//reference check will be failed. NOT RECOMMENDED
		
		SearchContext driver = new ChromeDriver();
		
	
	
	}

}
