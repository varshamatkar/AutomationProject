package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {
	
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
		   // driver.manage().window().maximize();
		    
		    Thread.sleep(2000);
		    
		    WebElement dropDown= driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"));
		    
		    dropDown.click();
		    
		    Select sl=new Select(dropDown);
		    
		    sl.selectByIndex(0);
		    Thread.sleep(1000);
		    sl.selectByValue("option3");
		    Thread.sleep(1000);
		    sl.selectByVisibleText("Option3");
		    
		    driver.close();
		    
	}

}
