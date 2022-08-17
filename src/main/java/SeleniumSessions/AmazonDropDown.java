package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonDropDown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		By allDepartments = By.id("searchDropdownBox");
		Select select = new Select(driver.findElement(allDepartments));
		List<WebElement> optionsList = select.getOptions();
		

		for(int i=0; i<optionsList.size()-1;) {
			String text = optionsList.get(i).getText();
			System.out.println(i+ ": "+ text);
			i++;
		}
		By search = By.cssSelector("input#twotabsearchtextbox"); 
		By locator = By.cssSelector("input#nav-search-submit-button");
		
		ElementUtil eleUtil= new ElementUtil(driver);
		eleUtil.doSelectByVisibleText(allDepartments, "Baby");
		
		eleUtil.doSearch(search, "Eczema cream");
		eleUtil.doClick(locator);
		Thread.sleep(2000);
	}
}
