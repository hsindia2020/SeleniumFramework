package ecomwebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObj {

 WebDriver driver = null;

	By TextBox_Search = By.xpath("//input[@id='twotabsearchtextbox']");
	By Select_type = By.xpath("//li[@id='p_n_feature_twenty_browse-bin/17881878011']//i[@class='a-icon a-icon-checkbox']");

	By Country_change = By.xpath("//span[@class='icp-color-base'][contains(text(),'United States')]");
	By Country_section = By.xpath("//div[@class='a-fixed-left-grid-col a-col-right']//span[contains(text(),'India')]");
	By Country_click = By.xpath("//span[@class='a-button a-spacing-top-mini a-button-primary']//input[@class='a-button-input']");

	public PageObj(WebDriver driver) {
		this.driver = driver;

	}

	public void setTextInSearchBox(String text) {
		
		driver.findElement(TextBox_Search).sendKeys(text);
		driver.findElement(TextBox_Search).submit();
	}

	public void setSelectType() {

		driver.findElement(Select_type).click();

	}

//	public void setCountry() {
//
//		driver.findElement(Country_change).clear();
//		driver.findElement(Country_section).isSelected();
//		driver.findElement(Country_click).clear();
//	}
}
