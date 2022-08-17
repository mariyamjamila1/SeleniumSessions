package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVClose {
		
		public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver","C:\\Users\\16468\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); // launch chrome
			
			driver.manage().window().maximize();
			driver.get("https://naveenautomationlabs.com/opencart/"); // enter url
			
			String title = driver.getTitle();
			System.out.println("Page title is: " + title);

			
			String url = driver.getCurrentUrl();
			System.out.println("Current Page URL is: " + url);

			driver.close();// session ID expires/invalid and NoSuchSessionException is thrown and you can no longer interact with the browser
			// to interact with the browser again you have to launch chrome again
			
			System.out.println(driver.getTitle());
			// driver.quit();//with quit session ID becomes null

		}
		
}	
			
			
			
			
			
			