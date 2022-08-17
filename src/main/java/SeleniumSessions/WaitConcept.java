package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		//Three Types of Wait:
		//1. static wait: Thread.sleep(5000) -- Java library
		//2. dynamic waits: Selenium Library
				//2a: Implicitly Wait
				//2b: Explicit Wait --waiting for a specific element to appear
				//2b.1: WebDriverWait
				//2b.2: FluentWait

		
		
		
	}
	public static Alert waitforAlert(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
		
		
		
	}
}
