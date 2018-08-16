package SeleniumMaven.MavenProject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\meght\\Desktop\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.amazon.com/ref=nav_logo");
		
		List<WebElement> all= d.findElements(By.tagName("div"));
		List<WebElement> elements= new ArrayList<WebElement>();
		
		Iterator<WebElement> it = all.iterator();
		while(it.hasNext()){
		WebElement n= it.next();
		elements.add(n);
		System.out.println(n.toString());
		System.out.println(n.getSize());
		}
		System.out.println(elements.size());
//		for(int i=0;i<all.size();i++){
//			elements.add(all.get(i).toString());
//			System.out.println(all.get(i).toString());
//			if(all.get(i).getText().equals("Try Prime")){
//				break;
//			}
			
//		}
//		System.out.println(elements.size());
//		
		
		Actions a = new Actions(d);
		a.moveToElement(d.findElement(By.xpath("(//span[@class='nav-line-2']) [3]"))).contextClick().build().perform();
		
		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.SHIFT,"megh");
		

	}

}
