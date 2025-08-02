package JavaStreams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class WebTableTest {
	
	
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(2000);
		
		List<WebElement> price = driver.findElements(By.xpath("//*[@class='table table-bordered']//tbody/tr//td[2]"));
		
		List<String> priceValActualBeforeSort = new ArrayList<>();
		
		List<String> priceValActualAfterSort = new ArrayList<>();
		
		priceValActualBeforeSort =	price.stream().map(s->s.getText()).collect(Collectors.toList());
		
		/*
		 * for(WebElement we:price) {
		 * 
		 * priceValActualBeforeSort.add(we.getText());
		 * 
		 * }
		 */
		
		System.out.println("Before Sorting price value " + priceValActualBeforeSort);
		
		driver.findElement(By.cssSelector("[aria-label='Veg/fruit name: activate to sort column ascending']")).click();
		Thread.sleep(2000);
		
		List<WebElement> priceNew = driver.findElements(By.xpath("//*[@class='table table-bordered']//tbody/tr//td[2]"));
		
		priceValActualAfterSort = priceNew.stream().map(s->s.getText()).collect(Collectors.toList());
		
		/*
		 * for(WebElement we:priceNew) {
		 * 
		 * priceValActualAfterSort.add(we.getText());
		 * 
		 * }
		 */
		
		System.out.println("After Sorting price value " + priceValActualAfterSort);
		
		List<String> priceValExpectedAfterSort = priceValActualBeforeSort.stream().sorted().collect(Collectors.toList());
		System.out.println(priceValExpectedAfterSort);
		
		//boolean match = priceValActualAfterSort.equals(priceValExpectedAfterSort);
		
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(priceValActualAfterSort.equals(priceValExpectedAfterSort));
		//sa.assertEquals(match, true);
		
		driver.quit();
		
		
	}

}
