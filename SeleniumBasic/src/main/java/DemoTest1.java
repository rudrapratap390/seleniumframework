import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class DemoTest1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		//driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		// click on forget password
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		String resetPwtext = driver.findElement(By.cssSelector(".infoMsg")).getText();
		String[] str1 =resetPwtext.split("'");
		String ressetPw = str1[1];
		
		//click on goto login page
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		
		driver.findElement(By.id("inputUsername")).sendKeys("Rudra");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(ressetPw);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'Sign In')]")).click();
		Thread.sleep(1000);
		String text = driver.findElement(By.tagName("p")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "You are successfully logged in.");
		String userName = driver.findElement(By.cssSelector("div.login-container h2")).getText();
		Assert.assertEquals(userName, "Hello Rudra,");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		//driver.close();
		

	}

}
