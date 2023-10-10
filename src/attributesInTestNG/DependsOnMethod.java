package attributesInTestNG;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	public void verifyURL(){
		System.out.println("Verify URL");
		
	}
	@Test(dependsOnMethods ="verifyURL" )
	public void closeBrowser() {
		System.out.println("close the browser");
	}

}
