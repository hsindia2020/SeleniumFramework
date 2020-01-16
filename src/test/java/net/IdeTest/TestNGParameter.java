package net.IdeTest;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter {

	@Test
	@Parameters({"MyName", "ReleaseNumber"})
	public void test(@Optional("NoValue") String name,String release) {
		
		System.out.println("Name is : "+name);
		System.out.println("Release name :"+release);
	}
	
}
