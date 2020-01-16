 package net.IdeTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.apache.logging.log4j.core.net.Priority;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class NewTestPreDemo {
  @Test(priority = 1)
  public void t1() {
	  System.out.println("I am inside test1");
  }
  @Test
  public void A2() {
	  System.out.println("I am inside test02");
  }
//  If priorities are not set it will take the alphabetical order.
  
  @Test(priority = 0)
  public void t3() {
	  System.out.println("I am inside test003");
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

}
