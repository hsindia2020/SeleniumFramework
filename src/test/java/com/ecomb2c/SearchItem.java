package com.ecomb2c;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SearchItem {

	WebDriver driver1 = null;
	By Search_xPath = By.xpath("//input[@id='search_query_top']");
	
	@Test
	public void searchItem() {
		
		String baseURL = "http://automationpractice.com/index.php";
		
		System.out.println("Site is Running");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("FrameWork Path :"+projectPath);
		System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		driver1 = new FirefoxDriver();
		
//		JavascriptExecutor js = (JavascriptExecutor) driver1;
		
		driver1.manage().window().maximize();
		
		driver1.get(baseURL);
		driver1.findElement(Search_xPath).sendKeys("Summer");
		driver1.findElement(Search_xPath).submit();
		
//		Actions actions = new Actions(driver1);
//		WebElement Hover = driver1.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-item-of-tablet-line']//div[@class='right-block']"));
		
//		actions.moveToElement(Hover);
//		driver1.findElement(By.xpath("1")).submit();
		try {
			Thread.sleep(5000);
//			js.executeScript("window.scrollBy(0,700)");
		} catch (InterruptedException e1) {
			System.out.println("It's between try catch block");
			e1.printStackTrace();
		}
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("It's between try catch block");
			e.printStackTrace();
		}
		
		driver1.quit();
	}
}
