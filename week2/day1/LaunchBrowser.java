package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		//System.setProperty("webDriver.chrome.driver","D:\\learning\\Test leaf\\Sep-23\\drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().wait(1000);
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Forgotten password?")).click();
		String currentUrl = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(currentUrl);
		System.out.println(title);
		
		//driver.close();
		
		
	}

}
