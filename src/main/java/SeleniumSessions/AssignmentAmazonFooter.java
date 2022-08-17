package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentAmazonFooter {

		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
			// (//div[@class='navFooterLinkCol navAccessibility'])//li[@class='nav_first']

			ElementUtil eleUtil = new ElementUtil(driver);
			eleUtil.doClick("cssselector", "div#nav-al-your-account,a[id='nav_prefetch_yourorders']");
//			System.out.println(" ");
//			List<WebElement> footerList = driver.findElements(By.xpath("(//div[@class='navFooterLinkCol navAccessibility'])//li[@class='nav_first']"));
//			System.out.println("Number of Columns in the Footer: " +footerList.size());
//
//		
//			for(int i=0; i<footerList.size();){
//				
//				String text = footerList.get(i).getText();
//				i = i+1;
//				System.out.println("First Item of Column " + i+ ": " + text);
//
//			}
//			
//			driver.manage().window().minimize();
//		
		}

}
