package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_GoogleSearch {

	public static void main(String[] args) {
		try {
			googleSearch();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void googleSearch() throws InterruptedException {

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path "+projectPath);
		System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//goto google.com
		driver.get("https://google.com");
		//enter the search text
		driver.findElement(By.name("q")).sendKeys("bill gates");
		
		//click on search button on google website
		
		//driver.findElement(By.name("btnK")).click();     *************THERE ALL ARE NOT WORKING FOR SEARCH CLICK*************
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		WebElement button = driver.findElement(By.name("btnK"));
		button.submit();
		
		Thread.sleep(6000);
		driver.close();
		
		System.out.println("Test executed and Passed");
	}
}

