package windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {
	
	@Test
	public void aboutUs() throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//button[@id='openwindow']")).click();
		System.out.println(d.getWindowHandle());
		System.out.println(d.getCurrentUrl());
		
		
		
		Set<String>windows=d.getWindowHandles();
		Iterator<String> ir=windows.iterator();
		String parentWindow=ir.next();
		String childWindow=ir.next();
		d.switchTo().window(childWindow);
		d.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
		
		System.out.println(d.getWindowHandle());
	    System.out.println(d.getCurrentUrl());
		Thread.sleep(2000);
		d.quit();
		
	}

}
