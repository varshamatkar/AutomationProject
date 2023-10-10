package mouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOperations {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
	        driver.get("http://www.unipune.ac.in/");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);


	       //create object of Actions class
	       Actions a=new Actions(driver);
			
			 WebElement aboutTheUniversity= driver.findElement(By.xpath("//*[@id=\"stUI5_txt\"]"));
			 Thread.sleep(2000);
			 a.moveToElement(aboutTheUniversity).build().perform();
			 Thread.sleep(2000);
			 
			 WebElement acadmics= driver.findElement(By.xpath("//span[@id='stUI42_txt']"));
			 a.moveToElement(acadmics);
			 a.build().perform();
			 Thread.sleep(2000);
			 
			 WebElement research=driver.findElement(By.xpath("//span[@id='stUI184_txt']"));
			a.moveToElement(research).build().perform();
			Thread.sleep(2000);
			
			WebElement admin=driver.findElement(By.xpath("//span[@id='stUI194_txt']"));
			a.moveToElement(admin).build().perform();
			Thread.sleep(2000);
			
			WebElement bod=driver.findElement(By.xpath("//span[@id='stUI215_txt']"));
			a.moveToElement(bod).build().perform();
			Thread.sleep(1000);
		
			
			WebElement studentCorner= driver.findElement(By.xpath("//span[@id='stUI229_txt']"));
			a.moveToElement(studentCorner).build().perform();
			Thread.sleep(1000);
			
			WebElement usefulLinks=driver.findElement(By.xpath("//span[@id='stUI253_txt']"));
			a.moveToElement(usefulLinks).build().perform();
			Thread.sleep(1000);
			
			WebElement elearning=driver.findElement(By.xpath("//span[@id='stUI277_txt']"));
			a.moveToElement(elearning).build().perform();
			Thread.sleep(1000);
			
			
	}
}