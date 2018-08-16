package SeleniumMaven.MavenProject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakescreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\meght\\Desktop\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://www.google.com");

		 TakesScreenshot srcshot = ((TakesScreenshot)d);
		 File srcFile=srcshot.getScreenshotAs(OutputType.FILE);
		 File destFile= new File("C:\\Users\\meght\\seleniumscreenshot.png");
		 FileUtils.copyFile(srcFile,destFile);
	}

}
