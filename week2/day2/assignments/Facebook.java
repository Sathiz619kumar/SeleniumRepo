package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// Step 1: Download and set the path
		// Step 2: Launch the chromebrowser
		// Step 3: Load the URL https://en-gb.facebook.com/
		// Step 4: Maximise the window
		// Step 5: Add implicit wait
		// Step 6: Click on Create New Account button
		// Step 7: Enter the first name
		// Step 8: Enter the last name
		// Step 9: Enter the mobile number
		// Step 10: Enterthe password
		// Step 11: Handle all the three drop downs
		// Step 12: Select the radio button "Female"

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("xxx");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("yyy");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("xxxyyy@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("xxxyyy123@@@");
		WebElement birthDay = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select birthday1 = new Select(birthDay);
		birthday1.selectByIndex(17);
		WebElement birthMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select birthMonth1 = new Select(birthMonth);
		birthMonth1.selectByValue("1");
		WebElement birthYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select birthYear1 = new Select(birthYear);
		birthYear1.selectByVisibleText("1988");
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();

	}

}
