package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  WebDriver driver=new ChromeDriver();
  driver.get("https://login.salesforce.com/?locale=in");
  driver.manage().window().maximize();
  //Thread.sleep(2000);
  
 WebElement userName= driver.findElement(By.id("username"));
 Thread.sleep(2000);
 
 userName.click();
 Thread.sleep(2000);
 
 userName.sendKeys("Varsha");
 Thread.sleep(2000);
 
 WebElement password= driver.findElement(By.name("pw"));
 password.click();
 password.sendKeys("Varsha@321");
 
 WebElement loginBtn=driver.findElement(By.name("Login"));
 loginBtn.click();
 
	}

}
