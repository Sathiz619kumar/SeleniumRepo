package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContactLeafTaps {

	public static void main(String[] args) throws InterruptedException {	
		 
		
		 //1. Launch URL "http://leaftaps.com/opentaps/control/login"
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		 //2. Enter UserName and Password Using Id Locator 
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); 
		driver.findElement(By.id("password")).sendKeys("crmsfa"); 

		 //3. Click on Login Button using Class Locator
		 //4. Click on CRM/SFA Link
		driver.findElement(By.className("decorativeSubmit")).click(); 
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//5. Click on contacts Button
		//6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		
		 //7. Click on Widget of From Contact
		 //8. Click on First Resulting Contact
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandles1 = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowHandles1.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().window(windowHandles1.get(0));
		
		 //9. Click on Widget of To Contact
		 //10. Click on Second Resulting Contact
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> windowHandles3 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(windowHandles3.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().window(windowHandles3.get(0));

		//11. Click on Merge button using Xpath Locator
		 //12. Accept the Alert
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();

		//13. Verify the title of the page
		System.out.println(driver.getTitle());
		

		
		
		
		
		
	}

}
