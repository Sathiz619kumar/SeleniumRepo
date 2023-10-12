package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnFrame {

	public static void main(String[] args) {

		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		String textInAlertBox = driver.switchTo().alert().getText();
		System.out.println(textInAlertBox);
		driver.switchTo().alert().accept();
		String displayed = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(displayed);
		if(displayed.equals("You pressed OK!")) {
			System.out.println("Confirmation message displayed as expected");
		}
		
		
	}

}
