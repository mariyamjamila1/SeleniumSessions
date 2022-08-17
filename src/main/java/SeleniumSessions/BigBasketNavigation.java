package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasketNavigation {
static WebDriver driver;
	
//TRY THIS WITH BY LOCATOR INSTEAD OF STRINGS/LINKTEXT --
//CREATE XPATH, PRINT ALL THE MENU ITEMS USING FOR LOOP, CLICK ON ONE OF THE ITEMS,  
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		Thread.sleep(2500);
		selectLevel4Prod("Beverages", "Tea", "Green Tea", "Tata Tea");
		
	}
	public static void selectLevel4Prod(String l1, String l2, String l3, String l4) throws InterruptedException {
		
		WebElement mainCat = driver.findElement(By.cssSelector("a.meganav-shop"));
		
		Actions act = new Actions(driver);
		act.moveToElement(mainCat).perform();
		Thread.sleep(2000);
		
		act.moveToElement(driver.findElement(By.linkText(l1))).perform();
		Thread.sleep(1500);
		
		act.moveToElement(driver.findElement(By.linkText(l2))).perform();
		Thread.sleep(1500);
		
		act.moveToElement(driver.findElement(By.linkText(l3))).perform();
		Thread.sleep(1500);
		
		act.moveToElement(driver.findElement(By.linkText(l4))).click().build().perform();
		Thread.sleep(1500);
		
}
}
