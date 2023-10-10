package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropDown {

	public static void main(String[] args) throws InterruptedException {
   
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
	    //driver.manage().window().maximize();
	    
	    Thread.sleep(2000);
	    
	   WebElement country=driver.findElement(By.xpath("//input[@id='autosuggest']"));
	        country.click();
	        
	       country.sendKeys("Ind");
	    
	       Thread.sleep(2000);
	  
	      /*country.sendKeys(Keys.ARROW_DOWN);
	      Thread.sleep(2000);
	      country.sendKeys(Keys.ARROW_DOWN	);
	      country.sendKeys(Keys.ENTER);*/
	       
	      List<WebElement>in=driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
	      
	      Thread.sleep(1000);
	      for(int i=0;i<in.size();i++) {
	    	  if(in.get(i).getText().equalsIgnoreCase("india"))
	    	  {
	    		  in.get(i).click();
	    		  break;
	    		  
	    	  }
	       
	      } 

	}

}
