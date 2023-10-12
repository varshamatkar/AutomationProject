package hadlingCheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//click on single option
		
		//WebElement option1=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		//option1.click();
		//System.out.println(option1.isDisplayed());
		//System.out.println(option1.isEnabled());
		//System.out.println(option1.isSelected());
		
		//click on all options
	List<WebElement> checkbox=	driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(int i=0;i<checkbox.size();i++) {
		checkbox.get(i).click();
		Thread.sleep(2000);
	}
	for(WebElement k:checkbox) {
		k.clear();
	}

	}

}
