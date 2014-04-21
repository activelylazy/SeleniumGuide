package uk.co.activelylazy.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSearchResultsPage {

	private WebDriver driver;
	
	//@FindBy(css="#result_0 .title a")
	@FindBy(css="#result_0 .newaps")
	private WebElement topResultTitle;
	
	public AmazonSearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTopResultTitle() {
		return topResultTitle.getText();
	}

}
