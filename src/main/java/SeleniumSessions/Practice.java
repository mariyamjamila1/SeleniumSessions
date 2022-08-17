package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	
		By search = By.id("search_query_top");
		By suggListLocator = By.xpath("//div[@class='ac_results']//li[@class='ac_even']");

		//By suggListLocator1 = By.xpath("//div[@class='ac_results']//li[@class='ac_odd']");

		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		eleUtil.performSearch(search, "Dress", suggListLocator, "Faded");
		//eleUtil.performSearch(search, "Dress", suggListLocator1, "Faded");
		Thread.sleep(3000);
	}
	


}
