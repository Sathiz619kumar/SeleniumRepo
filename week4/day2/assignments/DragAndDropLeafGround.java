package week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropLeafGround {

	public static void main(String[] args) {
		
			
			ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement findElement = driver.findElement(By.xpath("//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all ui-draggable ui-draggable-handle']"));
		Actions build = new Actions(driver);
		build.dragAndDropBy(findElement, 400, 100).perform();
		WebElement target1 = driver.findElement(By.xpath("//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all ui-widget-content ui-draggable ui-draggable-handle']"));
		WebElement source1 = driver.findElement(By.xpath("//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all ui-widget-content ui-droppable']"));
	    build.dragAndDrop(target1, source1 ).perform();
	
	
	}

}
