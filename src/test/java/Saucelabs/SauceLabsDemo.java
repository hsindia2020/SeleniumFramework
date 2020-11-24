package Saucelabs;

/**
 * This code executed on browserstack Automate.
 * Capabilities Generator available on Reference,
 * SauceLabs try not working.
 */

import java.net.URI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsDemo {

	  public static final String USERNAME = "harmeets1";
	  public static final String ACCESS_KEY = "3yUd1qpvi97LmixWUCR4";
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  
	  public static void main(String[] args) throws Exception {

		  DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setCapability("os", "OS X");
		  caps.setCapability("os_version", "Snow Leopard");
		  caps.setCapability("browser", "Safari");
		  caps.setCapability("browser_version", "5.1");
		  caps.setCapability("project", "Google Test");
		  caps.setCapability("browserstack.local", "false");
		  caps.setCapability("browserstack.selenium_version", "2.45.0");


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