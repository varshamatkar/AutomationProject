package radioButtonsHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandlingRadioButtons {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
		   WebElement button1=driver.findElement(By.xpath("//input[@value='radio1']"));
			
	        WebElement  button2=driver.findElement(By.xpath("//input[@value='radio2']"));
	        
	        WebElement  button3=driver.findElement(By.xpath("//input[@value='radio3']"));
	        
	        System.out.println( button1.isDisplayed());
	        
	        System.out.println( button2.isDisplayed());
	        
	        System.out.println( button3.isDisplayed());
	        
	        System.out.println( button1.isEnabled());
	        
	        System.out.println( button2.isEnabled());
	        
	        System.out.println( button3.isEnabled());
	        
	             button1.click();
	                Thread.sleep(2000);
	                button2.click();
	                Thread.sleep(2000);
	                button3.click();
	                
	                System.out.println(button1.isSelected());
	                
	                System.out.println(button2.isSelected());
	                
	                System.out.println(button3.isSelected());


		
		List<WebElement> p=driver.findElements(By.xpath("//input[@type='radio']"));
		for(int i=0;i<p.size();i++) {
			p.get(i).click();
		
			Thread.sleep(2000);
		
			
		}
		
		driver.close();

	}

}
