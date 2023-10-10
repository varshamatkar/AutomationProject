package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		
	//	WebElement link1= driver.findElement(By.linkText("Forgot Your Password?"));
       // link1.click();
       
		WebElement link2= driver.findElement(By.partialLinkText("Use"));
		link2.click();
//        System.out.println( link2.isDisplayed());
//        System.out.println(link2.isEnabled());
        System.out.println(link2.isSelected());
        
        Thread.sleep(5000);
        driver.close();
        
	}

}
