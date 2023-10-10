package handlingTabs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingTab {
	
	@Test
	public void handlingTab() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement openTab= driver.findElement(By.xpath("//a[@id='opentab']"));
		openTab.click();
		
		Thread.sleep(1000);
		//control is in rahulshettyacademy.com/AutomationPractice/ page
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		Thread.sleep(1000);
		
		//switch to next tab
		Set<String>tabs=driver.getWindowHandles();
		Iterator<String>ir=tabs.iterator();
	   String parent=ir.next();
	   String child=ir.next();
	   driver.switchTo().window(child);
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")).click();
	   System.out.println(driver.getCurrentUrl());
	   System.out.println(driver.getWindowHandle());
	   Thread.sleep(5000);
	
	   
		driver.quit();
	}

}
