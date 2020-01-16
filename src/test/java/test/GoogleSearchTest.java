package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.GoogleSearchPage;

public class GoogleSearchTest {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		try {
			googleSearch();
		} catch (InterruptedException e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}
	}

	public static void googleSearch() throws InterruptedException {

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path "+projectPath);
		System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();

		//goto google.com
		driver.get("https://google.com");
		//enter the search text
		GoogleSearchPage.textbox_search(driver).sendKeys("gandhi ji");

		//click on search button on google website
		GoogleSearchPage.button_search(driver).submit();

	
		Thread.sleep(6000);
		driver.close();

		System.out.println("Test executed and Passed");
	}
}

