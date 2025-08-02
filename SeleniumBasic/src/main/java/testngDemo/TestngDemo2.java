package testngDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngDemo2 {
	
	@Test
	public void demo3() {
		
		System.out.println("tetsng demo3");
	}

	@AfterTest
	public void test() {
		System.out.println("After test");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
}
