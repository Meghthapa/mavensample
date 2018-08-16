package Repo;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	   
	protected static WebDriver driver;
	protected static Properties prop;
	
	public static void readFile() throws IOException{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\meght\\workspace\\NewWorkspace\\MavenProject\\src\\main\\java\\Repo\\data.properties");
		prop.load(fis);
	}
	
	public WebDriver initBrowser() throws IOException{
				
		 readFile();
		 String browserName= prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\meght\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\meght\\Desktop\\Gekodriver\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		return driver;
	}
	public static String returnUrl() throws IOException{
		readFile();
		String url = prop.getProperty("url");
		if(url.equals("url")){
			return url;
		}
		return url;
	}
	

}
