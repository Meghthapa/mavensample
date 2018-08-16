package SeleniumMaven.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptexecutor {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\meght\\Desktop\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://www.ksrtc.in/oprs-web/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@ id='fromPlaceName']")).sendKeys("Bang");
					
//		 d.findElement(By.xpath("//input[@ id='fromPlaceName']")).sendKeys(Keys.DOWN);
//	d.findElement(By.xpath("//input[@ id='fromPlaceName']")).sendKeys(Keys.DOWN);
//		
//		d.findElement(By.xpath("//input[@ id='fromPlaceName']")).sendKeys(Keys.DOWN);
//		d.findElement(By.xpath("//input[@ id='fromPlaceName']")).sendKeys(Keys.DOWN);
//		
		d.findElement(By.xpath("//input[@ id='fromPlaceName']")).getText();
		
		JavascriptExecutor js =(JavascriptExecutor)d;
		String value = "return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(value);
		System.out.println(text);
		
		while(!text.equalsIgnoreCase("BANGALORE INTERNATION AIPORT")){
			d.findElement(By.xpath("//input[@ id='fromPlaceName']")).sendKeys(Keys.DOWN);
			 text=(String) js.executeScript(value);
			System.out.println(text);
			
			
		}
}
}