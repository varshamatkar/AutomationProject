package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement calender=driver.findElement(By.xpath("//button[@type='button']"));
		calender.click();
		
		List<WebElement>date=driver.findElements(By.xpath("//a[@class='ui-state-default']"));
		for(int i=0;i<=date.size();i++) {
			if(date.get(i).getText().equalsIgnoreCase("15")) {
				Thread.sleep(1000);
				date.get(i).click();	
				
			}
		}
		
		
		
	}

}
