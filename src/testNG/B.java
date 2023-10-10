package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class B {

	@Test
	
	public void scrollDownOperation() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\sel new files\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement mouseHover=driver.findElement(By.xpath("//button[@id='mousehover']"));
		
		Thread.sleep(1000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		// scrolling down till we find specific element...
		
		js.executeScript("arguments[0].scrollIntoView();",mouseHover);
		
		Thread.sleep(1000);
		
		Actions a=new Actions(driver);
		
		// create object fr actions class first
		
		a.moveToElement(mouseHover).build().perform();
		
		
		//mouseHover.sendKeys(Keys.ARROW_DOWN.ENTER);
		
		Thread.sleep(1000);
		/*
		//mouseHover.sendKeys(Keys.ARROW_DOWN);
		//Thread.sleep(1000);
		//mouseHover.sendKeys(Keys.ENTER);
		*/
		
		WebElement reload=driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[2]"));
		
		Thread.sleep(1000);
		
		reload.click();
	}
}

