package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		//type=file must be there for Selenium to be able to handle it
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\16468\\Downloads\\geckodriver-v0.31.0-win64\\");
	
		
	
	
	}

}
