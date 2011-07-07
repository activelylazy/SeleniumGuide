package uk.co.activelylazy.selenium;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class BetterAmazonSearchTest {

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
		driver.get("http://www.amazon.co.uk/");
		
		AmazonHomePage homePage = PageFactory.initElements(driver, AmazonHomePage.class);
		AmazonSearchResultsPage resultsPage = homePage.searchFor("iain banks");
		
		assertThat(resultsPage.getTopResultTitle(), is("Transition"));
	}
}
