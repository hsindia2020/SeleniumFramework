package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.PageObject;

public class PageTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googleSearchTest();
		
	}

	public static void googleSearchTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path "+projectPath);
		System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		PageObject searchpageObj = new PageObject(driver);
		
		driver.get("https://www.facebook.com");
		
		searchpageObj.setTextInSearchBox("harmeetsingh2311@gmail.com");
		searchpageObj.setTextInPassword("abcdefghijkl");
		
		searchpageObj.clickPushButton();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			System.out.println("Exception called");
			e.printStackTrace();
		}
//		driver.close();
	}
}
