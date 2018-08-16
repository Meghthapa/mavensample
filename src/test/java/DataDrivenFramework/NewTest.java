package DataDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class NewTest {
	WebDriver driver;
  @Test
  public void login() throws IOException {
 Properties prop = new Properties();
 FileInputStream fis = new FileInputStream("C:\\Users\\meght\\workspace\\NewWorkspace\\MavenProject\\src\\test\\java\\DataDrivenFramework\\dataDrivern.properties");
 prop.load(fis);	
 
 if(prop.getProperty("browser").contains("chrome")){
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\meght\\Desktop\\chromedriver.exe");
	  driver = new ChromeDriver();
 
 }else if(prop.getProperty("browser").contains("firefox")){
	 driver= new FirefoxDriver();
	 
 }else {
	  driver = new InternetExplorerDriver();
 }
  driver.get(prop.getProperty("URL"));
 
  }
  @Test
  public void firstTest(){
	  System.out.println("This is a first test");
  }
}
