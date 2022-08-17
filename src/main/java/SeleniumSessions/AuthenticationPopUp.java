package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUp {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String username = "admin";
		String password = "admin";
		//enter username and password before the domain then use @...URL
		//limitation is it wont work properly if "@" is used in the credentials
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		
	}

}
