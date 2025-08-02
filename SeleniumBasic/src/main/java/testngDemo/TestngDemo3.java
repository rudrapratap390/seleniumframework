package testngDemo;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestngDemo3 {
	
	@Test
	public void demo4() {
		
		System.out.println("tetsng demo4");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}

}
