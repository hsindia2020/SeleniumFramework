package com.TestNGListeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.TestNGListeners.Listeners.class)

public class ListnerDemo {

	@Test
	public void test1() {
		System.out.println("I am inside test 1 ");
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
		
	}
	
	@Test
	public void test3() {
		System.out.println("I am inside test 3 ");
		throw new SkipException("This test is skipped");
	}
}
