package batch_6.CRMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CRMS_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
	      driver.get("http://alchemy.hguy.co/crm");
	     
	      
	      WebElement idLocator = driver.findElement(By.id("admin_options"));
	      System.out.println("First copyright text in the footer: " + idLocator.getText());
	      
	    driver.close();
	}

}
