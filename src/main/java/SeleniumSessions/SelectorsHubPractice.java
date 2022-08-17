package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectorsHubPractice {

		static WebDriver driver;

		public static void main(String[] args){
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://selectorshub.com/xpath-practice-page/");
	
			//driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td"));
		selectUsername("Kevin.Mathews");
		selectUsername("Jasmine.Morgan");
		
		}
		public static void selectUsername(String UserName) {
			driver.findElement(By.xpath("//a[text()='"+UserName+"']/parent::td/preceding-sibling::td")).click();
			
		}

}
