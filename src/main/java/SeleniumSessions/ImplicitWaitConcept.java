package SeleniumSessions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		// dynamic wait:
		// imp wait: global wait: will be applied for all the elements on the page
		// its only applicable for Webelements
		// not applicable for non WebElements such as alerts, url, title.

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//selenium
		// 3.x, deprecated
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// selenium 4.x
		// global timeout = 10 secs

		//Home page - 10 secs
		WebElement mac = driver.findElement(By.linkText("MacBook"));
		mac.click();
		
		//2nd page: for elements on second page 10 secs will also be applied
		//3rd page:10 secs
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// global timeout = 20 secs
		//Home page - 20 secs
		
		//forgotpwd: with 0 - nullify implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));


	
	}

}
