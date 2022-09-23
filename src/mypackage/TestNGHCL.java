package mypackage;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNGHCL {

  @Test(priority=1)
  public void test1() {
	  System.out.println("Running Test 1");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Running Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Running Test");
  }

}
