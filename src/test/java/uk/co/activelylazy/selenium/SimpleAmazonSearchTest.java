package uk.co.activelylazy.selenium;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
		WebElement keywordsField = driver.findElement(By.name("field-keywords")); 
		keywordsField.sendKeys("iain banks");

		// Click go
		WebElement goButton = driver.findElement(By.cssSelector("#navGoButton input")); 
		goButton.click();
		
		// Confirm top result
		WebElement topResultTitle = driver.findElement(By.cssSelector("#result_0 .title a"));
		assertThat(topResultTitle.getText(), is("Stonemouth"));
	}
}
