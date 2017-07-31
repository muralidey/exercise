package search.phone.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SearchDriver {

	
	
	public SearchDriver(WebDriver driver) {
		
		driver = new FirefoxDriver();
		driver.get("www.google.co.uk");
	}
	
	public boolean  validateForLink(WebDriver driver, String URL) {
	    if ( driver.getPageSource().contains(URL) ) {
	    	return true;
	    } else {
	    	return false;
	    }
	    
	}
	
}
