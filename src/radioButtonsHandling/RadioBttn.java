package radioButtonsHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBttn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://artoftesting.com/samplesiteforselenium");
		Thread.sleep(2000);
		
		WebElement bttn1=d.findElement(By.xpath("//*[@id=\"male\"]"));
		
		
		if(!bttn1.isSelected()) {
			bttn1.click();
		
		}
		Thread.sleep(2000);
		WebElement bttn2=d.findElement(By.xpath("//*[@id=\"female\"]"));
		
		if(!bttn2.isSelected()) {
			bttn2.click();
	}
		
		
		Thread.sleep(2000);
		
  //clicking one by one on radio buttons
		
		List<WebElement>bttns=d.findElements(By.xpath("//input[@type='radio']"));

		for(int i=0;i<bttns.size();i++) {

		bttns.get(i).click();
	
		Thread.sleep(2000);
		
		for(WebElement radio:bttns) {
			radio.click();
			Thread.sleep(2000);
			
		}
}

}
}