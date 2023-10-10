package exceptionInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		//Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a sample web page with a dropdown
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Find the dropdown element
        WebElement dropdown = driver.findElement(By.id("myDropdown"));

        // Try to select an option from the dropdown
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option"); // Attempt to select an option


	}

}
