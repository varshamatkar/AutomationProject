package slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ColorPicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.switchTo().frame(0);
		Thread.sleep(2000);
		Actions action= new Actions(driver);
		
		WebElement red= driver.findElement(By.xpath("(//span[@tabindex='0'][1])"));
		action.clickAndHold(red).moveByOffset(-250, 0).release().build().perform();
		Thread.sleep(2000);
		//div[@id='red']/span
		
		action.clickAndHold(red).moveByOffset(200, 0).release().build().perform();
		Thread.sleep(2000);
		
		WebElement green=driver.findElement(By.xpath("//div[@id='green']/span"));
		action.dragAndDropBy(green, 200, 0).release().build().perform();
		Thread.sleep(2000);
		action.dragAndDropBy(green, -200, 0).release().build().perform();
		Thread.sleep(2000);
		
		WebElement blue=driver.findElement(By.xpath("//div[@id='blue']/span"));
		action.dragAndDropBy(blue, 200, 0).release().build().perform();
		Thread.sleep(2000);
		action.dragAndDropBy(blue, -150, 0).release().build().perform();
		Thread.sleep(2000);
		
		
		
		Thread.sleep(2000);
		
		
		driver.close();
		

	}

}
