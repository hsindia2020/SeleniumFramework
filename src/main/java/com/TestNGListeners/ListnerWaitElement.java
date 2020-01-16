package com.TestNGListeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(com.TestNGListeners.Listeners.class)

public class ListnerWaitElement {

	@Test
	public void test6() {
		System.out.println("I am inside test 6 ");
	}
	
	@Test
	public void test7() {
		System.out.println("I am inside test 7 ");
//		Assert.assertTrue(false);
		String projectPath = System.getProperty("user.dir");

		System.out.println("Project path "+projectPath);

		System.setProperty("webdriver.chrome.driver",projectPath +"\\chromedriver_win\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

//		Default polling of implicit cursor is 250 Milli Second
				
		driver.get("https://demo.openmrs.org/openmrs/");
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//		System.out.println("cursor is between implicit wait time 10 second");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginButton']"))); 
		System.out.println("cursor is between explicit wait time 20 second");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin123");
		driver.findElement(By.xpath("//li[@id='Inpatient Ward']")).click();
		
		driver.findElement(By.xpath("//input[@id='loginButton']")).submit();
		
		driver.close();
		driver.quit();
	}
	
	@Test
	public void test9() {
		System.out.println("I am inside test 9 ");
		throw new SkipException("This test is skipped");
	}
}