package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnXpath {

	public static void main(String[] args) {
		
		//attribute based xpath
		/*
		 * ChromeDriver driver=new ChromeDriver(); driver.get("https://www.nykaa.com/");
		 * driver.manage().window().maximize();
		 * driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']")).
		 * sendKeys("shorts");
		 * driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']")).
		 * sendKeys(Keys.ENTER);
		 */
		
		//text based xpath
		/*
		 * ChromeDriver driver=new ChromeDriver();
		 * driver.get("https://www.swiggy.com/"); driver.manage().window().maximize();
		 * driver.findElement(By.xpath("//span [text()='FIND FOOD']")).click();
		 */
		
		
		
		/*
		 * ChromeDriver driver=new ChromeDriver();
		 * driver.get("https://leafground.com/select.xhtml");
		 * driver.manage().window().maximize(); driver.findElement(By.
		 * xpath("(//span[contains(@class,'ui-icon ui-icon')])[12]")).click();
		 * driver.findElement(By.xpath("(//li [text()='India'])")).click(); String title
		 * = driver.getTitle(); String currentUrl = driver.getCurrentUrl();
		 * System.out.println(title);
		 * 
		 * System.out.println(currentUrl);
		 */
		 
		 
		
	}

}
