/*
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLcertificateTest {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		
		WebDriver driver;
		driver = new ChromeDriver(option);
		driver.get("https://untrusted-root.badssl.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println (driver.getCurrentUrl());
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\Users\\ADMIN\\Desktop\\Selenium\\test.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		driver.quit();
		
	}

}
*/