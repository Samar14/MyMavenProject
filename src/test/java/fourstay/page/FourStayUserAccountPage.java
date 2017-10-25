package fourstay.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fourstay.utilities.Driver;

public class FourStayUserAccountPage {
	private WebDriver driver;
	
	public FourStayUserAccountPage(){
		this.driver=Driver.getInstance();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='hLocName']")
	public WebElement searchBox;
	
	@FindBy(xpath="//*[@id='lForm']/div")
	public WebElement searchButton;
	
	//css="[class='ng-binding']"
	@FindBy(xpath="//*[@id='myCarousel4']//div/h3")
    public WebElement lists;
	
	@FindBy(xpath="//*[@id='main_nav']/ul/li[5]/a/img")
	public WebElement profilePic;
	
	@FindBy(xpath="//*[@id='main_nav']/ul/li[5]/ul/li[1]/a")
	public WebElement editProfile;
	
	@FindBy(xpath="html/body/div[3]/div/section/div/div/div[1]/div/ul/li[3]/a")
	public WebElement privacy;
	
	
	
	
	
	
//	public void search(String location){ 
//		searchBox.clear(); 
//		searchBox.sendKeys(location); 
//		searchButton.click();
//		} 
}
