package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.espncricinfo.com/series/india-women-in-sri-lanka-2022-1319706/sri-lanka-women-vs-india-women-3rd-t20i-1319711/full-scorecard");
		//driver.findElement(By.xpath("//span[text()='Shafali Verma']/ancestor::td/following::td")).getText();
		//System.out.println(getWicketTakerName("Shafali Verma"));

		// ***Parent to Child***
		// examples FROM hubspot login page and orangehrm
		// form[@id='hs-login']//input[@id='username']
		// div[@class='private-form__input-wrapper']/input[@id='username']
		// div[@class='private-form__input-wrapper']/child::input[@id='username']
		// select[@id='Form_submitForm_Country']/option
		// select[@id='Form_submitForm_Country']/child::option

		// ***Child to Parent/grandparent***
		// backward traversing in xpath:
		// input[@id='username']/../../../../../../../../../..
		// input[@id='username']/parent::div
		// input[@id='username']/../../../../../
		// Examples Using Amazon
		// a[text()='Careers']/..
		// a[text()='Careers']/ancestor::ul
		// a[text()='Careers']/ancestor::div[@class='navFooterLinkCol navAccessibility']
		// a[text()='Careers']/ancestor::div[@class='navFooterLinkCol
		// navAccessibility']/child::div
	}

	public static String getWicketTakerName(String playerName) {
String wickettaker = driver.findElement(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td")).getText();
		
		return wickettaker;
		
		
	}
	
//	public static List<String> getPlayerScoreCardList(String playerName) {
//		System.out.println("player name : " + playerName);
//		List<WebElement> scoreList = 
//					driver.findElements(By.xpath("//span[text()='"+playerName+"']/ancestor::td//following-sibling::td"));
//		List<String> scoreCardList = new ArrayList<String>();
//		for(WebElement e : scoreList) {
//			String text = e.getText();
//			scoreCardList.add(text);
//		}
//		return scoreCardList;
	
	
	
//	}

}
