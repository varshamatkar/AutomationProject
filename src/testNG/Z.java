package testNG;

import org.testng.annotations.Test;

public class Z {
	
	@Test(priority = 'B')
	public void verifyLogin() {
		System.out.println("Code to verify login functionality");
	}
	@Test(priority = 'A')
	public void lunchURL() {
		System.out.println("Code to lunch URL");
	}
   @Test(priority = 'C')
	public void closeBrowser(){
		System.out.println("Browser is close");
	}
   
   
}
