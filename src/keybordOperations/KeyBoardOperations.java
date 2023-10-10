package keybordOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardOperations {
	
public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement name=driver.findElement(By.name("username"));
		System.out.println(name.getAttribute("name"));
	
//		name.sendKeys("Admin");
//		
//		Thread.sleep(2000);
//		
//		
//		name.sendKeys(Keys.CONTROL+"a");
//		
//		Thread.sleep(2000);
//		
//		
//		name.sendKeys(Keys.CONTROL+"c");
//		
//		Thread.sleep(2000);
//		
//		
//		name.sendKeys(Keys.TAB);
//		
//		Thread.sleep(2000);
//		
//		WebElement pwd=driver.findElement(By.name("password"));
//		
//		pwd.sendKeys(Keys.CONTROL+"v");
//		
//		pwd.sendKeys(Keys.CONTROL.BACK_SPACE);
//		Thread.sleep(1000);
//		
//		pwd.sendKeys(Keys.CONTROL.BACK_SPACE);
//		Thread.sleep(1000);
//		
//		pwd.sendKeys(Keys.CONTROL.BACK_SPACE);
//		Thread.sleep(1000);
//		
//		pwd.sendKeys(Keys.CONTROL.BACK_SPACE);
//		Thread.sleep(1000);
//		
//		pwd.sendKeys(Keys.CONTROL.BACK_SPACE);
//		Thread.sleep(1000);
//		
//		pwd.sendKeys("admin123");
//		
//		Thread.sleep(2000);
//		
//		pwd.sendKeys(Keys.CONTROL.ENTER);
//		
//		
		
	}

}


