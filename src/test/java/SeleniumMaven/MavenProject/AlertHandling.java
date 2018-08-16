package SeleniumMaven.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\meght\\Desktop\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		d.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		System.out.println(d.switchTo().alert().getText());
		d.switchTo().alert().accept();//For positive kind of scenerio OK,DONE etc 
		//d.switchTo().alert().dismiss();// If you want to cancel or negative scenerio
		//d.switchTo().alert().sendKeys("abcd");// if you want to type into the alert 
		
		
		

	}

}
