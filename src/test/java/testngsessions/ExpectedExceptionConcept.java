package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	String name; 
	
	
	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void searchTest() {
		System.out.println("Macbook");
		int i = 9/0;
		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj = null;
		obj.name = "Tom"; //Null Pointer Exception
		System.out.println("bye");
	}
}
