package TestNGSample;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver = null;
	
  @Test
  public void f() {
  }
  
  @AfterMethod
  public void afterMethod() {
			
			String projectPath = System.getProperty("user.dir");
			System.out.println("Project path "+projectPath);
			System.setProperty("webdriver.gecko.driver",projectPath+"\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
