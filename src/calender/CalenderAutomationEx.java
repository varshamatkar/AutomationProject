package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderAutomationEx {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		
		WebElement calender=driver.findElement(By.xpath(""));
		calender.click();
		
		List<WebElement>date=driver.findElements(By.xpath(""));
		for(int i=0;i<=date.size();i++) {
			if(date.get(i).getText().equalsIgnoreCase("15")) {
				Thread.sleep(1000);
				date.get(i).click();	
				
			}
		}

	}

}
