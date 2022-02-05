package TestNG_Activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
	@BeforeMethod
	  public void beforeMethod() {
	  }
	
	@Test
  public void f() {
		System.out.println("Hello");
  }
  

  @AfterMethod
  public void afterMethod() {
  }

}
