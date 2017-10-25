package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import fourstay.utilities.Driver;

public class FileUploadClass {
	WebDriver driver=Driver.getInstance();
	
	@Test
	public void fileUploadTest(){
		driver.get("http://the-internet.herokuapp.com/upload");
		
		WebElement fileChooseOpt=driver.findElement(By.id("file-upload"));
		
		String fileFolder=System.getProperty("user.dir");
		
		String testUploadFile="/src/test/resources/TestData/testUpload.docx";
		fileChooseOpt.sendKeys(fileFolder + testUploadFile);
		
		String jpgFile="/src/test/resources/TestData/HR_Schema.png";
		fileChooseOpt.sendKeys(fileFolder + jpgFile);
		
		WebElement uploadBtn=driver.findElement(By.id("file-submit"));
		uploadBtn.click();
	}
	

}
