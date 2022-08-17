package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageElement {

	static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
			//driver.findElement(By.name("search11")).sendKeys("macbook");
			
//			List<WebElement> searchList = driver.findElements(By.name("search"));
//			if(searchList.size() == 1) {
//				System.out.println("search is present on the page");
//			
//		
//			}
//			boolean flag = driver.findElement(By.name("search")).isDisplayed();
//			System.out.println(flag);
//			if(flag) {
//				System.out.println("search is present on the page");
//			}
//			By search = By.name("search");
//			if(checkSingleElementExist(search)) {
//				System.out.println("Search exists only one time on the page");
//			}
//			By forgotPwd = By.linkText("Forgotten Password");
//			if(checkMultileElementsExist(forgotPwd)) {
//				System.out.println("Forgot Password is displayed multipe times");
//				if(getElementCount(forgotPwd)==2) {
//					System.out.println("forgot pwd link appears 2 times on the page");
//				}
//			}
		//	driver.findElement(By.xpath(xpathExpression))
			
		}
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		}
		
		public static boolean doIsDisplayed(By locator) {
			return getElement(locator).isDisplayed();
			
		}
		
		public static int getElementCount(By locator) {
			int eleCount = getElements(locator).size();
			return eleCount;
			
		}
		public static boolean checkSingleElementExist(By locator) {
			if(getElementCount(locator)==1) {
				return true;
			}
			return false;
		}
		public static boolean checkMultileElementsExist(By locator) {
			if(getElementCount(locator)>1) {
				return true;
			}
			return false;
		}
}
