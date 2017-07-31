package search.phone.cucumber.stepsdef;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import search.phone.google.*;
import cucumber.api.java.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;


public class PhoneSearchStepDef {

	public SearchDriver googlePage;
	WebDriver driver;
	String amazonURL = "amazon.co.uk";

	@Before
	public void Setup() {
		
		System.out.println("Printing setup");
	}
	@Given("^I am on google search page$")
	public void i_am_on_google_com_search_page()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test on google.com");
		googlePage = new SearchDriver(driver);
		assertTrue(driver.getTitle().contains("google"));
	}

	@And("^I want to search for iphone$")
	public void i_want_to_search_for_iphone()  {
	    
		driver.findElement(By.id("lst-ib")).sendKeys("iphone");
		assertTrue(driver.getTitle().contains("iphone"));
	}

	@When("^I see amazon\\.co\\.uk link in search results$")
	public void i_see_amazon_co_uk_link_in_search_results()  {
		int pageNo = 1;
	    // Write code here that turns the phrase above into concrete actions
	    while (googlePage.validateForLink(driver,amazonURL) == true) {
	    	pageNo++;
	    	driver.findElement(By.linkText(Integer.toString(pageNo))); 
	    }
	}

	@When("^I select the link$")
	public void i_select_the_link()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I look for larges model on stroage space$")
	public void i_look_for_larges_model_on_stroage_space()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^print the name, price and URL on the console$")
	public void print_the_name_price_and_URL_on_the_console()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^ensure the price of the model not greather than £(\\d+)$")
	public void ensure_the_price_of_the_model_not_greather_than_£(int arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
