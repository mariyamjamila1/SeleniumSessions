package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PorscheSelectDropDown {

		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.porsche.com/usa/?mediacampaignid=_nu_&utm_campaign=pcna-fy22-aon-general-brand-core&campaigncountry_region=_us_&utm_medium=_paidsearch_&campaignmodel=_brandshaper_&campaignsubtopic=_other_&campaignlanguage=_english_&utm_source=_googleads_&utm_content=_textads_nu____&campaigntype=_branded_&gclid=EAIaIQobChMI3OqYlZXb-AIVhQiICR0IiA-JEAAYASAAEgJy0PD_BwE&gclsrc=aw.ds");

			driver.manage().window().maximize();
			
			By region = By.cssSelector("select[data-placeholder='Select a region'] option");
			
			By country = By.cssSelector("select[data-placeholder='Select a country/region'] option");
			
			Select selectRegion = new Select(driver.findElement(region));
			List<WebElement> regionList = selectRegion.getOptions();
			

			for(int i=0; i<regionList.size()-1;) {
				String text = regionList.get(i).getText();
				System.out.println(i+ ": "+ text);
				i++;

}
//			Select chooseCountry = new Select(driver.findElement(country));
//			List<WebElement> countryList = chooseCountry.getOptions();
//			for(int i=0; i<countryList.size()-1;) {
//				String text = countryList.get(i).getText();
//				System.out.println(i+ ": "+ text);
//				i++;
//
//	}
			
		}
}
