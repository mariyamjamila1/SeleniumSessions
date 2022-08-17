package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\16468\\Downloads\\chromedriver_win32\\chromedriver.exe");

		//WebDriverManager.chromedriver().create(); //closes the window automatically
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.manage().window().maximize();
		driver.get("https://www.google.com"); // enter url
		
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);


	}

}
