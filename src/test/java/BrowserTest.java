import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {

		String projectPath = System.getProperty("user.dir");

		System.out.println("Project path "+projectPath);

		//System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver",projectPath +"\\chromedriver_win\\chromedriver.exe");
		//You can also set the webdriver into windows environment variable with complete path
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/");
		
		//Dimension d = new Dimension(300,1080);
     	//Resize current window to the set dimension
     	try {
     	   driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.manage().window().fullscreen();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Thread.sleep(4000); //Three seconds
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception handling through try catch");
			e.printStackTrace();
		}
		
//		System.out.println("Website Title "+driver.getTitle());
		driver.close();
		driver.quit();
	}
}
