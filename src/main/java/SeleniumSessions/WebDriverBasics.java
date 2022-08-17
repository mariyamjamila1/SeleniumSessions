package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	// start the Selenium server with binary/.exe file

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\16468\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com"); // enter url
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);

		// verification point/checkpoint/actual vs expected result
		if (title.equals("Amazon.com. Spend less. Smile more.")) {
			System.out.println("Correct Page Title");
		} else {
			System.out.println("Incorrect Page Title");
		}

		driver.findElement(By.id("nav-link-accountList")).click();
		
		driver.findElement(By.name("email")).sendKeys("mjamila1@manhattan.edu");

		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.name("password")).sendKeys("mj123");

		driver.findElement(By.id("signInSubmit")).click();
		
		//driver.findElement(By.className("nav-icon nav-arrow")).click();
		
		// automation steps + verification point(checkpoint) ==> Automation Testing

		String url = driver.getCurrentUrl();
		System.out.println("Current Page URL" +url);

		// String source = driver.getPageSource();

		driver.manage().window().minimize();
		
		//driver.quit();
	}

}
