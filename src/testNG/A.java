package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class A {
	
	public void m() {
		System.out.println("Hello");
	}
	
	@BeforeClass
	public void m2() {
		System.out.println(" This code will execute Before class");
	}
@AfterClass
public void m3() {
	System.out.println(" This code will execute After  class");
}
	

}
