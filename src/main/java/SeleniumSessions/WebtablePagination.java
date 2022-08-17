package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtablePagination {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		
		//Multiple Selection:
		while(true) {
			if(driver.findElements(By.xpath("//td[text()='India']")).size() > 0) {
				selectMultipleCountry("India");
			}
		
		WebElement next = driver.findElement(By.linkText("Next"));
		if(next.getAttribute("class").contains("disabled")) {
			System.out.println("Pagination is over... country is not found");
			break;
		}
		next.click();
		Thread.sleep(1000);
	}
		
		//select India and US with the same logic using ARRAY or ARRAYLIST
		
		
		//Single selection:
//		while(true) {
//			if(driver.findElements(By.xpath("//td[text()='Naveen']")).size()>0) {
//				selectCity("Naveen");
//				break;
//			}
//			else {
//			WebElement next = driver.findElement(By.linkText("Next"));
//				if(next.getAttribute("class").contains("disable")) {
//					System.out.println("Pagination is over... country is not found");
//					break;
//				}
//				next.click();
//				Thread.sleep(1000);
//			}
//		}
	}
	public static void selectMultipleCountry(String country) {
		List<WebElement> eleList = driver.findElements(By.xpath("(//td[text()='India'])/preceding-sibling::td/input[@type='checkbox']"));
		for(WebElement e : eleList) {
			e.click();
		}
	
	}
	public static void selectCity(String country) {
	driver.findElement(By.xpath("//td[text()='"+country+"']/preceding-sibling::td/input[@type='checkbox']")).click();
	}

}
