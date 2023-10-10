package frameAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		
		WebElement item4=driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[4]"));
     	item4.click();
	}

}
