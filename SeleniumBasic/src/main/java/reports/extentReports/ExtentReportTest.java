/*
package reports.extentReports;

import org.apache.commons.io.filefilter.SymbolicLinkFileFilterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportTest {
	
	WebDriver driver;
	ExtentReports report;
	//ExtentSparkReporter , ExtentReports
	
	@BeforeClass
	public void initialization() {
		
		driver = new ChromeDriver();
		String file = System.getProperty("user.dir") + "\\reports\\index.html";
		
		System.out.println(file);		
		ExtentSparkReporter reporter = new ExtentSparkReporter(file);
		reporter.config().setReportName("Extent Report demo Test");
		reporter.config().setDocumentTitle("Extent Report demo Test");
		
		report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Tester", "rudra.chhanda");
		
	}
	

	@Test
	public void demoTest1() {
		report.createTest("demoTest1");
		//driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		
		//report.flush();
	}
	
	@Test
	public void demoTest2() {
		ExtentTest test = report.createTest("demoTest2");
		//driver = new ChromeDriver();
		driver.get("https://google.com/");
		test.fail("value mismatch");
		
		//report.flush();
	}
	
	@AfterClass(enabled=true)
	public void teardownDriver() {
		report.flush();
		driver.quit();
		
	}

}
*/