package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanguageLinks {

		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
////div[@class='footer-main']//a	
////aside[@id='column-right']//a
			}

}
