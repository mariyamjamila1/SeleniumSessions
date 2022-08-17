package SeleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver("edge");
		brUtil.launchurl("https://www.amazon.com");
		
		if (brUtil.isUrlFractionExist("amazon")) {
			System.out.println("URL is correct with amazon...PASS");
		}
		else {
			System.out.println("FAIL");
		}
		if(brUtil.isInfoExistInPageSource("https://completion.amazon.com")) {
			System.out.println("Page source is correct with fraction url... PASS");
		}
		else {
			System.out.println("FAIL");
		}
		if (brUtil.getPageTitle().contains("Amazon.com. Spend less. Smile more.")) {
			System.out.println("correct title...PASS");
		}
		else {
			System.out.println("FAIL");
		}
		//brUtil.quitBrowser();
		
	}

}
