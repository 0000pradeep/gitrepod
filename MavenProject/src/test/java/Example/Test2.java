package Example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test2 {
  @Test
  public void test() {
 System.out.println("test called");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method called");
  }

}
