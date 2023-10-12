package week4.marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import week4.day2.TakeScreenshot;

public class Flights {

	public static void main(String[] args) throws IOException, InterruptedException {

		// TC_001_Flights: ===============
		
		// 1. Load the url as https://www.tripozo.com/
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.tripozo.com/");
		driver.manage().window().maximize();
		
		// 2. Click on the 'Flights' tab.
		driver.findElement(By.xpath("//div[@class='ant-tabs-tab ant-tabs-tab-active']")).click();
		
		// 3. Enter 'MAA' from the Select Source input field, and choose the first
		// resulting option.
		driver.findElement(By.xpath("(//input[@id='search-form_origin'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='search-form_origin'])[1]")).sendKeys("MAA");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//div[@class='f-vcenter flexRow']/span[2])[1]")).click();
		
		// 4. Enter 'GOX' from the Select Destination input field, and choose the first
		// resulting option.
		driver.findElement(By.xpath("(//input[@id='search-form_destination'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='search-form_destination'])[1]")).sendKeys("GOX");
		driver.findElement(
				By.xpath("//div[@class='ant-select-item ant-select-item-option ant-select-item-option-active']"))
				.click();

		// Select today's or tomorrow's date
		/*
		 * LocalDateTime today = LocalDateTime.now(); String tomorrow =
		 * (today.plusDays(1)).format(DateTimeFormatter.ISO_DATE);
		 * System.out.println(tomorrow);
		 */

		// 5. Choose 'tommorow date' from the journey.
		driver.findElement(By.xpath("//input[@placeholder='Journey Date']")).click();
		driver.findElement(By.xpath("//div[@class='tblCont']/table/tbody/tr[4]/td[5]")).click();
		
		// 6. Click on the 'Search button'
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		
		// 7. Choose 'Refundable' option form the 'Fare type' filter.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//span[text()='Refundable'])[1]")).click();
		WebElement refundable = driver.findElement(By.xpath("(//span[@class='ant-checkbox-inner'])[3]"));
		System.out.println(refundable.getText());
		
		// 8. Choose '6AM - 12PM' from the 'Departure Time' filter.
		driver.findElement(By.xpath("(//span[text()='6 AM - 12PM'])[1]")).click();
		
		// 9. Choose 'First resulting airlines' from the 'Airlines' filter.
		String firstFlight = driver.findElement(By.xpath("(//div[@class='airline-name'])[1]")).getText();
		System.out.println("First flight in the serach result is " + firstFlight);
		List<WebElement> flightFilter2 = driver
				.findElements(By.xpath("//label[@class='ant-checkbox-wrapper fs12 single-line-checkbox']"));
		int size1 = flightFilter2.size();
		System.out.println(size1);
		for (int i = 0; i < size1; i++) {
			if (firstFlight.equalsIgnoreCase(flightFilter2.get(i).getText())) {

				System.out.println("Flight to be clicked from Airlines checkbox is " + flightFilter2.get(i).getText());
				System.out.println("Both flights are same");
				flightFilter2.get(i).click();
			} else {
				System.out.println("Both flights are different- " + flightFilter2.get(i).getText());
			}

		}
		
		// 10. Verify all the displaying airlines are Selected airlines. (Eg: In the airlines filter 'Air India' got selected , so it should display only Air India Airlines)
		List<WebElement> verifyFlights = driver.findElements(By.xpath("//div[@class='airline-name']"));
		int size2 = verifyFlights.size();
		System.out.println(size2);
		for (int j = 0; j < size2; j++) {
			if (firstFlight.equalsIgnoreCase(verifyFlights.get(j).getText())) {
				System.out.println("Flight no " + j + ": is " + verifyFlights.get(j).getText());
			}

		}

		// 11. Click 'Choose' button from the first resulting airline.
		driver.findElement(By.xpath("(//button[@class='choose-button tpz-btn nowrap'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//span[text()='Choose'])[1]")).click();
		
		// 12. Verify the selected airline is 'Refundable'.
		String text1 = driver.findElement(By.xpath("(//span[@class='ant-tag ant-tag-green'])[2]")).getText();
		if (text1.equalsIgnoreCase("Refundable")) {
			System.out.println("yes, this flight is refundable");
		} else {
			System.out.println("This is not refundable");
		}

		// 13. Click on the 'Flights Info' and take snap of the 'Flight Details' pop-up window and close the pop-up window.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'Flight Info')])/parent::div")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement screenshotElement = driver.findElement(By.xpath("//div[@class='ant-modal-body']"));
		Thread.sleep(2000);
		File fromFlightsrc = screenshotElement.getScreenshotAs(OutputType.FILE);
		File fromFlightdest = new File("./snap/image.jpeg");
		FileUtils.copyFile(fromFlightsrc, fromFlightdest);
		driver.findElement(By.xpath("//span[@class='ant-modal-close-x']")).click();
		
		// 14. Click on the 'Fare Info' and take snap of the pop-up window and close.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[text()='Fare Info']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
		WebElement screenshotElement1 = driver.findElement(By.xpath("//div[@class='fareRule-container']"));
		File cashInfoSrc = screenshotElement1.getScreenshotAs(OutputType.FILE);		
		File cashInfoDesc = new File("./snap/image1.jpeg");
		FileUtils.copyFile(cashInfoSrc, cashInfoDesc);
		// driver.close();

	}

}
