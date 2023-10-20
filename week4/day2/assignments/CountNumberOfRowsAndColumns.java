package week4.day2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CountNumberOfRowsAndColumns {

	public static void main(String[] args) {

			
		
			
		//1. Launch the URL https://html.com/tags/table/
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//2. Get the count of number of rows
		WebElement maintable = driver.findElement(By.xpath("//div[@class='render']/table/tbody"));
		List<WebElement> rowCount = maintable.findElements(By.tagName("tr"));
		System.out.println(rowCount.size());
		
		//3. Get the count of number of columns
		List<WebElement> columnCount = rowCount.get(1).findElements(By.tagName("td"));
		System.out.println(columnCount.size());
		for(int i=1;i<=rowCount.size();i++) {
			WebElement rowElement = driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr["+i+"]"));
			System.out.println(rowElement.getText());
		}
		
		
	}
	
	

}
