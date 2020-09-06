package batch_6.CRMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CRMS_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();
			

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
		
		    WebElement navigation = driver.findElement(By.id("grouptab_3"));
	       
             System.out.println(navigation.getText());
             
             if( navigation.getText().contentEquals("ACTIVITIES"))
 
               {
              System.out.println("ACTIVITIES menu exists");
	           }
       driver.close();

	}

}
