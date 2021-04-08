package Saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WirelessConn {

	WebDriver driver = null;

  @Test
	public void function01() throws Exception {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("http://dlinkrouter.local/");
		System.out.println(driver.getTitle());
		driver.findElement(
				By.xpath("//input[@id='INPUT_Psd']")).sendKeys("iomcoi478#*&43");
		driver.findElement(By.xpath("//input[@id='submit']")).click();
		driver.findElement(By.xpath("//span[@id='TOPM013']")).click();
		driver.findElement(By.xpath("//span[@id='SUBM017']")).click();
		System.out.println(" " + driver.findElement(By.xpath("//span[@id='HWLAN003']")).getText() + " "
				+ driver.findElement(By.xpath("//span[@id='client_cnt']")).getText());
		System.out.println("search on the page " + driver.getTitle());

		driver.quit();
		System.out.println("Test execution done");

  }
}
