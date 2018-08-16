package SeleniumMaven.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\meght\\Desktop\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.spicejet.com/");
		d.manage().window().maximize();
		Select s = new Select(d.findElement(By.name("ctl00$mainContent$ddl_Adult")));
		s.selectByVisibleText("2");
		Select m=new Select(d.findElement(By.name("ctl00$mainContent$ddl_Child")));
		m.selectByIndex(1);
		Select n= new Select(d.findElement(By.name("ctl00$mainContent$ddl_Infant")));
		s.selectByIndex(1);
		Select o = new Select(d.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
		//o.deselectAll();
		d.findElement(By.name("ctl00$mainContent$chk_Unmr")).click();
		d.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		d.findElement(By.xpath("//a[@value='GOI']")).click();
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();
		
	}

}
