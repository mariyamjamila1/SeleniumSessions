package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelectWithSelectClassOnly {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");

		// driver.manage().window().maximize();

		By country = By.id("Form_submitForm_Country");
		// By state = By.id("Form_submitForm_State");
		//List<WebElement> optionsList = driver.findElements(By.cssSelector("select#Form_submitForm_Country option"));
		By countryOptions = By.xpath("");
		
		
//		driver.findElement(country).sendKeys("India");
//
//		Select select = new Select(driver.findElement(country));
//		List<WebElement> optionsList = select.getOptions();
//
//		for (WebElement e : optionsList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(e.getText().equals("India")) {
//				e.click();
//				break;
//			}
//		}

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectValuesUsingOptions(By locator,String value) {
		Select select = new Select(driver.findElement(locator));
		List<WebElement> optionsList = select.getOptions();

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if(e.getText().equals(value)) {
				e.click();
				break;
			}
		}
	}
	public static void doSelectValuesFromDropDown(By locator,String value) {
		Select select = new Select(getElement(locator));

		List<WebElement> optionsList = select.getOptions();

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if(e.getText().equals(value)) {
				e.click();
				break;
			}
		}
	}
	
}
