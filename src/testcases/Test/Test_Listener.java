package testcases.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(actions.configure.TestListeners.class)
//@Listeners(actions.configure.InvokedMethodListener.class)

public class Test_Listener {

  @Test

  public void main() {

	  System.out.println("Main Test Case");

  }

  @BeforeMethod

  public void beforeMethod() {

	  System.out.println("BeforeMethod");

  }

  @AfterMethod

  public void afterMethod() {

	  System.out.println("AfterMethod");

  }
  
  @BeforeClass

  public void beforeClass() {

	  System.out.println("BeforeClass");

  }

  @AfterClass

  public void afterClass() {

	  System.out.println("AfterClass");

  }
  
}
