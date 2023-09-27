package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login"); //open URL
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); //enter username
		driver.findElement(By.id("password")).sendKeys("crmsfa"); //enter password
		driver.findElement(By.className("decorativeSubmit")).click(); //click on login button
		driver.findElement(By.linkText("CRM/SFA")).click(); //click on the link
		driver.findElement(By.linkText("Create Account")).click(); //click on the accounts link
		driver.findElement(By.id("accountName")).sendKeys("SeleniumTester5");
		WebElement industryDropDown = driver.findElement(By.name("industryEnumId"));
		Select industryDropDown1 = new Select(industryDropDown);
		industryDropDown1.selectByIndex(2);
		driver.findElement(By.name("description")).sendKeys("Sample");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
	}

}
