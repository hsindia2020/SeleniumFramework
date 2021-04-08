package ecomwebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPageData {

	WebDriver driver1 = null;

	@BeforeTest
	public void ecommRunBefore() {

		WebDriverManager.firefoxdriver().setup();

		String projectPath = System.getProperty("user.dir");
		System.out.println("FrameWork Path :"+projectPath);
//		System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver1 = new FirefoxDriver();
	}

	@Test(priority = 1)
	public void a_ecomwebsitesearch() {

		PageObj searchpageObj = new PageObj(driver1);

		driver1.get("https://www.amazon.com/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Exception call for first function");
			e.printStackTrace();
		}

		searchpageObj.setTextInSearchBox("Iphone 11 512GB");
	}

	@Test(priority = 3)
	public void b_ecommwebsitesearch() {

		PageObj searchpageObj = new PageObj(driver1);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			System.out.println("Exception call for second function");
			e.printStackTrace();
		}
		searchpageObj.setSelectType();
	}
	@AfterTest
	public void ecommwebsitend() throws Exception {

		Thread.sleep(3000);
		driver1.quit();
		System.out.println("Test case executed");

	}
}
