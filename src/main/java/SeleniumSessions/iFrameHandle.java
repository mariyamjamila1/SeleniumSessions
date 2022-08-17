package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrameHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");

		driver.findElement(By.cssSelector("div#imageTemplateContainer img")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));

		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Ahmed");
		Thread.sleep(3000);

		driver.switchTo().defaultContent();
	}

}
