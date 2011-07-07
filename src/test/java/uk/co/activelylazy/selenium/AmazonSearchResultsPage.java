package uk.co.activelylazy.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonSearchResultsPage {

	private WebDriver driver;
	
	public AmazonSearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTopResultTitle() {
		return driver.findElement(By.cssSelector("#result_0 .title a")).getText();
	}

}
