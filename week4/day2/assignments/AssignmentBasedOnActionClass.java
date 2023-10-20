package week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AssignmentBasedOnActionClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		//dragMeAround
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://jqueryui.com/draggable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement findElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(findElement);		
		WebElement findElement1 = driver.findElement(By.id("draggable"));
		Actions build = new Actions(driver);
		Thread.sleep(2000);
		build.dragAndDropBy(findElement1,300,100).perform();
		
		//droppable
		driver.get("https://jqueryui.com/droppable");
		WebElement findElement4 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(findElement4);
		WebElement findElement3 = driver.findElement(By.id("draggable"));
		WebElement findElement2 = driver.findElement(By.id("droppable"));
		build.dragAndDrop(findElement3, findElement2).perform();
		
		//click, hold & release
		driver.get("https://jqueryui.com/resizable");
		WebElement findElement5 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(findElement5);
		WebElement findElement7 = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		build.clickAndHold(findElement7).moveByOffset(100, 50).release().perform();
		
		//selectable
		driver.get("https://jqueryui.com/selectable");
		WebElement findElement8 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(findElement8);
		WebElement findElement9 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[1]"));
		WebElement findElement10 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[3]"));
		build.click(findElement9).perform();
		build.click(findElement10).perform();
		

	}

}
