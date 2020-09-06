package batch_6.CRMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CRMS_1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver = new FirefoxDriver();

		    //Open the browser
		    driver.get("http://alchemy.hguy.co/crm");
		    
		    //Find the page title and print it
		    String pageTitle = driver.getTitle();
		    System.out.println("Page title is: " + pageTitle);
		    String expectedTitle = "SuiteCRM";
		    if (pageTitle.contains(expectedTitle))
		    {
		    	// System.out.println("Matches:closing the browser ");
		         driver.close();
		    }
	}

}
