package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandleConcept {

		static WebDriver driver;

		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.londonfreelance.org/courses/frames/index.html");

			//Frame And iFrame both are same from Selenium POV
			//frameset is a collection of frames
			//iFrame is fixed, cannot be moved around
			//frames are used for security purposes, cannot be accessed directly
			
			
			//driver.switchTo().frame(2);
			//driver.switchTo().frame("main");//switch driver to access the frame
			driver.switchTo().frame(driver.findElement(By.name("main"))); //name of this particular frame is "main"
			//we can also create xpath or cssselector...
			
			String header = driver.findElement(By.tagName("h2")).getText();
			System.out.println(header);
			
	}

}
