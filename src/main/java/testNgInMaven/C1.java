package testNgInMaven;

import org.testng.annotations.Test;

public class C1 extends Base{
	
	

	@Test(groups = { "smoke"})
	//@Test(priority = 1)
	public void testCase1(){
		System.out.println("Class1-test1, first priority");
	}

}
