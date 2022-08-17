package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
			
			
			ElementUtil eleUtil = new ElementUtil(driver);
			//By locator = By.xpath("//aside[@id='column-right']//a[contains(text(),'Forgotten Password')]");
			List<WebElement> itemList = driver.findElements(By.xpath("//aside[@id='column-right']//a[@class='list-group-item']"));
			//By itemName = By.linkText("Forgotten Password");
			System.out.println("Total Items on the List: " + itemList.size());
		
			for(WebElement e : itemList) {
				String text = e.getText();
				System.out.println(text);
				//if(text.contains("Forgotten Password")) {
					//e.click();
				}
			
			eleUtil.doClick(By.xpath("//aside[@id='column-right']//a[contains(text(),'Forgotten Password')]"));
		
		
		
		}

}
