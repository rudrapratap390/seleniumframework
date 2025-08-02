package JavaStreams;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTesting2 {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		List<WebElement> vegList = driver.findElements(By.xpath("//tr/td[1]"));
	//	List<WebElement> prticeList =driver.findElements(By.xpath("//tr/td[2]"));
		//vegList.stream().map(s->s.getText()).filter(s->s.equalsIgnoreCase("Rice")).forEach(s->System.out.println(s));
		
		List<String> price = vegList.stream().filter(s->s.getText().contains("Tomato")).map(s->getPrice(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));
		System.out.println(price);
		//vegList.stream().map(s->s.getText()).filter("Apple").forEach(s->System.out.println(s));)
		
		

	}

	private static String getPrice(WebElement s) {
		return s.findElement(By.xpath("following-sibling::td[1]")).getText();
	}

}
