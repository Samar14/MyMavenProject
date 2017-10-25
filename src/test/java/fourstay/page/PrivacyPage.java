package fourstay.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fourstay.utilities.Driver;

public class PrivacyPage {
	private WebDriver driver;
	
	public PrivacyPage(){
		this.driver=Driver.getInstance();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="[required='required']")
	public WebElement firstDropDown;
	
	@FindBy(xpath="//div[1]/form/div[2]/div/select")
	public WebElement secondDropDown;
	
	@FindBy(xpath="//div[1]/form/div[3]/div/select")
	public WebElement thirdDropDown;
	
	@FindBy(xpath="//div[1]/form/div[4]/div/select")
	public WebElement fourthDropDown;
	
	@FindBy(xpath="//div[1]/form/div[5]/div/select")
    public WebElement fifthDropDown;
	
	@FindBy(xpath="//div[1]/form/div[6]/div/select")
	public WebElement sixthDropDown;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement saveButton;
}
