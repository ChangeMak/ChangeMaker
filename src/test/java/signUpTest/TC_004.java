package signUpTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_004 {
	WebDriver driver;
	

	@BeforeMethod 
	public void set_up() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		
		
	}
	
	

}
