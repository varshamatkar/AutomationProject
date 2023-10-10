package windowHandling;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsHandling {
	
@Test
public void handlingWindow() throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	System.out.println(driver.getWindowHandle());
	System.out.println(driver.getCurrentUrl());
	
	WebElement openWindow=driver.findElement(By.xpath("//button[@id='openwindow']"));
	openWindow.click();
	
//	System.out.println(driver.getWindowHandle());
//	System.out.println(driver.getCurrentUrl());
	
	
	//switch to child window
	Set<String>v=driver.getWindowHandles();
	Iterator<String>it=v.iterator();
	String parentWindow=it.next();
	String childWindow=it.next();
	driver.switchTo().window(childWindow);
	Thread.sleep(2000);
	
	
	System.out.println(driver.getWindowHandle());
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")).click();
    Thread.sleep(2000);
    
    //switch to parrent window again
    driver.switchTo().window(parentWindow);
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getWindowHandle());
    
	driver.close();
}
}
