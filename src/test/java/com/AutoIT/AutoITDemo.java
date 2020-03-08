package com.AutoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoITDemo {

//	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
//		test();
//	}

	@Test
	public static void test() throws Exception {
		
		String filelocation = "E:\\git\\SeleniumJava\\AutoITFile.exe";
		String projectPath = System.getProperty("user.dir");

		System.out.println("Project path "+projectPath);

		//System.setProperty("webdriver.gecko.driver",projectPath+ "\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver",projectPath +"\\chromedriver_win\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.tinyupload.com/");
		driver.findElement(By.name("uploaded_file")).click();
		Thread.sleep(3000);
		
//		AutoIT calls here.... It will help to run the external applications. e.g. Windows popups
			Runtime.getRuntime().exec(filelocation);
				Thread.sleep(3000);
		
		driver.close();
		driver.quit();
		
	}
}
