import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocateElement {
	static WebDriver driver;
	
	@FindBy(xpath="//input[@id='name']") WebElement nameWe;
	
	public LocateElement(WebDriver driver){
		this.driver = driver;		
		PageFactory.initElements(driver, this);
	}
	
	public  void enterUserName(String name) {
		nameWe.sendKeys(name);
	}
	

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Rudra");
		
		LocateElement obj = new LocateElement(driver);
		obj.enterUserName("Rudra");
	

	
	

	}

}
