package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAdvancedXpath {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * ChromeDriver driver = new ChromeDriver();
		 * driver.get("http://leaftaps.com/opentaps/control/login"); // open URL
		 * driver.manage().window().maximize();
		 * driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); // enter
		 * user name driver.findElement(By.id("password")).sendKeys("crmsfa"); // enter
		 * password driver.findElement(By.className("decorativeSubmit")).click(); //
		 * click on login button driver.findElement(By.linkText("CRM/SFA")).click(); //
		 * click on the link driver.findElement(By.linkText("Leads")).click();
		 * driver.findElement(By.linkText("Find Leads")).click(); Thread.sleep(100);
		 * driver.findElement(By.
		 * xpath("((//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a)[1]")).
		 * click(); //parent to child xpath
		 */
		
		
		ChromeDriver driver =new ChromeDriver(); driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.className("desktop-main"));
		Actions hover = new Actions(driver);
		hover.moveToElement(findElement);
		
		
		
		
		
		
	}

}
