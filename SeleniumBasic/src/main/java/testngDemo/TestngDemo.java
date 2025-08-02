package testngDemo;

import java.sql.Driver;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngDemo {
	WebDriver driver;
	
	
	

	//Hashmap implementation of Data provider
	@Test(groups="smoke",dataProvider="testDataHash",enabled=false)
	public void demo1(HashMap<Object,Object> inputData) {
		
	//	System.out.println("tetsng demo1");
		
		System.out.println(inputData.get("userName"));
		System.out.println(inputData.get("password"));
		
	}
	@Parameters({"userName","password"})
	@Test(groups="Demo",enabled=false)
	public void demo2(@Optional("dummyuser@xy.com")String userName,@Optional("test@123") String password) {
		
		System.out.println("tetsng demo2");
		System.out.println(userName);
		System.out.println(password);
		
	}
	
	
	@Test(dataProvider="testData",enabled=false)
	public void demo3(String value1, String value2) {
		
		System.out.println(value1);
		System.out.println(value2);
		//System.out.println(password);
		
	}
	
	@Test(retryAnalyzer=Retry.class,enabled=false)
	public void retryTestDemo() {
		
		Assert.assertEquals(2, 3);
		System.out.println("retryTestDemo executed");
	}
	
	@Test
	public void launchURL() {
		
	
		
		driver.get("https://rahulshettyacademy.com/");
		
		System.out.println(driver.getTitle());
	}
	
	@DataProvider(name="testData",parallel=true)
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0]="userName1";
		data[0][1]="password1";
		
		data[1][0]="userName2";
		data[1][1]="password2";
		
		data[2][0]="userName3";
		data[2][1]="password3";
		return data;
	}
	
	@DataProvider(name="testDataHash",parallel=true)
	public Object[][] getDataHashMap() {
		
		HashMap<Object,Object> map = new HashMap<>();
		
		map.put("userName", "user1@gmail.vom");
		map.put("password", "pass1");
		
		HashMap<Object,Object> map1 = new HashMap<>();
		map1.put("userName", "user2@gmail.vom");
		map1.put("password", "pass2");
		
		return new Object[][] {{map},{map1}};
	}


	@BeforeTest
	public void test() {
		System.out.println("Before Test");
		
		String browserName = System.getProperty("browserName");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		driver = new ChromeDriver(options);
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
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
