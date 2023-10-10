package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsEx {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Done");
		
		
		WebElement userName=driver.findElement(By.name("username"));
		userName.click();
		userName.sendKeys("Varsha");
		Thread.sleep(2000);
		System.out.println("Done");
	    

        WebElement pass=driver.findElement(By.name("password"));
	    pass.click();
	    pass.sendKeys("Varsha@321");
	    Thread.sleep(2000);
	    System.out.println("Done");
	    
	    
	    WebElement logIn=driver.findElement(By.tagName("button"));
	    logIn.click();
	    Thread.sleep(3000);
	    System.out.println("Done");
	    
	    //driver.close();
	}


		
	}
	
