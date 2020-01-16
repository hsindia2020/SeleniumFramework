package selenium_demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		
		test();
	}
	@SuppressWarnings("deprecation")
	public static void test() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path "+projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath +"\\chromedriver_win\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("abce");
		driver.findElement(By.name("q")).submit();
		
//		driver.findElement(By.linkText("ABCe certificate changes - IFABC")).click();
		
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 3 seconds.
		   
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				   .withTimeout(30, TimeUnit.SECONDS)
				   .pollingEvery(3, TimeUnit.SECONDS)
				   .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       WebElement linkElement =  driver.findElement(By.linkText("ABCe certificate changes - IFABC"));
		     
		       if(linkElement.isEnabled()) {
		    	   System.out.println("Element found");
		       }
		       return linkElement;
		     }
		   });
		 
		   element.click();
		   
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		driver.quit();
	}
}
