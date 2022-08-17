package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignatureActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cocosign.com/signature-generator/draw/");

		WebElement canvas = driver.findElement(By.id("signature-pad"));
		Actions act = new Actions(driver);
		
		Action signature = act.click(canvas)
			.moveToElement(canvas, 1, 2)
			.clickAndHold(canvas)
			.moveToElement(canvas, 50, -20)
			.moveByOffset(50, -50)
			.moveByOffset(-30, -50)
			.moveByOffset(50, -80)
			.moveByOffset(50, 50)
			.moveByOffset(20, -30)
			.moveByOffset(40, -10)
			.moveByOffset(3, 3).release(canvas)
			.build();
		

			
		signature.perform();
		
		
	}

}
