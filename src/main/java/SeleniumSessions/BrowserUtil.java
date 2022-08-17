package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	/**
	 * This method is used to initialize the driver on the basis of given browser name
	 * @param browserName
	 * @return this returns driver
	 */
	private WebDriver driver;
	
	public WebDriver initDriver(String browserName) {
		System.out.println("Browser name is: " + browserName.toUpperCase());
	
	if (browserName.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	else if (browserName.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
	}
	else if (browserName.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	else {
		System.out.println("Please pass the right browser"+ browserName);
	}
	return driver;
}
	public void launchurl(String url) {
		if (url == null) {//null check
			System.out.println("url is null...");
			return;
		}
		if(url.indexOf("http") == -1) {
			System.out.println("url is not having http...");
			return;
		}
		if(url.indexOf("https") == -1) {
			System.out.println("url is not having https...");
			return;
		
	}
		driver.get(url);
}
	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		return title;
	}
	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("Page url is: " + url);
		return url;
}
	public boolean isUrlFractionExist(String urlFraction) {
		if(getPageUrl().contains(urlFraction)) {
			return true;
		}
		return false;
	}
	public String getPageSource() {
		String pageSource = driver.getPageSource();
	//	System.out.println("Page source is: " + pageSource);
		return pageSource;
	}
	public boolean isInfoExistInPageSource(String info) {
		if(getPageSource().contains(info)) {
			return true;
		}
		return false;
		
	}
	public void quitBrowser() {
		driver.close();
	}
	public void closeBrowser() {
		driver.quit();
	
	}
}