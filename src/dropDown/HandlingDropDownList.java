package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");

//locate select web Element
WebElement select=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

//with the help of select class
// create select class object and pass web Element in parentheses 
Select dropdown=new Select(select);

dropdown.selectByIndex(0);
Thread.sleep(2000);
dropdown.selectByIndex(1);
Thread.sleep(2000);
dropdown.selectByIndex(2);

// Use getOptions() to retrieve all the available options

List<WebElement>retiveAllOptions= dropdown.getOptions();

// Loop through the options and print their text
for(int i=0;i<retiveAllOptions.size();i++) {
	System.out.println(retiveAllOptions.get(i).getText());
}



  
Thread.sleep(2000);
    select.click();
    Thread.sleep(2000);
	
	WebElement opt1=driver.findElement(By.xpath("//option[@value='option1']"));
	System.out.println(opt1.isDisplayed());
	System.out.println(opt1.isEnabled());
    System.out.println(opt1.isSelected());
    
    System.out.println(opt1.getText());
  
    

	//opt1.click();
    System.out.println(opt1.isSelected());

	
	Thread.sleep(2000);

	WebElement opt2=driver.findElement(By.xpath("//option[@value='option2']"));
	System.out.println(opt2.isDisplayed());
	System.out.println(opt2.isEnabled());
    System.out.println(opt2.isSelected());
    
//	opt2.click();
	System.out.println(opt2.isSelected());
	Thread.sleep(2000);

	
	WebElement opt3=driver.findElement(By.xpath("//option[@value='option3']"));
	System.out.println(opt3.isDisplayed());
	System.out.println(opt3.isEnabled());
    System.out.println(opt3.isSelected());
	
   // opt3.click();
    System.out.println(opt3.isSelected());
    Thread.sleep(2000);
    
    List<WebElement> optionsoFDropDown= driver.findElements(By.xpath("//select[@id='dropdown-class-example']/option"));
    
//    for(int i=0;i<optionsoFDropDown.size();i++) {
//    	optionsoFDropDown.get(i).click();
//    	
//    	Thread.sleep(2000);
//    }
    
    
    for(WebElement dropdowns: optionsoFDropDown) {
    dropdowns.click();
    
    Thread.sleep(2000);
   
    }
    
    
    
	
	


	
}
}