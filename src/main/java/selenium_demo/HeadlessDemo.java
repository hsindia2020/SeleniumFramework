package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessDemo {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		test();
//	}

	@Test
	public static void test() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path "+projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath +"\\chromedriver_win\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
	 	options.addArguments("--headless");
	 	
			 	WebDriver driver = new ChromeDriver(options);
			 	
			 	
			 	driver.get("https://google.com");
			 	System.out.println("Google Opened --"+driver.getTitle());
			 	driver.findElement(By.name("q")).sendKeys("Selenium");
			 	
			 	driver.findElement(By.name("q")).submit();
			 	
			 	driver.close();
			 	driver.quit();
			 	System.out.println("Completed...");
	}
}

