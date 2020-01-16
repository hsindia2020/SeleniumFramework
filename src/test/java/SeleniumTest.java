import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {

		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";

		WebDriverManager.chromedriver().version("2.36").setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/");

		actualTitle = driver.getTitle(); // get the title of html page

		//       result as "Passed" or "Failed"
		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		Thread.sleep(3000);  //close browser after 3 secs
	
		driver.close();
		driver.quit();
	}
}
