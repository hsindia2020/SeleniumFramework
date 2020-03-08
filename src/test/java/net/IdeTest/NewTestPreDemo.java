 package net.IdeTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class NewTestPreDemo {
	
  @Test(priority = 1)
  public void t1() {
	  System.out.println("I am inside priority 1");
  }
  @Test
  public void A2() {
	  System.out.println("I am inside No priority");
  }
//  If priorities are not set it will take the alphabetical order.
  
  @Test(priority = 0)
  public void t3() {
	  System.out.println("I am inside priority 0");
}
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am in BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am in After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am in Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am in After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am in Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am in After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am in Before Suite");
  }

  /**
   * This after suite exit while done.
   */
  @AfterSuite
  public void aftersuite() {
	  System.out.println("I am in After Suite");
  }
  
}
