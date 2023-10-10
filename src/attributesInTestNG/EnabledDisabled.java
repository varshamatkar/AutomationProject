package attributesInTestNG;

import org.testng.annotations.Test;

public class EnabledDisabled {
	@Test(enabled = true)
	public void verifyLogin() {
		System.out.println("Code to verify login functionality");
	}
	@Test(enabled = false)
	public void lunchURL() {
		System.out.println("Code to lunch URL");
	}
   @Test(enabled = true)
	public void closeBrowser(){
		System.out.println("Browser is close");
	}
   
}
