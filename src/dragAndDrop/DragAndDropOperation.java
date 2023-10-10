package dragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOperation {

	public static void main(String[] args) throws InterruptedException {
    
	WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		Actions a=new Actions(driver);
	
        WebElement oslo=driver.findElement(By.xpath("//div[@id='box1']"));
		
		Thread.sleep(1000);
		
		WebElement norway =driver.findElement(By.xpath("//div[@id='box101']"));
         Thread.sleep(1000);
	        a.clickAndHold(oslo).build().perform();
	        Thread.sleep(1000);
	        
	        a.moveToElement(norway).build().perform();
	        Thread.sleep(0);
	        
	        a.release().build().perform();
	        
	        //a.clickAndHold(oslo).moveToElement(norway).release().build().perform();

	        //stockholm capital
	        WebElement stockholm=driver.findElement(By.xpath("//div[@id='box2']"));
			
			Thread.sleep(1000);
			
			WebElement sweden =driver.findElement(By.xpath("//div[@id='box102']"));
	        
			 a.dragAndDrop(stockholm, sweden).build().perform();
			 
			 
			 //Washington capital
			 WebElement washington =driver.findElement(By.xpath("//div[@id='box3']"));
			 Thread.sleep(1000);
			 WebElement unitedState =driver.findElement(By.xpath("//div[@id='box103']"));
			 Thread.sleep(1000);
			 
			 a.dragAndDrop(washington, unitedState).build().perform();
			 Thread.sleep(1000);
			// a.clickAndHold(washington).moveToElement(unitedState).build().perform();
			 Thread.sleep(1000);
			 
			 //Copenhagen capital
			 WebElement copenhagen =driver.findElement(By.xpath("//div[@id='box4']"));
			 Thread.sleep(1000);
			 WebElement denmark =driver.findElement(By.xpath("//div[@id='box104']"));
			 Thread.sleep(1000);
		     a.dragAndDrop(copenhagen, denmark).build().perform();
		     Thread.sleep(1000);
		     
		     //capital of Seoul
		     WebElement seoul  =driver.findElement(By.xpath("//div[@id='box5']"));
			 Thread.sleep(1000);
			 WebElement southKorea=driver.findElement(By.xpath("//div[@id='box105']"));
			 Thread.sleep(1000);
		    a.dragAndDrop(seoul, southKorea).build().perform();
		     Thread.sleep(1000);
		     
		     
		     //capital of Rome
		     WebElement rome  =driver.findElement(By.xpath("//div[@id='box6']"));
			 Thread.sleep(1000);
			 WebElement italy =driver.findElement(By.xpath("//div[@id='box106']"));
			 Thread.sleep(1000);
		    a.dragAndDrop(rome, italy).build().perform();
		     Thread.sleep(1000);
		     
		     //capital of Madrid
		     WebElement madrid  =driver.findElement(By.xpath("//div[@id='box7']"));
			 Thread.sleep(1000);
			 WebElement spain =driver.findElement(By.xpath("//div[@id='box107']"));
			 Thread.sleep(1000);
		     a.dragAndDrop(madrid, spain).build().perform();
		     Thread.sleep(1000);
		     
		     driver.close();
	}

}
