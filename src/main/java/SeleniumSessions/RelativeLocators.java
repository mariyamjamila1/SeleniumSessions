package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");

		WebElement baseEle = driver.findElement(By.linkText("Sorel-Tracy, Canada"));
		
		String rightIndex = driver.findElement(RelativeLocator.with(By.tagName("p")).toRightOf(baseEle)).getText();
		System.out.println(rightIndex);
		
		String leftRank = driver.findElement(RelativeLocator.with(By.tagName("p")).toLeftOf(baseEle)).getText();
		System.out.println(leftRank);
		
		String belowCity = driver.findElement(RelativeLocator.with(By.tagName("p")).below(baseEle)).getText();
		System.out.println(belowCity);
		
		String aboveCity = driver.findElement(RelativeLocator.with(By.tagName("p")).above(baseEle)).getText();
		System.out.println(aboveCity);
		
		String nearCity = driver.findElement(RelativeLocator.with(By.tagName("p")).near(baseEle)).getText();
		System.out.println(nearCity);
		
		//TRY TO AVOID USING FINDELEMENTS, IT WILL RETURN EVERYTHING THATS BELOW LOCATOR
//	List<WebElement> belowEles = driver.findElements(RelativeLocator.with(By.tagName("p")).below(baseEle));
//	System.out.println(belowEles);
//	for(WebElement e : belowEles) {
//		System.out.println(e.getText());
//	}
	
	}

	
//	public static void findElementUsingRelativeLocator() {
//		
//	}
}
