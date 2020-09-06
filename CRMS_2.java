package batch_6.CRMS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CRMS_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			 WebDriver driver = new FirefoxDriver();

			    //Open the browser
			    driver.get("http://alchemy.hguy.co/crm");
			    
			    List<WebElement>links=driver.findElements(By.tagName("img"));

                // this will display list of all images exist on page
                for(WebElement ele:links){
                    System.out.println(ele.getAttribute("src"));
                }
                
                //this will display header URL
                WebElement linkTextLocator = driver.findElement(By.linkText("SuiteCRM"));
        		System.out.println("The url of the header is: " + linkTextLocator.getAttribute("href"));
                driver.close();
	}

}
