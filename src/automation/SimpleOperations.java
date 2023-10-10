package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleOperations {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
	    Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.youtube.com/watch?v=iJ75od2BEMQ");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
	    driver.navigate().back();
	    System.out.println("Done");
		
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("Done");
		
		//driver.close();
		driver.quit();
	}

}
