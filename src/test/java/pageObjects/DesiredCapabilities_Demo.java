package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {
	
	public static WebDriver driver = null;

	public static void main(String[] args) throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("ignoreProtectedModeSettings", true);

		System.setProperty("webdriver.gecko.driver","E:\\git\\SeleniumJava\\SeleniumFramework\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		driver = new FirefoxDriver(cap);

		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("seleinum");
		driver.findElement(By.name("q")).submit();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
