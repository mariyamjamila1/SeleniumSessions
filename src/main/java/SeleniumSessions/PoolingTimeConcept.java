package SeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PoolingTimeConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		By search = By.id("twotabsearchtextbox");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10),Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(search)).sendKeys("Macbook");


	}
	
	public static WebElement waitForElementVisible(By locator, int timeOut, int pollingTime){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut),Duration.ofSeconds(pollingTime));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
}
