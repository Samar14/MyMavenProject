package Tests;

import java.awt.AWTException;
import java.awt.Robot;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

import fourstay.utilities.Driver;

public class GetColorofObject {
	
	WebDriver driver=Driver.getInstance();
	
	@Test
	public void getColor() throws AWTException{
		driver.get("https://www.google.com/");
		String color=driver.findElement(By.id("gs_sc0")).getAttribute("color");
		System.out.println(color);
		String hex = Color.fromString(color).asHex();
		System.out.println(hex);
		
	}

}
