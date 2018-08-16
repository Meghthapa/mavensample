package SeleniumMaven.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\meght\\Desktop\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://jqueryui.com/droppable/");
		d.manage().window().maximize();
		WebElement e = d.findElement(By.className("demo-frame"));
		d.switchTo().frame(e);
		Actions action = new Actions(d);
		WebElement source=d.findElement(By.id("draggable"));
		WebElement target = d.findElement(By.id("droppable"));
		action.dragAndDrop(source, target).build().perform();
		//To get back into the normal content 
		d.switchTo().defaultContent();
		System.out.println(d.findElement(By.tagName("a")).getSize());
        	

	}

}
