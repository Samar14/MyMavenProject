package fourstay.step_def;


import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import fourstay.page.FStayListingHostPage;
import fourstay.page.FourStayHomePage;
import fourstay.page.FourStayUserAccountPage;
import fourstay.page.PrivacyPage;
import fourstay.utilities.Config;
import fourstay.utilities.Driver;
import fourstay.utilities.Page;

public class StayTestListingStepDef {
	WebDriver driver=Driver.getInstance();
	FourStayHomePage fourStayHomePage=new FourStayHomePage();
	FourStayUserAccountPage fourStayUserAccountPage=new FourStayUserAccountPage();
    FStayListingHostPage  fStayListingHostPage=new FStayListingHostPage();
	Actions actions=new Actions(driver);
	
	@Given("^User is on the home page$")
	public void user_is_on_the_home_page() throws Throwable {
		Driver.getInstance().get(Config.getProperty("urlFStay"));
	}
	
	@Given("^User logins in using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_logins_in_using_and(String userName, String userPassword) throws Throwable {
		fourStayHomePage.login(userName, userPassword);
	}

	@Given("^User seraches \"([^\"]*)\" on the user account page$")
	public void user_seraches_on_the_user_account_page(String cityLocation) throws Throwable {
		Page.sleep(4000);
		fourStayUserAccountPage.searchBox.clear();
		fourStayUserAccountPage.searchBox.sendKeys((cityLocation)+Keys.ENTER);
		//fourStayUserAccountPage.searchButton.click();
	}

	@Then("^User cliks New York listing$")
	public void user_cliks_New_York_listing() throws Throwable {
		Page.sleep(5000);
		fourStayUserAccountPage.lists.click();
	}

	@Then("^User cliks Rahul Kumars profile$")
	public void user_cliks_Rahul_Kumars_profile() throws Throwable {
		Page.sleep(4000);
		fStayListingHostPage.hostProfile.click();
	}

	@Then("^Message should be \"([^\"]*)\"$")
	public void message_should_be(String hostMessage) throws Throwable {
		//Page.waitFor(fStayListingHostPage.htMessage, 20);
		Page.sleep(5000);
	    assertEquals(hostMessage, fStayListingHostPage.htMessage.getText());
	}

	@Given("^User clicks profile picture and goes to privacy page$")
	public void user_clicks_profile_picture_and_goes_to_privacy_page() throws Throwable {
		Page.sleep(5000);
		actions.moveToElement(fourStayUserAccountPage.profilePic).perform();
		//fourStayUserAccountPage.profilePic.click();
		fourStayUserAccountPage.editProfile.click();
		Page.sleep(5000);
		fourStayUserAccountPage.privacy.click();
	}

	@Then("^User updates privacy and save it$")
	public void user_updates_privacy_and_save_it() throws Throwable {
		PrivacyPage privacyPage=new PrivacyPage();
		Page.sleep(5000);
	    Select fisrtSelect=new Select(privacyPage.firstDropDown);
	    fisrtSelect.selectByVisibleText("Host");

	    Select secondSelect=new Select(privacyPage.secondDropDown);
	    secondSelect.selectByIndex(0);
	    
	    Select thirdSelect=new Select(privacyPage.thirdDropDown);
	    thirdSelect.selectByValue("Host");
	    
	    Select fourthSelect=new Select(privacyPage.fourthDropDown);
	    fourthSelect.selectByIndex(1);
	    
	    Select fifthSelect=new Select(privacyPage.fifthDropDown);
	    fifthSelect.selectByVisibleText("No");
	    
	    Select sixthSelect=new Select(privacyPage.sixthDropDown);
	    sixthSelect.selectByVisibleText("Manual");
	    
	    privacyPage.saveButton.click();
	    
	}
	
	@Given("^Guest enters \"([^\"]*)\"$")
	public void guest_enters(String location) throws Throwable {
		fourStayHomePage.inputBox.sendKeys(location);
	
	}
	
	@Given("^Guest enters check-in date and check-out date$")
	public void guest_enters_check_in_date_and_check_out_date() throws Throwable {
		fourStayHomePage.moveInDate.click();
List<WebElement> allDates=Driver.getInstance().findElements(By.xpath("//table[@class='table-condensed']//td"));
        
        for(WebElement ele: allDates){
        	String date=ele.getText();
        	
        	if(date.equalsIgnoreCase("25")){
        		ele.click();
        		break;
        	}
        }
        
        fourStayHomePage.moveOutDate.sendKeys("06/27/2017");
        
	}

	@Given("^Guest selects the number of beds$")
	public void guest_selects_the_number_of_beds() throws Throwable {
		WebDriverWait wait=new WebDriverWait(Driver.getInstance(), 10);
		wait.until(ExpectedConditions.visibilityOf(fourStayHomePage.messageFrame));
		Assert.assertTrue(fourStayHomePage.messageFrame.isDisplayed());
		closeThat();
		
		
		
		
//		Page.sleep(5000);
//	    Driver.getInstance().switchTo().frame(fourStayHomePage.messageFrame);
//		fourStayHomePage.popupWindow.click();
//		fourStayHomePage.popupWindow.click();
//		Page.sleep(5000);
//		fourStayHomePage.popupWindow.click();
//		fourStayHomePage.popupWindow.click();
//		Driver.getInstance().switchTo().defaultContent();
//		Page.sleep(5000);
//		fourStayHomePage.numOfBeds.click();
//		fourStayHomePage.selectBeds(2);
		
	}

	private void closeThat() {
	//Action action=new Action(driver);
		
	}

	@When("^Guest clicks search button$")
	public void guest_clicks_search_button() throws Throwable {
		//fourStayHomePage.searchBtn.click();
	}
}
