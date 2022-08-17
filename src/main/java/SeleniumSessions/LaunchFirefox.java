package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\16468\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");

		//WebDriverManager.firefoxdriver().setup();
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		WebDriver driver1 = new EdgeDriver();
		WebDriver driver3 = new ChromeDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
