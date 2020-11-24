import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElement {
	public static void main(String[] args) {

		String projectPath = System.getProperty("user.dir");

		System.out.println("Project path "+projectPath);

		System.setProperty("webdriver.gecko.driver",projectPath+"\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		String baseURL = "https://www.facebook.com/";
		//		String tagname = "";

		driver.get(baseURL);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("facebookdemo");
		List<WebElement> ListOfInputElement = driver.findElements(By.xpath("//label"));

		int count = ListOfInputElement.size();
		System.out.println("Count of input elements : "+count);

		//		WebElement textbox = driver.findElement(By.id("email"));			
		//		textbox.sendKeys("Harmeet");

		try {
			Thread.sleep(3000);
			driver.close();
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
