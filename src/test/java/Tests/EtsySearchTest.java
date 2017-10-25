package Tests;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import fourstay.utilities.Config;

public class EtsySearchTest {
	WebDriver driver;
	//Properties configFile;

	@Before
	public void setUp() throws Exception {
//		String path="./src/test/resources/TestData/configuration.proporties";
//		FileInputStream input=new FileInputStream(path);
//		
//		configFile=new Properties();
//		configFile.load(input);
//	
//		input.close();
		
		System.setProperty(Config.getProperty("webdriver"),
				Config.getProperty("driverPath"));
		driver=new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.get(Config.getProperty("url"));
		driver.findElement(By.name("search_query")).sendKeys(Config.getProperty("item"));
	}

}
