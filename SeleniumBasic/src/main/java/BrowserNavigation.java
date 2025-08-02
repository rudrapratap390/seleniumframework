import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/");
		//driver.manage().window().maximize();
		driver.manage().window().fullscreen();
	//	driver.navigate().refresh();
		driver.findElement(By.linkText("JOIN NOW")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		
	}

}
