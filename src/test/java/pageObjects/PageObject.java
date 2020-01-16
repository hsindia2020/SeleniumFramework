package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObject {

	WebDriver driver = null;
	
	By textbox_search = By.id("email");
	By pwdbox_search = By.id("pass");
	By button_push = By.id("loginbutton");

	public PageObject(WebDriver driver) {  //Constructor using within the same class
		this.driver = driver;
	}
		
	public void setTextInSearchBox(String text) {

		driver.findElement(textbox_search).sendKeys(text);
	}

	public void setTextInPassword(String text) {
		
		driver.findElement(pwdbox_search).sendKeys(text);
	}
	
	public void clickPushButton() {

		driver.findElement(button_push).submit();

	}
}
