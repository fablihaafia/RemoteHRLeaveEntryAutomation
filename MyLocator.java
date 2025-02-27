package AblHrFor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MyLocator {

	@Test
	public void myfirstTest() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://ablhr.akijbakers.io/auth/login");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.findElement(By.name("username")).sendKeys("test@akij.net");
	    Thread.sleep(3000);
	    driver.findElement(By.name("password")).sendKeys("****");
	    Thread.sleep(3000);
	    driver.findElement(By.id("kt_login_signin_submit")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("a[class='menu-link menu-toggle active'] span[class='menu-text']")).click();
	    Thread.sleep(3000);
	    WebElement leaveEntry = driver.findElement(By.xpath("//span[normalize-space()='LEAVE ENTRY']"));
		 
		 System.out.println(leaveEntry.getText());
		 leaveEntry.click();
//		 Thread.sleep(2000);
	
       WebElement selectLeave = driver.findElement(By.xpath("//div[contains(text(),'Select Leave type')]"));
		 
		 System.out.println(selectLeave.getText());
		 selectLeave.click();
//		 Thread.sleep(2000);
		 
       WebElement selectType = driver.findElement(By.xpath("//div[normalize-space()='Medical Leave']"));
		 
		 System.out.println(selectType.getText());
		 selectType.click();
		 Thread.sleep(2000);
		 
      WebElement selectStartDate = driver.findElement(By.xpath("//input[@name='appliedFromDate' and @type='date']"));
//      selectStartDate.click();
      selectStartDate.sendKeys("02-26-2025");
		 
		 
		 WebElement selectEndDate = driver.findElement(By.xpath("//input[@name='appliedToDate']"));
	     
		 selectEndDate.sendKeys("02-27-2025");
		 Thread.sleep(2000);
		 

		 WebElement Phone = driver.findElement(By.xpath("//input[@name='phoneNo']"));
		 
		 
		 Phone.sendKeys("0987654");
		 Thread.sleep(2000);
		 
		  WebElement address = driver.findElement(By.xpath("//textarea[@name='leaveAddress']"));
			 
			 
			 address.sendKeys("test");
			 Thread.sleep(2000);
			 
   WebElement remarks = driver.findElement(By.xpath("//textarea[@name='leaveReason']"));
			 
			 
   remarks.sendKeys("test");
			 Thread.sleep(2000);
			  WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
				 
				
				 submitBtn.click();
				 Thread.sleep(2000);
	}

}

