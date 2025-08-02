package JavaStreams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationTest {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
	
		//driver.findElements(By.xpath("//tr/td[1]"));
		
		
		List<String> price = new ArrayList<>();
		
		do {
			
			List<WebElement> vegList  = driver.findElements(By.xpath("//tr/td[1]"));	
			price = vegList.stream().filter(s->s.getText().contains("Pineapple")).map(s->getPrice(s)).collect(Collectors.toList());
			price.forEach(a->System.out.println(a));
			if(price.size()<1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
				Thread.sleep(2000);
			}
			
		}while(price.size()<1);
		
				
		
		
	}
	
	private static String getPrice(WebElement s) {
		return s.findElement(By.xpath("following-sibling::td[1]")).getText();
	}

}
