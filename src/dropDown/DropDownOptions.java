package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		//locate select web Element
		WebElement select=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

		//with the help of select class
		// create select class object and pass web Element in parentheses 
		Select dropdown=new Select(select);

		// with the help of index 
		dropdown.selectByIndex(1);
		Thread.sleep(2000);
		
		// with the help of text on web page
		dropdown.selectByVisibleText("Option2");
		Thread.sleep(2000);
		
		// with the help of value of value attribute by inspecting
		dropdown.selectByValue("option3");
		Thread.sleep(2000);  
		
		
		
		// Use getOptions() to retrieve all the available options
        List<WebElement>retiveAllOptions= dropdown.getOptions();

		// Loop through the options and print their text
		for(int i=0;i<retiveAllOptions.size();i++) {
			System.out.println(retiveAllOptions.get(i).getText());
		}


	}

}
