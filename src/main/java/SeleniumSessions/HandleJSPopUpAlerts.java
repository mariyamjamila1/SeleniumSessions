package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleJSPopUpAlerts {
	static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
			driver.findElement(By.name("proceed")).click();
			Thread.sleep(3000);
			Alert alert = driver.switchTo().alert(); //NoAlertPresentException - if pop up is not present on the page
		
			String text = alert.getText();
			System.out.println(text);
		//	alert.sendKeys("testing");
		//	alert.accept();//accept the alert
		//	alert.dismiss();//dismiss the alert
			
		
		//Assignment : https://the-internet.herokuapp.com/javascript_alerts
			
		}

}
