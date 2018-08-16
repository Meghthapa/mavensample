package TestNGProject;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testday2 {
	@BeforeClass
	public void b4Class(){
		System.out.println("I will run before every method");
	}
	
	@BeforeMethod
	public void b4method(){
		System.out.println("I will run before method");
	}
  
	@Test(groups={"Testgroup"})
  public void testa() {
		System.out.println("This is 1st test");
  }
	@Test
	public void testB(){
		System.out.println("This is 2nd test");
	}
}
