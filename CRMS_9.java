package batch_6.CRMS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CRMS_9 {

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
		   	 WebElement Sales=driver.findElement(By.xpath("//a[text()='Sales']"));
			 Sales.click();
			 Thread.sleep(500);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sales']/following::ul[1]/li/a[text()='Leads']")));
			 WebElement Salesleads=driver.findElement(By.xpath("//a[text()='Sales']/following::ul[1]/li/a[text()='Leads']"));
			 Salesleads.click();
			 Thread.sleep(500);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Leads')]")));
			 Thread.sleep(500);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr/td[1]/ul[contains(@class,'listViewLinkButton_top')]/li/a[contains(@title,'Filter') and contains(@class,'glyphicon-filter')]")));
				
			 @SuppressWarnings("unused")
			 List<WebElement> Filter=driver.findElements(By.xpath("//form[2]/div[3]/table/tbody/tr"));
				for (int i=1;i<=10;i++)
				{
					WebElement LeadDetails=driver.findElement(By.xpath("//form[2]/div[3]/table/tbody/tr["+i+"]/td[3]"));
					WebElement LeadUser=driver.findElement(By.xpath("//form[2]/div[3]/table/tbody/tr["+i+"]/td[8]"));
					System.out.println("Name column "+i+" : "+LeadDetails.getText()+ " and User column : "+LeadUser.getText() );
					
				}
				driver.close();
	}

}
