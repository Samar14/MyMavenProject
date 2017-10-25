package fourstay.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import fourstay.utilities.Driver;
import fourstay.utilities.Page;


public class FourStayHomePage {
	
	private WebDriver driver;
	
    public FourStayHomePage(){
    	this.driver=Driver.getInstance();
    	PageFactory.initElements(driver, this);
    }
    
	@FindBy(css="[data-target='#modal-login']")
	public WebElement loginLink;
	
	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(id="key")
	public WebElement password;
	
	@FindBy(id="btn-login")
	public WebElement loginBtn;
	
	@FindBy(xpath="//input[@id='iLocName']")
	public WebElement inputBox;
	
	@FindBy(id="rentoutfrom2")
	public WebElement moveInDate;
	
	@FindBy(id="rentoutto2")
	public WebElement moveOutDate;
	
	@FindBy(xpath="//iframe[@class='intercom-launcher-frame']")
	public WebElement messageFrame;
	
	@FindBy(xpath="//*[@id='intercom-container']/div")
	public WebElement popupWindow;
	
	@FindBy(id="themates")
	public WebElement numOfBeds;
	
	public void selectBeds(int number){
	List<WebElement> options=numOfBeds.findElements(By.xpath("//li//a[@class='list-option-select']"));
	 for(WebElement element: options){
     	
     	if(element.getAttribute("data-value").equals(String.valueOf(number))){
     		element.click();
     	}
     }
	}
	
	@FindBy(xpath="//*[@id='search']")
	public WebElement searchBtn;
	
	public void login(String userEmail, String userPassword){
		 loginLink.click();	
		 email.sendKeys(userEmail);
		 Page.sleep(1000);
		 password.sendKeys(userPassword);
		 Page.sleep(1000);
		 loginBtn.click();
		
		}
}
