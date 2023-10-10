package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAndCSS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement userName=driver.findElement(By.xpath("//input[@type='email']"));
		userName.click();
		userName.sendKeys("Varsha");
		Thread.sleep(3000);
		
    WebElement pass=driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']"));
	pass.click();
	pass.sendKeys("Varsha@321");
	Thread.sleep(2000);
	
	WebElement login=driver.findElement(By.cssSelector("input[type='submit']"));
	login.click();
	//Thread.sleep(5000);
	
	//driver.close();
}

}
