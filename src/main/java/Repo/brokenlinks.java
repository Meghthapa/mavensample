package Repo;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import heroKuapp.HeroKuappallTest;

public class brokenlinks extends HeroKuappallTest {

	@Test(enabled=false)
	public void brokenlinkTest() throws IOException{
		driver= initBrowser();
		driver.get("https://www.facebook.com/");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		list.addAll(driver.findElements(By.tagName("img")));
		
		List<WebElement> Activelist= new ArrayList<WebElement>();
		
		for(int i=0;i<list.size();i++){
			if(list.get(i).getAttribute("href") != null){
				//if(list.get(i).getAttribute("src")!=null){
					Activelist.add(list.get(i));
				}
			}
		    System.out.println("Link if list:"+list.size());
			System.out.println("Link of active links:"+Activelist.size());
			
			for(int j=0;j<Activelist.size();j++){
				HttpURLConnection connection= (HttpURLConnection)new URL(Activelist.get(j).getAttribute("href")).openConnection();
				connection.connect();
				int response=connection.getResponseCode();
				connection.disconnect();
				System.out.println("This is Activelinks"+Activelist.get(j).getAttribute("href")+"-->"+response);
			}
		}
		
	}

