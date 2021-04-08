package com.extentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsDemo {

	static WebDriver driver = null;

	public static void main(String[] args) throws Exception {

		WebDriverManager.firefoxdriver().setup();

		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("e:\\extentReports.html");
		// create ExtentReports and attach reporter(s)
		ExtentReports extents = new ExtentReports();
		extents.attachReporter(htmlreporter);
		//create a toggle for the given test, adds all the log events under it.
		ExtentTest test1 = extents.createTest("Enter the product search","Google search");

		/**
		 * This is the project plans.
		 */
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path "+projectPath);

//		System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		driver = new FirefoxDriver();

		test1.log(Status.INFO, "Starting the Test");
		driver.get("https://google.com");
		test1.pass("Google site up and running");

		driver.findElement(By.name("q")).sendKeys("Modi");
		test1.pass("Google accept the search text");

		Thread.sleep(2000);
		driver.findElement(By.name("q")).submit();
		test1.pass("Hit Enter button");

		driver.quit();
		test1.pass("Close the browser");

//		assertEquals(true, false);
		test1.fail("Failed Test Case");

		test1.fatal("Fatel Text detail");
		test1.info("Test case completed");

		extents.flush();

	}
}
