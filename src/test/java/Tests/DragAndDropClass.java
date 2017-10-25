package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import fourstay.utilities.Driver;
import fourstay.utilities.Page;

public class DragAndDropClass {
	WebDriver driver=Driver.getInstance();
	
	@Test
	public void dragAndDrop(){
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		
		Actions action=new Actions(driver);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(drag, drop).perform();
	}

}

//preferences > Java > Editor > Content Assist > Favorites > New Type enter org.junit.Assert.*