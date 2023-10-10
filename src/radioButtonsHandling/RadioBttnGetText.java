package radioButtonsHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBttnGetText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
		   WebElement button1=driver.findElement(By.xpath("//input[@value='radio1']"));
			
	        WebElement  button2=driver.findElement(By.xpath("//input[@value='radio2']"));
	        
	        WebElement  button3=driver.findElement(By.xpath("//input[@value='radio3']"));
	        
	      //If the radio button is associated with a label element using the for attribute,
	        //we can locate the label element instead and retrieve its text:
	       
	        WebElement labelElementRadio1 = driver.findElement(By.xpath("//label[@for='radio1']"));
	        System.out.println(labelElementRadio1.getText());
	        
	        WebElement labelElementRadio2 = driver.findElement(By.xpath("//label[@for='radio2']"));
	        System.out.println(labelElementRadio2.getText());
	        
	        WebElement labelElementRadio3 = driver.findElement(By.xpath("//label[@for='radio2']"));
	        System.out.println(labelElementRadio3.getText());
	        
	        // retive all radio bttns text
	        List< WebElement>allbttns=driver.findElements(By.xpath("//div[@id='radio-btn-example']/fieldset/label"));
	        for(int i=0;i<allbttns.size();i++) {
	        	System.out.println(allbttns.get(i).getText());
	        	Thread.sleep(2000);
	        	
	        }
	        
	      
	}

	}


