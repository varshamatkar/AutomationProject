package calender;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Passangers {

	public static void main(String[] args) throws InterruptedException {
   WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement passangers=driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		passangers.click();
		
		
		WebElement adultPlus=driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));

		for(int i=0;i<8;i++) {
			Thread.sleep(1000);
			adultPlus.click();
		}
		
		WebElement adultMinus=driver.findElement(By.xpath("//span[@id='hrefDecAdt']"));
	 for(int i=0;i<6;i++) {
		Thread.sleep(1000);
			adultMinus.click();
	}
	 WebElement childPlus=driver.findElement(By.xpath("//span[@id='hrefIncChd']"));

		for(int i=0;i<4;i++) {
			Thread.sleep(1000);
			childPlus.click();
		}
		
		WebElement childMinus=driver.findElement(By.xpath("//span[@id='hrefDecChd']"));

		for(int i=0;i<1;i++) {
			Thread.sleep(1000);
			childMinus.click();
		}
		WebElement infantPlus=driver.findElement(By.xpath("//span[@id='hrefIncInf']"));

		for(int i=0;i<4;i++) {
			Thread.sleep(1000);
			infantPlus.click();
		}
		
		WebElement infantMinus=driver.findElement(By.xpath("//span[@id='hrefDecInf']"));

		for(int i=0;i<2;i++) {
			Thread.sleep(1000);
			infantMinus.click();
		}
		
		WebElement done=driver.findElement(By.xpath("//input[@id='btnclosepaxoption']"));
		Thread.sleep(2000);
		done.click();
		
		Thread.sleep(2000);
		
		WebElement currency=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select select= new Select(currency);
		select.selectByIndex(0);

		Thread.sleep(1000);
		
		select.selectByIndex(1);

		Thread.sleep(1000);
		
		select.selectByIndex(2);

		Thread.sleep(1000);
		
		driver.close();
		
	}
	

	}


