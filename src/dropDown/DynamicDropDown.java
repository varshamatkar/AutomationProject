package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
	   // driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	   WebElement from=driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']"));
	  from.click();
	  
	  
	  WebElement bangluru= driver.findElement(By.xpath("(//a[@value='BLR'])[1]"));
	
	 
	 System.out.println(bangluru.getText());  
	 
	// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));

	
	  WebElement goa=driver.findElement(By.xpath("(//a[@value='GOI'])[2]"));
	  
	  
	//  wait.until(ExpectedConditions.visibilityOf(goa));
	  goa.click();	  
	  
	  Thread.sleep(2000);
		
		
	   driver.close();
	    
	    
	}

}
