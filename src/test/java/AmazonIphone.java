
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ecomwebsite.PageObj;

public class AmazonIphone {

	static WebDriver driver = null;
	
	public static void main(String[] args) {
		amazoniphone();
	}

	public static void amazoniphone() {

		String projectPath = System.getProperty("user.dir");
		System.out.println("FrameWork Path :"+projectPath);
		System.setProperty("webdriver.gecko.driver",projectPath+"\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		PageObj searchpage = new PageObj(driver);
		
		driver.get("https://www.amazon.com/");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Exception call for first function");
			e.printStackTrace();
		}
		searchpage.setTextInSearchBox("cellphone");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			System.out.println("Exception call for first function");
			e.printStackTrace();
		}
		
		searchpage.setSelectType();
		driver.close();
		driver.quit();
	}
}
