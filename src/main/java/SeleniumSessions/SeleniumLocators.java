package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocators {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//1. ID //unique attribute - I
		//2. name // multiple attributes can have the same name - II
//		driver.findElement(By.name("email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("test@123");
//		
//		By emailId = By.name("email");
//		String email_name = "email";
//		String email_password = "password";
//		
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(emailId, "test@gmail.com");
//		eleUtil.doSendKeys("name", email_password, "test@123");
	//	eleUtil.doClick(loginBtn);
		//eleUtil.doSendKeys("name",email_password, "test123");
		
		//3. class name: can be duplicate for multiple elements...use only when its unique, for the single element
//		driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");
		
		//4. Xpath: is not an attribute. its the address of the element in HTML DOM
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
//		By emailId = By.xpath("//*[@id=\"input-email\"]"); 
//		String password_xpath = "//*[@id=\"input-password\"]";
//		By loginBtn = By.xpath("//*[@id=\\\"content\\\"]/div/div[2]/div/form/input");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(emailId, "test@gmail.com");
//		eleUtil.doSendKeys("xpath", password_xpath, "test@123");
//		eleUtil.doClick(loginBtn);
		
		//5. css selector is not an attribute.
		
				//driver.findElement(By.cssSelector("#Form_submitForm_Name")).sendKeys("Tom");
				//*[@id="Form_submitForm_Name"]
				//#Form_submitForm_Name
				By firstName = By.cssSelector("#Form_submitForm_Name");
				ElementUtil eleUtil = new ElementUtil(driver);
				eleUtil.doSendKeys(firstName, "Tom");
				
			}
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
