package net.IdeTest;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
public class TestJunit {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void untitled() {
    driver.get("https://www.wikipedia.org/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.cssSelector("#js-link-box-en > strong")).click();
    driver.findElement(By.id("searchInput")).click();
    driver.findElement(By.id("searchInput")).sendKeys("isro");
    driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
    driver.findElement(By.linkText("Government of India")).click();
    driver.findElement(By.cssSelector(".tocsection-12 .toctext")).click();
    driver.findElement(By.cssSelector("p:nth-child(65)")).click();
  }
}
