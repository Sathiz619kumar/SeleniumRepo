package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandleLeafGround {
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//Click and Confirm new Window Opens
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		
		//window handle & get the number of opened tabs
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowhandles1 = new ArrayList<String>(windowHandles);
		System.out.println("Opened windows are "+windowhandles1.size());
		
		//switches to newly opened window
		driver.switchTo().window(windowhandles1.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(3000);

		
		//switch back to primary screen & click on button "Open multiple"
		driver.switchTo().window(windowhandles1.get(0));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> windowhandles3 = new ArrayList<String>(windowHandles2);
		System.out.println("Opened windows are "+windowhandles3.size());
		
		
		//close the window except for primary window
		Thread.sleep(3000);	
		driver.switchTo().window(windowhandles3.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(windowhandles3.get(2));
		System.out.println(driver.getTitle());	
		driver.close();
		driver.switchTo().window(windowhandles3.get(3));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(windowhandles3.get(0));
		System.out.println(driver.getTitle());
		
		
		//Wait for new tabs to open
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Set<String> windowHandles4 = driver.getWindowHandles();
		List<String> windowhandles5 = new ArrayList<String>(windowHandles4);
		System.out.println("Opened windows are "+windowhandles5.size());
		driver.switchTo().window(windowhandles5.get(1));
		System.out.println(driver.getTitle());
		driver.close();driver.switchTo().window(windowhandles5.get(2));
		System.out.println(driver.getTitle());
		driver.close();		
		driver.switchTo().window(windowhandles5.get(0));
		System.out.println(driver.getTitle());
		
		Set<String> windowHandles6 = driver.getWindowHandles();
		List<String> windowhandles7 = new ArrayList<String>(windowHandles6);
		System.out.println("Opened windows are "+windowhandles7.size());
		driver.switchTo().window(windowhandles5.get(0));
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
	}
	

}
