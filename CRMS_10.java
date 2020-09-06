package batch_6.CRMS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CRMS_10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
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
		    driver.manage().window().maximize();
			 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/nav/div/div[2]/ul/li[1]/a")));
			 	Thread.sleep(500);
			 	List<WebElement> dashlet=driver.findElements(By.xpath("//td[@class='dashlet-title']"));
			 	System.out.println("Number of Dashlets in the Homepage: "+dashlet.size());
			 	System.out.println("Dashlet Titles are : ");
				for (WebElement x:dashlet)
				{
					System.out.println(x.getText());
					
				}
				
				driver.close();

	}

}
