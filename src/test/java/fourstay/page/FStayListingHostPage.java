package fourstay.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fourstay.utilities.Driver;

public class FStayListingHostPage {
	private WebDriver driver;
	
	public FStayListingHostPage(){
		this.driver=Driver.getInstance();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="blah")
	public WebElement hostProfile;
	
	//div[.='Listings by Rahul Kumar']
	@FindBy(xpath="//body/div[3]//div[2]/section/div/div/div[1]")
    public WebElement htMessage;
}

