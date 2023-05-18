package testNgInMaven;

import org.testng.annotations.Test;

public class Class2TC1 extends Base{
	
	@Test(groups = { "regression" })
	//@Test(priority = -1)
	
	public void testCase1() {
		System.out.println("Class2 - test1 with -1 priority");
	}
	

	@Test(groups = { "regression"})
	//@Test(priority = 0)
	public void testCase2() {
		System.out.println("Class2 - test2  with 0 priority");
	}

}
