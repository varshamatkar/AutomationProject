package alertAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement alertWithOk= driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
       alertWithOk.click();
       Thread.sleep(2000);
       
       String alertMassg= driver.switchTo().alert().getText();
       System.out.println(alertMassg);
       
       Thread.sleep(2000);
       //driver.switchTo().alert().accept();
       
       driver.switchTo().alert().dismiss();
	}

}
