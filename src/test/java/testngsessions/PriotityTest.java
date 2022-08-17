package testngsessions;

import org.testng.annotations.Test;

public class PriotityTest {
	@Test(priority = 5)
	public void a_test() {
		System.out.println("a test");
	}
	
	@Test(priority = 1)
	public void b_test() {
		System.out.println("b test");
	}
	
	@Test
	public void c_test() {
		System.out.println("c test");
	}
	
	@Test
	public void d_test() {
		System.out.println("d test");
	}
	
	@Test
	public void e_test() {
		System.out.println("e test");
	}
	//priorities can be negative numbers/0. 
	//when some test cases are prioritized and some aren't, the non priority test cases will be ran first.
	
}
