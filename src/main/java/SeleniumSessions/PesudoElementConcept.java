package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PesudoElementConcept {

		static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
			//window.getComputedStyle(document.querySelector("label[for='input-firstname']"),'::before').getPropertyValue('content')

			//We can handle pesudo elements using javascript executor, with the help of getComputedStyle
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String mand_text = js.executeScript("return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')").toString();
		
		System.out.println(mand_text);
		if(mand_text.contains("*")) {
			System.out.println("First name is a mandatory field");
		}
		
		
		
		}

}
