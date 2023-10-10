package mouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOperation {

	public static void main(String[] args) throws InterruptedException {
		
		
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //driver.manage().window().maximize();
        Thread.sleep(2000);


       //create object of Actions class
       Actions a=new Actions(driver);
		
		 WebElement mouseHover= driver.findElement(By.xpath("//button[@id='mousehover']"));
		 Thread.sleep(2000);
		 a.moveToElement(mouseHover).build().perform();
		 Thread.sleep(2000);
		
        // by using keyboard operations to click second option
        // mouseHover.sendKeys(Keys.ARROW_DOWN);
        //Thread.sleep(1000);
        //mouseHover.sendKeys(Keys.ARROW_DOWN);
       //Thread.sleep(1000);
	   //mouseHover.sendKeys(Keys.ENTER);
       //Thread.sleep(2000);
		 
		
		 // locating element using xpath to perform click operation
		 
        WebElement top= driver.findElement(By.xpath("//a[@href='#top']"));
       Thread.sleep(1000);
      top.click();
       Thread.sleep(2000);
		 
		// locating element using xpath to perform click operation
//		 WebElement reload= driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[2]"));
//		 Thread.sleep(2000);
//		 reload.click();
//		 Thread.sleep(2000);
		
		 driver.close();
		 





	}

}
