package SeleniumMaven.MavenProject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingchildwindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\meght\\Desktop\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.google.com/gmail/about/#");
		d.manage().window().maximize();
		d.findElement(By.linkText("CREATE AN ACCOUNT")).click();
		System.out.println(d.getTitle());
		Set<String>ids=d.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childId=it.next();
		d.switchTo().window(childId);
		System.out.println(d.getTitle());
		d.findElement(By.xpath("//div[@class='IMH1vc lUHSR Hj2jlf']")).click();
		d.switchTo().window(parentid);

	}

}
