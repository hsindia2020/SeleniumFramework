package net.IdeTest;

import org.testng.annotations.Test;

//Group on All class level define on XML
@Test(groups = {"AllClassGroup"})
public class TestNGroupsDemo {

	@Test(groups = {"Sanity"})
	public void test01() {

		System.out.println("Run the Sanity Test");
	}
	@Test(groups = {"Sanity", "Smoke"})	
	public void test02() {

		System.out.println("Run the Sanity and Smoke");
	}
	@Test(groups = {"Sanity", "Regression"})
	public void test03() throws ArithmeticException {

		System.out.println("Run the Sanity and Regression");
		int i = 1/0;
		System.out.println("Failed "+i);
	}
	@Test(groups = {"UAT"})
	public void test04() {

		System.out.println("Run the UAT");
	}
}
