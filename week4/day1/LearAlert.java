package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;

public class LearAlert {
	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		Alert alert = driver.switchTo().alert();
		//WebDriver frame = driver.switchTo().frame(1)
		String alertText = alert.getText();
		alert.sendKeys("Hi How are you?");
		alert.accept();
		System.out.println(alertText);
		String text1 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(text1);
	
		
		
	}

}
