package fourstay.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Page {
	
	public static void sleep(long millis){
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void waitFor(WebElement element, int seconds) {
		WebDriver driver = Driver.getInstance();
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
     }
	
	
	public static void waitForPageLoad(){
		WebDriver driver = Driver.getInstance();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.sk-double-bounce"))); 
	}

}
