package typeOfWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/login");
		
	// Implicit wait
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
		
		
	WebDriverWait waitForUserName = new WebDriverWait(driver,Duration.ofSeconds(20));
	 WebElement userName=driver.findElement(By.xpath("//input[@id='userName']"));
	waitForUserName.until(ExpectedConditions.elementToBeClickable(userName));
	 userName.sendKeys("Varsha");
	
	 
	 // Explicit wait
//	   WebDriverWait waitForSearch = new WebDriverWait(driver,Duration.ofSeconds(10));
//	   WebElement search=waitForSearch.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchBox']")));
//	   search.sendKeys("varsha");      
		
	
		
	


	}

}
