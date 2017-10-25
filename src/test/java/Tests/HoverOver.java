package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import fourstay.utilities.Driver;
import fourstay.utilities.Page;

public class HoverOver {
	WebDriver driver=Driver.getInstance();
	
	@Test
	public void HoverIt(){
		driver.get("https://www.amazon.com/");
		
		
	}
	

}
