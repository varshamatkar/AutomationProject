package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsEx2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		//driver.manage().window().maximize();
		Thread.sleep(5000);
		
	 WebElement search=driver.findElement(By.name("search_query"));
	 Thread.sleep(5000);
	 search.click();
	 Thread.sleep(5000);
  
	 search.sendKeys("Kevdyach pan tu making btm|Makers cine|Ajay Atul|Ajay gogavle|Arya ambekar");
     Thread.sleep(2000);
     search.submit();
     
    // Thread.sleep(5000); 
	 WebElement firstSong = driver.findElement(By.xpath("(//a[@id='video-title'])"));
	 Thread.sleep(5000);
     firstSong.click();
     Thread.sleep(5000);
	 System.out.println("video is started");
	//*[@id="video-title"]/yt-formatted-string
		
		
	}

}
