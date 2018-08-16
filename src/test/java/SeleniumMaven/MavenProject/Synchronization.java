package SeleniumMaven.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\meght\\Desktop\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.get("https://alaskatrips.poweredbygps.com/g/pt/vacationpackages?MDPCID=ALASKA-US.TPS.BRAND.VACATIONPACKAGES.PACKAGE");
		d.manage().window().maximize();
		d.findElement(By.xpath("//span[contains(text(),'Hotel only')]")).click();
		
		d.findElement(By.xpath("//input[@id='H-destination']")).sendKeys("nyc");
		d.findElement(By.xpath("//input[@id='H-destination']")).sendKeys(Keys.TAB);
		
        
	}

}
