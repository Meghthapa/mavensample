package SeleniumMaven.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class HandlingCaptcha {
	static String set= System.setProperty("webdriver.chrome.driver", "C:\\Users\\meght\\Desktop\\chromedriver.exe");
	 static WebDriver d= new ChromeDriver();

	public static void main(String[] args) {
	
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.google.com/recaptcha/api2/demo");
		d.manage().window().maximize();
		d.switchTo().frame(d.findElement(By.id("recaptcha-demo-form")));
		d.findElement(By.className("recaptcha-checkbox-checkmark")).click();
		
		
	}
	
	

}
