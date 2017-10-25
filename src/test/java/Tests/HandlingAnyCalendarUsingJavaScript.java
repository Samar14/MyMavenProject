package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import fourstay.utilities.Driver;

public class HandlingAnyCalendarUsingJavaScript {
	
	public static void setDateUsingJavaScriptInCalendar(WebDriver driver, String value, WebElement calLocator){
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		String script="arguments[0].setAttribute('value', '"+value+"');";
		jse.executeScript(script, calLocator);
	}
	
	public static void main(String[] args){
		WebDriver driver=Driver.getInstance();
//		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html");
		
		//Location deaprture date calendar
		WebElement departCal=driver.findElement(By.id("datepicker"));
		HandlingAnyCalendarUsingJavaScript.setDateUsingJavaScriptInCalendar(driver, "10/09/2017", departCal);
	}

}
