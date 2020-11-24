package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_demo {

	WebDriver driver = null;
	
	@BeforeTest
	public void TestSetup() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path "+projectPath);
		System.setProperty("webdriver.gecko.driver",projectPath +"\\geckodriver-v0.24.0-win64\\geckodriver.exe");
//		System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void googleSearch() throws InterruptedException {
		//goto google.com
		driver.get("https://www.google.com");
		//enter the search text
		driver.findElement(By.name("q")).sendKeys("Michelle Obama");
		WebElement button = driver.findElement(By.name("btnK"));
		button.submit();
		
		Thread.sleep(3000);
	/*	driver.switchTo().frame(2);
		driver.switchTo().defaultContent();*/
	}
	@AfterTest
	public void testDowntest() {
	
		driver.quit();
		System.out.println("Test executed and Passed");
	}
	
}