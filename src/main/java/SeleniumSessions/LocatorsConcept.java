package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
	
		//webElement +actions(click, sendKeys, getText, isDisplayed...)
		
		//1. ID
		//1st Approach:
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//2nd Approach: Comparatively better approach caz you can reuse using webElement
//		WebElement emaildId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		emaildId.sendKeys("naveen@gmail.com");
//		password.sendKeys("test@123");
		
		//3rd. By locator: AKA Object Repository, better approach, maintain the by locator and create the WebElement only when required.
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement emailEle = driver.findElement(emailId);
//		WebElement pwdEle = driver.findElement(password);
//		
//		
//		emailEle.sendKeys("naveen@gmail.com");
//		pwdEle.sendKeys("test@123");
		
		//4.By locator + generic function //Better , driver won't interact with server unnecessarily.
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getElement(emailId).sendKeys("naveen@gmail.com");
//		getElement(password).sendKeys("test@123");
		
		//5.By locator + generic functions for element and actions:
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		doSendKeys(emailId, "naveen@gmail.com");
//		doSendKeys(password,"test@123");
	
		
		//6th: By locator + generic functions for Element and actions in some util class:
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(emailId, "test@gmail.com");
//		eleUtil.doSendKeys(password, "test@123");
		
	
		//7th: using util in a different class
		
		//8th String locator + generic functions for elements and actions in some util class
		String email_Id = "input-email";
		String password_Id = "input-password";
		
}

	public static By getBy(String locatorType, String selector) {

		By locator = null;

		switch (locatorType.toLowerCase()) {
		case "id":
			locator = By.id(selector);
			break;
		case "name":
			locator = By.name(selector);
			break;
		case "class":
			locator = By.className(selector);
			break;
		case "xpath":
			locator = By.xpath(selector);
			break;
		case "cssselector":
			locator = By.cssSelector(selector);
			break;
		case "linktext":
			locator = By.linkText(selector);
			break;
		case "partiallinktext":
			locator = By.partialLinkText(selector);
			break;
		case "tagname":
			locator = By.tagName(selector);
			break;

		default:
			break;
		}

		return locator;

	}
	public void doSendKeys(String locatorType, String selector, String value) {
		By locator = getBy(locatorType, selector);
		getElement(locator).sendKeys(value);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}

