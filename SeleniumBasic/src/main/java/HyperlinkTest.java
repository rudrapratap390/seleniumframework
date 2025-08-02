import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlinkTest {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement footerColumn_1 = driver.findElement(By.xpath("(//*[@class='gf-t']//td)[1]/ul"));
		List<WebElement> footerColumn_1_we = footerColumn_1.findElements(By.tagName("a"));
		int linkCount = footerColumn_1_we.size();
		System.out.println(linkCount);
		
	//	Actions action = new Actions(driver);
		
		for(WebElement we:footerColumn_1_we) {
			
		//	action.moveToElement(footerColumn_1).keyUp(Keys.CONTROL).click().build().perform();
			
			we.sendKeys(Keys.CONTROL,Keys.ENTER);
			
			// we.click();
			
		}
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("current window - " + parentWindow);
		Set<String> childWindows = driver.getWindowHandles();
		
		for(String window:childWindows) {
			
			if(window != parentWindow) {
				String pageTitle = driver.switchTo().window(window).getTitle();
				System.out.println(pageTitle);
			}
			
			
		}
		
		
		
	}

}
