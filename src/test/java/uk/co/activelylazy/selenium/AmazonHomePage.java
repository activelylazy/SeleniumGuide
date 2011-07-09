package uk.co.activelylazy.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {

	private WebDriver driver;
	
	@FindBy(name="field-keywords")
	private WebElement keywordsField;
	
	@FindBy(css="#navGoButton input")
	private WebElement goButton;
	
	public AmazonHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public AmazonSearchResultsPage searchFor(String searchTerm) {
		keywordsField.sendKeys(searchTerm);
		goButton.click();
		
		return PageFactory.initElements(driver, AmazonSearchResultsPage.class);
	}

	public static AmazonHomePage navigateTo(WebDriver driver) {
		driver.get("http://www.amazon.co.uk/");
		return PageFactory.initElements(driver, AmazonHomePage.class);
	}
}
