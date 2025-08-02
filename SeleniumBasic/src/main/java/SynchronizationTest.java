import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationTest {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		// click on forget password
		
		driver.findElement(By.linkText("Forgot your password?")).click();
	//	Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".reset-pwd-btn"))); 
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		String resetPwtext = driver.findElement(By.cssSelector(".infoMsg")).getText();
		System.out.println(resetPwtext);
		

	}

}
