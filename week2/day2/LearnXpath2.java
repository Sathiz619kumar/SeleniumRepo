package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath2 {

	public static void main(String[] args) {
		
		// partial attribute/text based xpath
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h2 [contains(text(),'Bluetooth Calling')]")).click(); // partial text based xpath
		driver.findElement(By.xpath("//h2[contains(@class,'a-color-base')]"));// partial attribute based xpath
	}

}
