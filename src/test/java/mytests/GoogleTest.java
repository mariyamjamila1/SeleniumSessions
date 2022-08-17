package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{

	@Test
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
	
	@Test(priority = 2)
	public void searchFieldTest() {
		Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
	}

	//CRUD - create, read, update, delete
	//create a user -- @test1
	//create a user -- @test2 //if test2 depends on test1, & test1 fails then test 2 will be skipped.
	
	
	//update a user 
	//@test
	//1.create a user
	//2.update some info abt the same user
	
	//delete a user
	//@test
	//1. create a user(naveen)
	//2. delete the same user
	
	
}
