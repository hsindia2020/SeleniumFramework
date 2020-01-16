package TestNGSample;

import org.testng.annotations.Test;

public class TestNGDependencies {
	
//	Dependencies run first to the priorities, here priority is not working
	@Test(dependsOnMethods = {"test02","test03"}, priority = 0)
	public void test01() {
		
		System.out.println("I am inside of Test01");
	}
	
	@Test(dependsOnGroups = {"Test.*"})
	public void test04() {
		
		System.out.println("I am inside of Test04");
	}

	@Test(priority = 1)
	public void test02() {
		
		System.out.println("I am inside of Test02");
	}
	
	@Test(dependsOnMethods = {"test02"}, priority = 2)
	public void test03() {
		
		System.out.println("I am inside of Test03");
	}
}
