package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDomElement {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		//html DOM page
			//----frame/iframe
				//----shadow DOM
					//---input-tea
		//html DOM page
		//----frame/iframe
				//---input-tea

		//SVG ---xpath
		//ShadowDom --CSS --query selector
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(2000);
		driver.switchTo().frame("pact");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement tea =
		(WebElement) js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector('#tea')");
		tea.sendKeys("Masala tea");

	}

}
