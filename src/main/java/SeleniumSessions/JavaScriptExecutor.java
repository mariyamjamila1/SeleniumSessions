package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
		
			//browser --- JavaScript
//			JavascriptExecutor js = ((JavascriptExecutor)driver);
//		
//			String title = js.executeScript("return document.title").toString();
//			System.out.println(title);
//			js.executeScript("alert('hello java')");
			//document.documentElement.innerText - useful for content testing, to check if important strings are present
	}

}
