package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {

	@Test
	public void loginTest() {
		System.out.println("Login test");
		int i = 9/0;
	}
	@Test(dependsOnMethods = "loginTest")
	public void homeTest() {
		System.out.println("home test");
	}
//	@Test
//	public void searchTest() {
//		System.out.println("search test");
//	}
	
	
}
