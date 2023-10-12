package week4.marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hotels {

	public static void main(String[] args) throws InterruptedException, IOException {

		
		/*
		 * TC_002_Hotels: ============== 1. Load the url as https://www.tripozo.com/ 
		 *
		 *  
		 * 
		 *  
		 * 
		 * 
		 *
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

				// 1. Load the url as https://www.tripozo.com/
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--disable-notifications");
				ChromeDriver driver = new ChromeDriver(option);
				driver.get("https://www.tripozo.com/");
				driver.manage().window().maximize();
				
				// 2.Click on the 'Hotels' tab. 
				driver.findElement(By.xpath("(//div[@class='ant-tabs-tab-btn'])[2]")).click();
				
				//3. Enter 'Goa' from the select city and choose 'Goa, India'.	
				driver.findElement(By.xpath("(//input[@id='CityData'])[1]")).sendKeys("GOA");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
				driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[3]")).click();
			
				//4. Choose 'Tommorow date' from the Check-In and 'Day after tommorow date' from the Check-Out.
				driver.findElement(By.xpath("//div[@class='ant-picker-body']/table/tbody/tr[2]/td[4]")).click();
				driver.findElement(By.xpath("//div[@class='ant-picker-body']/table/tbody/tr[2]/td[5]")).click();
				
				//5. Click on the 'Search button'. 
				driver.findElement(By.xpath("//span[contains(text(),' Search')]")).click();
				
				//6. Choose 'Air Conditioning' , 'Laundry Facility' , 'parking' , 'Restaurant' from the 'Amenities' filter. 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElement(By.xpath("//span[text()='Air Conditioning']")).click();
				driver.findElement(By.xpath("//span[text()='Laundry Facility']")).click();
Thread.sleep(10000);
				driver.findElement(By.xpath("//span[text()='Parking']")).click();
				driver.findElement(By.xpath("//span[text()='Restaurant']")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

				
				// 7. Choose '5 Star rating' from the 'Star Rating' filter.
				driver.findElement(By.xpath("(//ul[@class='ant-rate ant-rate-disabled starRating'])[5]")).click();
				
				//8. Click 'Choose' button from the first resulting Hotels. 
				Thread.sleep(10000);

				driver.findElement(By.xpath("(//span[text()='Choose'])[2]")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//9. Verify the check-In date from the 'Searched Criteria'. 
				//10. Click on the 'View Rooms' near to the 'Searched Criteria'. 
				System.out.println(driver.findElement(By.xpath("(//p[@class='pl-2'])[1]")).getText());
				driver.findElement(By.xpath("//button[text()='View Rooms']")).click();
				
				//11. Click on the first resulting 'Choose Room' button. 
				driver.findElement(By.xpath("(//span[text()='Choose Room '])[1]")).click();
				
				//12. Click on the 'Room Amenities & Details' and take a snap of the pop-up window and close.
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElement(By.xpath("//span[text()='Amenities & Details']")).click();
				WebElement screenshotElement = driver.findElement(By.xpath("//div[@class='ant-modal-body']"));
				Thread.sleep(5000);
				File screenshotscrc = screenshotElement.getScreenshotAs(OutputType.FILE);
				File screenshotdesc = new File("./snap/image2.jpeg");
				FileUtils.copyFile(screenshotscrc, screenshotdesc); 
				//drive.close();
	}

}
