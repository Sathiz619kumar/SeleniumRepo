package week4.day2.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		
			
			
			
			
	
		
		
		//1.Launch the browser
		//2.Load the url as " https://login.salesforce.com/ "
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		//3.Enter the username 
		//4. Enter the password 
		//5.click on the login button
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//6.click on the learn more option in the Mobile publisher
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		//7.Switch to the next window using Windowhandles.
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandles1 = new ArrayList<String>(windowHandles);
		System.out.println("total active windows are "+windowHandles1);
		driver.switchTo().window(windowHandles1.get(1));
		
		//8.click on the confirm button in the redirecting page
		//9.Get the title
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		

		//10.Get back to the parent window
		//11.close the browser
		driver.switchTo().window(windowHandles1.get(0));
		System.out.println(driver.getTitle());
		//driver.close();
		
		
		}

}
