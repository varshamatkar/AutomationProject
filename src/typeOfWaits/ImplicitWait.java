package typeOfWaits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class ImplicitWait {
	
	public void implicit() {
		
	
	WebDriver driver=new ChromeDriver();
	//implicit wait
	
	driver.get("https://www.google.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	
	
	
	
	WebElement search= driver.findElement(By.name("q"));
	search.sendKeys("Types of waits");
	search.submit();
	
	//explicit wait
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20) );
	 WebElement link=  wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Selenium Wait Commands: Implicit, Explicit, and Fluent Wait")));
	link.click();
	
	//fluent wait
	Wait<WebDriver> fluentWait=new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofSeconds(1))
			.ignoring(org.openqa.selenium.NoSuchElementException.class); 
	
	WebElement link2= fluentWait.until(ExpectedConditions.elementToBeClickable(By.linkText("Get Started free")));
	link2.click();
	driver.close();
	driver.quit();
	
	}	

}
