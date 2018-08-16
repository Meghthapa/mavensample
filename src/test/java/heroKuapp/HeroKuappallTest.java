package heroKuapp;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.http.HttpClient;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Repo.base;
import pom.elements;

public class HeroKuappallTest extends base {
	
	elements em=new elements(driver);
	
	@Test(enabled=false)
	public void ABTesting() throws IOException{
		openbrowser();
		elements e= new elements(driver);
		e.ABtest().click();
		String actual =e.getallTheText().getText();
		System.out.println(actual);
		String Expected ="Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).";
		Assert.assertEquals(actual, Expected);
	}
	@Test(enabled=false)
	public void BasicAuth() throws IOException{
		driver=initBrowser();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		elements em=new elements(driver);
		String Actual =em.getsucesstext().getText();
		String expected = "Congratulations! You must have the proper credentials.";
		Assert.assertEquals(Actual, expected);
	}
	
	@Test(enabled=false)
	public void BrokenImage() throws IOException{
		openbrowser();
	    elements em= new elements(driver);
		em.clickBrokenLink().click();
		List<WebElement> imageList= driver.findElements(By.tagName("img"));
		
		List<WebElement> activeList= new ArrayList<WebElement>();
		 for(int i=0;i<imageList.size();i++){
			 if(imageList.get(i).getAttribute("src") !=null){
				 activeList.add(imageList.get(i));
			 }
			 System.out.println(activeList.size());
		 }
    
       for(int j=0;j<activeList.size();j++){
    	   HttpURLConnection con= (HttpURLConnection) new URL(activeList.get(j).getAttribute("src")).openConnection();
    	   int response=con.getResponseCode();
    	   con.disconnect();
    	   System.out.println(activeList.get(j).getAttribute("src")+"--> "+response);
    	   if(response !=200){
    		   System.out.println(activeList.get(j).getAttribute("src")+"--> "+response);
    	   }
       }
       
       }
	@Test(enabled=false)
    public void challangingDom() throws IOException{
		openbrowser();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		elements e= new elements(driver);
		e.ChallgeDOM().click();
//		List<WebElement> lorem= driver.findElements(By.xpath("//table/thead/tr"));
//		int total = lorem.size();
//		System.out.println(total);             	
//		WebElement text=driver.findElement(By.xpath("//a[text()='qux'][1]"));  		
//		System.out.println(text.getText());
//		text.click();
		
		WebElement text1=driver.findElement(By.xpath("//a[text()='baz'][1]"));
		System.out.println(text1.getText());
		text1.click();
//		WebElement text2=driver.findElement(By.xpath("//a[text()='foo'][1]"));
//		System.out.println(text2.getText());
//		text1.click();
		
		
		
		
	}
	@Test(enabled=false)
	public void checkBoxes() throws IOException{
		openbrowser();		
        elements em= new elements(driver);
        em.clickCheckboxes().click();
       System.out.println(em.checkbox1().isSelected());
         if(em.checkbox1().isSelected()==false){
        	 em.checkbox1().click();
        	 System.out.println(em.checkbox1().isSelected());
         } else{
        	 em.checkbox2().click();
        	 System.out.println(em.checkbox2().isSelected());
         }
       
        
        System.out.println(em.checkbox2().isSelected());
	}
	
	@Test(enabled=false)
	public void contextMenu() throws IOException, AWTException, InterruptedException{
		openbrowser();
		elements e= new elements(driver);
		e.ContextMenu().click();
		Actions action = new Actions(driver);
		WebElement rightClick=e.clickContextMenuItem();		
		action.contextClick(rightClick).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		//This issue needs to be resolved 
					
		
	}
	@Test(enabled=false)
	public void disappearingElements() throws IOException{
		openbrowser();
		elements e= new elements(driver);
		e.clickDisappearingElement().click();
		e.ClickHome().click();
		driver.navigate().back();
		e.ClickAbout().click();
		driver.navigate().back();
		e.ClickContactUs().click();
		driver.navigate().back();
		e.ClickContactUs().click();
		driver.navigate().back();
		e.ClickPortFolio().click();
		driver.navigate().back();  			
		
	}
	@Test
	public void DragAndDrop() throws IOException, InterruptedException{
		openbrowser();
		elements e= new elements(driver);
		e.clickDragAndDropable().click();
		
		WebElement from=driver.findElement(By.cssSelector("#column-a"));
        WebElement to = driver.findElement(By.cssSelector("#column-b"));
//       Action dragAndDrop = a.clickAndHold(from).moveToElement(to).release().build();
//       dragAndDrop.perform();
        (new Actions(driver)).dragAndDrop(from, to).perform();
	}
	
//	@AfterTest
//	public void quit(){
//		driver.quit();
//		driver=null;
//	}
	public void openbrowser() throws IOException{
		driver=initBrowser();
		driver.get(base.returnUrl());
		driver.manage().window().maximize();
	}
	
	

}
