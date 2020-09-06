package batch_6.CRMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CRMS_4 {
	
	public static void main(String[] args) {

	    // Create a new instance of the Firefox driver
	    WebDriver driver = new FirefoxDriver();
	    WebDriverWait wait = new WebDriverWait(driver, 10);

	    //Open the browser
	    driver.get("http://alchemy.hguy.co/crm");
	    
	    
	    //Find the input fields
	    WebElement Username = driver.findElement(By.id("user_name"));
	    WebElement Password = driver.findElement(By.id("username_password"));
	    //Enter text
	    Username.sendKeys("admin");
	    Password.sendKeys("pa$$w0rd");
	    
	   // Click Submit
	     driver.findElement(By.id("bigbutton")).click();
	     
	   //verify the home page is opened
	       
	     wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("/html/body/div[3]/div/div/p/a"), "Email Settings"));
	     WebElement homepagetext = driver.findElement(By.xpath("/html/body/div[3]/div/div/p/a"));
	      
	      
	        System.out.println("Verify locator in homepage: " +homepagetext.getText());
	    		  

	    //Close the browser
	    driver.close();
	    
	}

}
