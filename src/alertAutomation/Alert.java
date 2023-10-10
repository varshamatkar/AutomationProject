package alertAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\sel new files\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	WebElement alert=driver.findElement(By.xpath("//input[@id='alertbtn']"));
		
		alert.click();
		
		Thread.sleep(1000);
		
	//driver.switchTo().alert().accept();
		
		//System.out.println(driver.switchTo().alert().getText());
		
		String alertMessage=driver.switchTo().alert().getText();
		
		System.out.println(alertMessage);
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().dismiss();
		
		

	}

}