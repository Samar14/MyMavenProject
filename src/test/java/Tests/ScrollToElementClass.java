package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import fourstay.utilities.Driver;
import fourstay.utilities.Page;

public class ScrollToElementClass {
	WebDriver driver=Driver.getInstance();
	
	@Test
	public void scrollToElementTest(){
		driver.get("http://the-internet.herokuapp.com/");
		WebElement scrollDown=driver.findElement(By.id("page-footer"));
		
		Actions action=new Actions(driver);
		//action.moveToElement(scrollDown).perform();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scrollDown);
	}

}
