package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSelector {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// id -- #id or tag#id - use hash for id attr
		// class .class or tag.class

		//By email = By.cssSelector("#input-email");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys("cssselector", "input#input-email", "test123@gmail.com");

		eleUtil.doSendKeys("cssselector", "input#input-password", "test@123");
		
		// #input-email
		// input#input-email
		// input#input-password

		// input.form-control
		// c1.c2.c3...
		//	tag.c1.c2.c3...

		// .form-control.private-form__control.login-email
		// .form-control.private-form__control.login-email#username
		// .form-control.private-form__control.login-email

		// select#Form_submitForm_Country

		// tag[attr='value']
		// input[name='email']--CSS
		// input[@name='email']--Xpath

		// tag[attr='value'][type='text']
		// input[name='email'][type='text'][id='input-email']

		// tag[attr*='value']
		// input[id*='email'] --CSS
		// input[contains(@id,'email')]

		// ***STARTS-WITH*** ^^^
		// input[placeholder^='E-Mail']
		// input[placeholder^='E-Mail'][id*=email]

		// ***Ends-WITH*** $$$
		// input[placeholder$='Address']
		// input[placeholder$='Address'][id*='email'][class^='form']

		// h2:text('') - deprecated
		// no support for text function in CSS

		// Parent to child:
		// parent's htmltag# 'id value' then child's html tag
		// div#content input
		// div#content > input --direct child elements only so 0
		// div#content div DIRECT AND INDIRECT child elements so 7 results

		// select#Form_submitForm_Country > option
		// form#hs-login input#username

		// Child to Parent: NA
		// backward traversing in CSS: NA

		// sibling in css: only forward is Available, but we avoid to use it bcaz better
		// options are available
		// div.form-group > label[for='input-email'] + input

		// Using Comma in CSS
		// img[title='naveenopencart'],input[name='search'],input[id='input-email']
		By impEles = By.cssSelector(
				"img[title='naveenopencart'],input[name='search'],input[id='input-email'],button[data-toggle='dropdown']");

		int count = driver.findElements(impEles).size();
		if (count == 5) {
			System.out.println("All important elements are present on the page");
		}

		// xpath vs css:
		// 1. syntax wise: Css is better than xpath
		// 2.performance: both are good to go
		// 3.backward: xpath
		// 4.siblings:xpath
		// 5.WebTable: xpath
		// 6. Comma: Css
		// 7. text: Xpath
		// 8. dynamic: both
		// 9. SVG elements: xpath
		// 10. Shadow dom : css selector
		// 11. Index: both
		// 12. Relative Locators

	}

}
