package SeleniumSessions;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	//	driver.get("http://automationpractice.com/index.php");
//		ElementUtil eleUtil = new ElementUtil(driver);
//		By locator = By.xpath("//footer[@id='footer']//section[@id='block_various_links_footer']");
//		
//		eleUtil.checkMultileElementsExist(locator);
		
		driver.get("https://www.google.com/");
		List<WebElement> footerList = driver.findElements(By.xpath("//div[@class='L3eUgb']//div[@class='KxwPGc SSwjIe']"));
		System.out.println("Total items in Footer: " + footerList.size());
		for(int i=0; i<footerList.size(); i++) {
			String text = footerList.get(i).getText();
			
			System.out.println(text);
			
		}
//		for(WebElement e : footerList) {
//			String text = e.getText();
//			System.out.println(text);
//		}
		
		
		//		List<WebElement> footerList = driver.findElements(By.xpath("//div[@class='footer-container']/footer[@id='footer']"));
//		System.out.println("Total items in Footer: " + footerList.size());
//		for(WebElement e : footerList) {
//			String text = e.getText();
//			System.out.println(text);
		
			

	}

}