package frameAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);

       WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frm1']"));
      driver.switchTo().frame(frame1);
      Thread.sleep(2000);
      
      WebElement dropdown1=driver.findElement(By.xpath("//*[@id=\"selectnav1\"]"));
      dropdown1.click();
      
      Thread.sleep(1000);
      
    driver.switchTo().defaultContent();
      
     
     WebElement frame2=driver.findElement(By.xpath("(//iframe[@id='frm2'])"));
     driver.switchTo().frame(frame2);
     Thread.sleep(2000);
  
       WebElement dropdown2=driver.findElement(By.xpath("//*[@id=\"selectnav1\"]"));
        dropdown2.click();
        Thread.sleep(2000);
        
       driver.switchTo().defaultContent();
        
        WebElement frame3=driver.findElement(By.xpath("(//iframe[@id='frm3'])"));
        driver.switchTo().frame(frame3);
        

        WebElement dropdown3=driver.findElement(By.xpath("//*[@id=\"selectnav1\"]"));
           dropdown3.click();
           Thread.sleep(2000);
           
           driver.close();
        
        
	}
}