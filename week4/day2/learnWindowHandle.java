package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class learnWindowHandle {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Set<String> windowHandle0 = driver.getWindowHandles();
		System.out.println(windowHandle0.size());
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set<String> windowHandle1 = driver.getWindowHandles();
		System.out.println(windowHandle1.size());
		System.out.println(driver.getTitle());
		List<String> windowHandle2 = new ArrayList<String>(windowHandle1);
		driver.switchTo().window(windowHandle2.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(windowHandle2.get(0));
		System.out.println(driver.getTitle());
		//driver.close();
		

	}

}
