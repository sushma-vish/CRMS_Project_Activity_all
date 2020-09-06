package batch_6.CRMS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CRMS_8 {

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
			 WebElement Salesaccount=driver.findElement(By.xpath("//a[text()='Sales']/following::ul[1]/li/a[text()='Accounts']"));
			 Salesaccount.click();
			 Thread.sleep(500);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Accounts')]")));
			 List<WebElement> Filter=driver.findElements(By.xpath("//tr[@class='oddListRowS1']"));
				for (int i=0;i<5;i++)
				{
					System.out.println("Account "+(i+1)+" : "+ Filter.get(i).getText());
					System.out.println(" ");
				}
				
				driver.close();
	}

}
