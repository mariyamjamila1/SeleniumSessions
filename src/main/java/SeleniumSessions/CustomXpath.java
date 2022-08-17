package SeleniumSessions;

import org.openqa.selenium.By;

public class CustomXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//By loc = By.xpath("xpath value");
		//xpath: is not an attribute, ITS THE ADDRESS OF AN ELEMENT
		//1.Absolute xpath: /html/body/div/div2/div[2]/div[3]/div/ul/li[2]/a
		//Relative/custom xpath: create xpath with the help of attributes/xpath functions
		
		//*** SINGLE ATTRIBUTE***
		//htmltag[@attr='value']
		//input[@id='input-email']
		//input[@name='email']

		//*** MULTIPLE ATTRIBUTE***
		//htmltag[@attr='value' and @attr2='value' and...}
		//htmltag[@attr='value' or @attr2='value' or...}

		//input
		//a[@href]
		
		//text():
		//htmltag[text()='']
		//a[text()='Login']
		//h2[text()='Returning Customer']
		//label[text()='First Name']
		
		//contains(); use it for dynamic elements with dynamic attributes
		//htmltag[contains(@attr,'value')]
		//input[contains(@id,'firstname')]
//		<id = test_123
//		<id = test_456
		
		By.id("test_123");//not recommended
	//	***By.xpath("//input[contains(@id,'test_')]"); //DYNAMIC ELEMENTS
	
		//htmltag[contains(@attr,'value') and contains(@attr2,'value')

		//contains() with text();
		//htmltag[contains(text(),'value')]

		
		//contains() with text() and with attribute;
		//htmltag[contains(text(),'value') and contains(@htmltag,'value')]

		//contains() with text() and contains(@atttr,'value') and with attribute;
		//htmltag[contains(text(),'value') and contains(@htmltag,'value') and @attr='value']
		
		//starts-with
		//input[starts-with(@attr,'value')]
		//p[starts-with(text(),'If you already')]
		
		//ends-with
		//h1[ends-with(text(),'Account')] //deprecated in xpath 30
	
		//index:
//      (//input[@class='form-control'])[6]
//		(//input[@class='form-control'])[position()=6]
		
		//last element:
//		(//input[@class='form-control'])[last()]
//		(//input[@class='form-control'])[last()-1]
//		(//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]
		
//		ASSINGMENT - PRINT THE FIRST ELEMENT OF EACH FOOTER LIST WITH CUSTOM XPATH
//		(//div[@class='navFooterLinkCol navAccessibility'])//li[@class='nav_first']
		
		//***Parent to CHild
		//hubspot login page and orangehrm ***Parent to CHild
		//div[@class='private-form__control-wrapper']//input[@id='username']
		//div[@class='private-form__input-wrapper']/child::input
	
		//select[@id='Form_submitForm_Country']/child::option
	
		//***Child to Parent/grandparent 

		//input[@id='username']/../../../../../
		//Amazon
		//a[text()='Careers']/..
		//a[text()='Careers']/ancestor::ul
		//a[text()='Careers']/ancestor::div[@class='navFooterLinkCol navAccessibility']
		//a[text()='Careers']/ancestor::div[@class='navFooterLinkCol navAccessibility']/child::div
	
	//Xpath Axes
	
	}

}
