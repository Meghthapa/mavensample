package TestNGProject;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	
	@Parameters({"URL"})
  @Test
  public void testa(String URL) {
	  System.out.println(URL);
	  System.out.println("This is a first test");
	  
  }
  @Test(groups={"Testgroup"},dependsOnMethods="thirdTest")
  public void secondTest(){
	  System.out.println("This is a second test");
  }
  @Test(dataProvider="getData")
  public void thirdTest(String username,String password){
	  System.out.println("This is a third test");
	  System.out.println(username+" "+password);
  }
  @DataProvider
  public Object[][] getData(){
	  Object[][] data= new Object[3][2];//this means 3 rows and 2 columns
	  //this will create a first combinition of data  
	  data[0][0]="meghthapa"; //This a username 
	  data[0][1]="password";
	  //This is going to be second set of data 
	  data[1][0]="Meghthapa1";
	  data[1][1]="password1";
	  //This is going to be third set od Data
	  data[2][0]="meghthapa3";
	  data[2][1]="password3";
	  return data;
  }
}
