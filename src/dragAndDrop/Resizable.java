package dragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.switchTo().frame(0);
		Thread.sleep(2000);
		Actions action= new Actions(driver);
		
		WebElement resize= driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Thread.sleep(2000);

		/*action.clickAndHold(resize).moveByOffset(300,200).release().build().perform();
		Thread.sleep(5000);*/
		
		
		/*action.clickAndHold(resize).build().perform();
		action.moveByOffset(300, 200).build().perform();
		action.release().build().perform();
		Thread.sleep(2000);*/
		
		//by using drag and drop method
		action.dragAndDropBy(resize, 300, 200).build().perform();
		action.release().build().perform();
		
		Thread.sleep(5000);
		
		
		driver.close();
		
		

	}

}
