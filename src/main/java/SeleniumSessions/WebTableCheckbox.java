package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableCheckbox {

		static WebDriver driver;

		public static void main(String[] args){
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://selectorshub.com/xpath-practice-page/");
//			driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
//			.click();
			
			//if duplicate values were available and you wanted to access the first, use position/index
//			(//a[text()='Joe.Root'])[1]/parent::td/preceding-sibling::td/input[@type='checkbox']
			
			selectUserName("Joe.Root");
			selectUserName("John.Smith");
	}
		public static void selectUserName(String userName) {
		
			driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
			.click();
		}

}
