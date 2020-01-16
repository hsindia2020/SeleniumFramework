package net.IdeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestNGMultipleBrowsers {
	
	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");
	
	@Parameters("browserName")
	@BeforeTest
  public void setup(String browserName) {
	  System.out.println("Browser Name "+browserName);
	  	
	  if (browserName.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver",projectPath +"\\chromedriver_win\\chromedriver.exe");
		  driver = new ChromeDriver();
		  System.out.println("Browser Name---- "+browserName);
		  System.out.println("Thread is :"+Thread.currentThread().getId());
	  }
	  else if (browserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("Browser Name---- "+browserName);
		System.out.println("Thread is :"+Thread.currentThread().getId());
	  }
  }
  
  public void test1() {
	  	driver.get("https://google.com");
	  	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Into the catch exception");
			e.printStackTrace();
		}
  }
  
  @AfterTest
  public void teardown() {
	  driver.close();
	  System.out.println("Test completed ***");
	  
  }
}
