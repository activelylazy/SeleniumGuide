package uk.co.activelylazy.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleAmazonSearchTest {

	private FirefoxDriver driver;

	@Before
	public void setupSelenium() {
		driver = new FirefoxDriver();
	}
	
	@After
	public void closeSelenium() {
		driver.close();
		driver.quit();
	}
	
	@Test public void
	search_amazon() {
		// Open the amazon home page
		driver.get("http://www.amazon.co.uk/");
		
		// Enter a search term
		driver.findElement(By.name("field-keywords")).sendKeys("iain banks");

		// Click go
		driver.findElement(By.cssSelector("#navGoButton input")).click();
	}
}
