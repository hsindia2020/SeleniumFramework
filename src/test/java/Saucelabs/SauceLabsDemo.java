package Saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsDemo {

	  public static final String USERNAME = "harmeets1";
	  public static final String ACCESS_KEY = "3yUd1qpvi97LmixWUCR4";
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  public static void main(String[] args) throws Exception {

//		  Selenium Capabiliies using with the help of BrowserStack

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os_version", "10.0");
		caps.setCapability("device", "OnePlus 8");
		caps.setCapability("real_mobile", "true");
		caps.setCapability("browserstack.local", "false");
		caps.setCapability("browserstack.networkLogs", "true");
		caps.setCapability("browserstack.timezone", "Tokyo");

		/*
		 * DesiredCapabilities caps = new DesiredCapabilities();
		 * caps.setCapability("os", "Windows"); caps.setCapability("os_version", "10");
		 * caps.setCapability("browser", "Firefox");
		 * caps.setCapability("browser_version", "84.0");
		 * caps.setCapability("browserstack.local", "false");
		 * caps.setCapability("browserstack.selenium_version", "3.10.0");
		 */

		  WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);

//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path "+projectPath);
//	    System.setProperty("webdriver.chrome.driver",projectPath +"\\chromedriver_win\\chromedriver.exe");
//	    WebDriver driver = new ChromeDriver();

	    driver.get("https://google.com");
	    System.out.println(driver.getTitle());
	    driver.findElement(By.name("q")).sendKeys("Automation step by step");
	    driver.findElement(By.name("q")).submit();

	   System.out.println("search on the page "+driver.getTitle());

	   driver.quit();
	   System.out.println("Test done");
}
}