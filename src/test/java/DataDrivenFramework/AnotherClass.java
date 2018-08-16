package DataDrivenFramework;

import java.io.IOException;

import org.testng.annotations.Test;

public class AnotherClass {
  @Test
  public void f() throws IOException {
	  NewTest test=new NewTest();
	  test.login();
  }
}
