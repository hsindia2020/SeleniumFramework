package com.TestNGListeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Listener class created manually to maintain the status of Test Cases
 * @author Harmeet
 *
 */
@Listeners(com.TestNGListeners.Listeners.class)

public class ListnerWaitElement {

	@Test
	public void test6() throws Exception {
		System.out.println("BrowserStack Running...");
		 String USERNAME = "harmeets1";
		 String AUTOMATE_KEY = "3yUd1qpvi97LmixWUCR4";
		 String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

		 DesiredCapabilities caps = new DesiredCapabilities();
		/* caps.setCapability("os", "OS X");
		 caps.setCapability("os_version", "Mojave");
		 caps.setCapability("browser", "Chrome");
		 caps.setCapability("browser_version", "78.0");
		 caps.setCapability("project", "Entry From");
		 caps.setCapability("build", "1.1");
		 caps.setCapability("browserstack.local", "false");
		 caps.setCapability("browserstack.timezone", "New_York");
		 caps.setCapability("browserstack.selenium_version", "3.10.0");*/

		    caps.setCapability("browserName", "android");
		    caps.setCapability("device", "OnePlus 7T");
		    caps.setCapability("realMobile", "true");
		    caps.setCapability("os_version", "10.0");
		    caps.setCapability("name", "Run on OnePlue 7 Phone");

		    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		   /* driver.get("http://www.google.com");
		    WebElement element = driver.findElement(By.name("q"));

		    element.sendKeys("BrowserStack");
		    element.submit();

		    System.out.println(driver.getTitle());*/

		String baseURL = "http://automationpractice.com/";

			driver.get(baseURL);

		/*
		 * This for the unexpected dialog box we can ESC. Actions action = new
		 * Actions(driver); action.sendKeys(Keys.ESCAPE);
		 */

		driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")).click();

			Thread.sleep(1000);

		/*
		 * driver.findElement(By.xpath(
		 * "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")).click();
		 * driver.findElement(By.xpath(
		 * "//body/div/div/div/div/div/label[contains(text(),'Female')]/input[1]")).
		 * click(); driver.findElement(By.xpath("//button[@id='buttoncheck']")).click();
		 * Thread.sleep(1000);
		 * 
		 * driver.findElement(By.xpath(
		 * "//html//body//div//div//div//div//div//div//label[contains(text(),'Male')]//input"
		 * )).click();
		 * driver.findElement(By.xpath("//label[contains(text(),'15 to 50')]")).click();
		 * driver.findElement(By.xpath("//button[contains(text(),'Get values')]")).click
		 * (); Thread.sleep(2000);
		 */
		    driver.quit();
	}

	@Test
	public void test7() {
		System.out.println("User Auth Validation Running... ");
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