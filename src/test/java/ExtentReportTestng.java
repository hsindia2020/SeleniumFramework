
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportTestng {
	
	ExtentHtmlReporter htmlreporter;
	ExtentReports extents;
	WebDriver driver = null;
	ExtentTest test1;
	
	@BeforeSuite()
	public void setup() {

		htmlreporter = new ExtentHtmlReporter("extentReportTestNG.html");
		extents = new ExtentReports();
		extents.attachReporter(htmlreporter);
		
	}
	
	@BeforeTest
	public void ecommRunBefore() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("FrameWork Path :"+projectPath);
		System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();

	}
	
	@Test
	public void test01() {
		
		test1 = extents.createTest("Enter the product search","Google search");
		
		test1.log(Status.INFO, "Starting the Test");
		driver.get("https://google.com");
		test1.info("This message is to show the information");
		driver.findElement(By.name("q")).sendKeys("Modi");
		test1.pass("Google site up and running");
		
		//test1.fail("Detail Failed",MediaEntityBuilder.createScreenCaptureFromPath("screenshotFailTC.png"))
		driver.findElement(By.name("q")).submit();
		test1.pass("Test case Passed with Submit");
		test1.info("Test case completed");
	}
	
	@Test
	public void test02() throws IOException {
		
		test1 = extents.createTest("Failed Test Case display","Google Search Fail");
		
		test1.log(Status.INFO, "Starting the Test");
		driver.get("https://google.com");
		test1.info("This message is to show the information");
		driver.findElement(By.name("q")).sendKeys("Modi");
		test1.pass("Google site up and running");
		
		test1.pass("Failed Details",MediaEntityBuilder.createScreenCaptureFromPath("screenshotFailTC.png").build());
		test1.addScreenCaptureFromPath("screenshotFailTC.png");
		driver.findElement(By.name("q")).submit();
		test1.fail("Test case Failed with Submit");
		test1.info("Test case completed");
	}

	@AfterTest
	public void teardown() {
	
		extents.flush();
		driver.quit();
		System.out.println("Test case executed");
	}
	
}
