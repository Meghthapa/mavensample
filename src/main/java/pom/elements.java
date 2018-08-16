package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class elements {
	
	WebDriver driver;
	
	public elements(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="A/B Testing")WebElement ABTesting;
	@FindBy(xpath="//p")WebElement textValidation;
	@FindBy(partialLinkText="Basic Auth")WebElement BasicAuth;
	@FindBy(xpath="//p[contains(@text,'')]")WebElement TextBasicAuth;
	@FindBy(linkText="Broken Images")WebElement BrokenImage;
	@FindBy(tagName="img")WebElement allImages;
	@FindBy(linkText="Challenging DOM")WebElement DOM;
	@FindBy(xpath="//table/thead/tr/th[1]")WebElement Lorem;
	@FindBy(xpath="(//form[@id='checkboxes']/input)[1]")WebElement checkBox1;
	@FindBy(xpath="(//form[@id='checkboxes']/input)[2]")WebElement checkBox2;
	@FindBy(linkText="Checkboxes")WebElement Checkboxes;
	@FindBy(linkText="Context Menu") WebElement ContextMenu;
	@FindBy(css="#hot-spot")WebElement ContextMenuItem;
	
	@FindBy(linkText="Disappearing Elements")WebElement DisappearingElement;
	@FindBy(xpath="//a[text()='Home']")WebElement DisappearingHome;
	@FindBy(xpath="//a[text()='About']")WebElement DisappearingAbout;
	@FindBy(xpath="//a[text()='Contact Us']")WebElement DisappearingContactUs;
	@FindBy(xpath="//a[text()='Portfolio']")WebElement DisappearingPortfolio;
	
	@FindBy(linkText="Drag and Drop")WebElement DragAndDropLink;
	@FindBy(id="column-a")WebElement ADragable;
	@FindBy(id="column-b")WebElement bDragable;
	
	public WebElement ABtest(){
		return ABTesting;
	}
	public WebElement getallTheText(){
		return textValidation;
	}
	public WebElement returnBasicAuth(){
		return BasicAuth;
	}
	public WebElement getsucesstext(){
		return TextBasicAuth;
	}
	public WebElement clickBrokenLink(){
		return BrokenImage;
	}
	public WebElement getImages(){
		return allImages;
	}
	public WebElement ChallgeDOM(){
		return DOM;
	}
	public WebElement Lorem(){
		return Lorem;
	}
	public WebElement checkbox1(){
		return checkBox1;
	}
	public WebElement checkbox2(){
		return checkBox2;
	}
	public WebElement clickCheckboxes(){
		return Checkboxes;
	}
	public WebElement ContextMenu(){
		return ContextMenu;
	}
	public WebElement clickContextMenuItem(){
		return ContextMenuItem;
	}
	public WebElement clickDisappearingElement(){
		return DisappearingElement;
	}
	public WebElement ClickHome(){
		return DisappearingHome;
	}
	public WebElement ClickAbout(){
		return DisappearingAbout;
	}
	public WebElement ClickContactUs(){
		return DisappearingContactUs;
	}
	public WebElement ClickPortFolio(){
		return DisappearingPortfolio;
	}
	public WebElement clickDragAndDropable(){
		return DragAndDropLink;
	}
	public WebElement Adragable(){
		return ADragable;
	}
	public WebElement Bdragable(){
		return bDragable;
	}

}
