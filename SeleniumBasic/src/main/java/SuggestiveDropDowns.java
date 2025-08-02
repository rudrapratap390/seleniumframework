import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestiveDropDowns {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		String searchVal = "India";
		driver.findElement(By.id("autosuggest")).sendKeys(searchVal);
		Thread.sleep(1000);
		driver.findElement(By.linkText(searchVal)).click();
		

	}
	
}
