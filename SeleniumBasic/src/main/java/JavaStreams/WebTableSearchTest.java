package JavaStreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSearchTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		Thread.sleep(2000);		
		
		List<WebElement> vegList = driver.findElements(By.xpath("//tr/td[1]"));
		
	List<WebElement> matchVegList =	vegList.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
	matchVegList.forEach(s->System.out.println(s.getText()));
	vegList.forEach(s->System.out.println(s.getText()));
		Assert.assertTrue(vegList.equals(matchVegList));
		
		

	}

}
