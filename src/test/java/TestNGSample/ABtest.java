package TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ABtest {

	private static WebDriver driver = null;
  @Test
	public void f() throws Exception {


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'A/B Testing')]")).click();

		Thread.sleep(3000);

  }
}
