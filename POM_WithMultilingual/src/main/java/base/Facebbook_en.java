package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebbook_en {
	
	
	public ChromeDriver driver;
	@BeforeMethod
	public void preCondition() {
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test
	public void testFb() {
		
		System.out.println("Create new Account");
		
	}

	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}	
	
}
