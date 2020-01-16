package Saucelabs;

import java.net.URI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsDemo {

	  public static final String USERNAME = "hsindia";
	  public static final String ACCESS_KEY = "02458c80-5590-4265-bca7-f27825b04e80";
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	  
	  public static void main(String[] args) throws Exception {
	  
	    DesiredCapabilities caps = DesiredCapabilities.safari();
//	    caps.setCapability("platform", "Windows 10");
	    caps.setCapability("platform", "MacOS 10.14");
//	    caps.setCapability("platform", "Linux");
//	    caps.setCapability("version", "48.0"); CHROME
	    caps.setCapability("version", "12");
	    caps.setCapability("name", "SauseLab Safari");
	    caps.setCapability("extendedDebugging", "true");
	    caps.setCapability("buildNumber", "2.3");
//	    caps.setCapability("capturePerformance", "true"); //Available on paid version
	  
	    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	
//		String projectPath = System.getProperty("user.dir");
//
//		System.out.println("Project path "+projectPath);
//
//	    System.setProperty("webdriver.chrome.driver",projectPath +"\\chromedriver_win\\chromedriver.exe");  
//	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://google.com");
	    System.out.println(driver.getTitle());
	    driver.findElement(By.name("q")).sendKeys("Scientist in two minutes");
	    driver.findElement(By.name("q")).submit();
	    
	   System.out.println("search on the page "+driver.getTitle());
	   
	   driver.quit();
	   System.out.println("Test done");
}

}