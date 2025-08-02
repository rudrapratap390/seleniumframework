import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownsTest1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
		WebElement dropdownWebElement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select select = new Select(dropdownWebElement);
		//select.selectByIndex(4);
		//select.selectByValue("AED");
		//select.selectByVisibleText("AED");
		//select.selectByContainsVisibleText("INR");
		List<WebElement> weList = select.getOptions();
		for(WebElement we:weList) {
			
			System.out.println(we.getText());
			
		}
		select.selectByIndex(3);
		String selectedValue = select.getFirstSelectedOption().getText();
		System.out.println("Selected value " + selectedValue);
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		int i = 1;
		while(i<5) {
			
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
			
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		

	}

}
