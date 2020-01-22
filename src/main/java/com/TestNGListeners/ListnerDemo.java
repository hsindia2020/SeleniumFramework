package com.TestNGListeners;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;

@Listeners(com.TestNGListeners.Listeners.class)

public class ListnerDemo {

	@Test
	public void test1() {
		System.out.println("I am inside test 1 ");
		
		for(int i=1;i<=4;i++) {
			System.out.println("Printing value "+i);
		}
		
		String[] fruits = {"Apple","Banana","Kiwi"};
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside test 2 ");
		String projectPath = System.getProperty("user.dir");

		System.out.println("Project path "+projectPath);

		System.setProperty("webdriver.chrome.driver",projectPath +"\\chromedriver_win\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("shweta rastogi");
		driver.findElement(By.name("q")).submit();
		
		driver.close();
	}
	
	@Test
	public void ArrayMulti() {
		System.out.println("I am inside Array Multi ");
		
		int[][] grid = {
				{3,5,7,9},
				{45,67,23,67},
				{66,67,23,54},
				{12,32}
		};
		System.out.println("Array Printing in Multi-Dimension "+grid[2][2]+" Moving to failed scenario");
		System.out.println("Array Failed test Multi-Dimension "+grid[3][2]);
	}
	
	@Test
	public void test3() {
		System.out.println("I am inside test 3 ");
		throw new SkipException("This test is skipped");
	}
	
}
