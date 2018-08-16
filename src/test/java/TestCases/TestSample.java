package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSample {

	String property=System.setProperty("webdriver.chrome.driver","C:\\Users\\meght\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	    @Test(enabled=false)
	    public void gmailTest(){
		
		driver.navigate().to("https://www.gmail.com");
		driver.manage().window().maximize();
		String actual_title =driver.getTitle().toLowerCase();
		System.out.println(actual_title);
		String Expected_title = "gmail";
		
		Assert.assertEquals(actual_title, Expected_title);
		
		WebElement gettext = driver.findElement(By.xpath("//h1[text()='Sign in']"));
		gettext.getText();
		System.out.println(gettext);
		
		

	    }
	    
	    @Test
	    public void signInGmail() throws Exception{
	    	driver.navigate().to("https://www.gmail.com");
	    	
	    	driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("meghthapa141@gmail.com");
	    	driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys(Keys.ENTER);
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("m4086076656");
	    	driver.findElement(By.xpath("//content[@class='CwaK9']//span[text()='Next']")).click();
	    	String text =driver.findElement(By.xpath("//a[contains(text(),'Inbox')]")).getText();
	    	driver.findElement(By.xpath("//div[@class='z0']")).click();
	    	driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("meghthapa101@gmail.com");
	    	driver.findElement(By.xpath("//input[contains(@name,'subjectbox') ]")).sendKeys("Automation Gmail test");
	    	driver.findElement(By.xpath("//div[contains(@class,'Am Al editable LW-avf') ]")).sendKeys("Test");
	    	 driver.findElement(By.xpath("//div[contains(@class,'Am Al editable LW-avf') ]")).sendKeys("Test");
	    	 driver.findElement(By.xpath("//div[text()='Send']")).click();
	    }

}
