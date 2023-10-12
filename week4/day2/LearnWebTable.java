package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebTable {

	public static void main(String[] args) throws IOException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();

		// select from & to stations
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MAS");
		driver.findElement(By.xpath("//div[text()='Mgr Chennai Ctr']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("MDU");
		driver.findElement(By.xpath("//div[text()='Madurai Jn']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// check on sort checkbox
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		WebElement sortBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));

		if (sortBox.isSelected() == false) {
			System.out.println("Sort box is unchecked");
		}
		// Take Screenshot
		File fromTrainsrc = driver.getScreenshotAs(OutputType.FILE);
		File fromTraindest = new File("./snap/image.jpeg");
		FileUtils.copyFile(fromTrainsrc, fromTraindest);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// Click on get trains
		// driver.findElement(By.xpath("//input[@id='buttonFromTo']")).click();
		// get no. of rows
		WebElement mainTable = driver.findElement(By.xpath("(//div[@id='divTrainsList']/table/tbody)[1]"));
		List<WebElement> rowFindElement = mainTable.findElements(By.tagName("tr"));
		int row = rowFindElement.size();
		System.out.println("Total No. of rows " + row);
		System.out.println("-----------------------------------------------");
		// get no. of columns
		List<WebElement> columnFindElement = rowFindElement.get(1).findElements(By.tagName("td"));
		int column = columnFindElement.size();
		System.out.println("Total No. of columns " + column);
		System.out.println("-----------------------------------------------");

		// get all the rows & columns
		/*
		 * for(WebElement trainName:rowFindElement) {
		 * 
		 * System.out.println(trainName.getText()); }
		 */
		// get column 1 & all row details
		List<String> checkDuplicate = new ArrayList<String>();
		for (int i = 2; i < row; i++) {
			WebElement rowElement = driver
					.findElement(By.xpath("(//div[@id='divTrainsList']/table/tbody)[1]/tr[" + i + "]/td[2]"));
			//System.out.println(rowElement.getText());

			checkDuplicate.add(rowElement.getText());
		}
		System.out.println(checkDuplicate);
		System.out.println("-----------------------------------------------");

		Set<String> checkDuplicate1 = new LinkedHashSet<String>();
		Set<String> duplicates = new LinkedHashSet<String>();
		for (String a1 : checkDuplicate) {
			checkDuplicate1.add(a1);

			
			  if (checkDuplicate1.add(a1) == false) { 
				  duplicates.add(a1);  			  
			  }
			 

		}
		System.out.println(checkDuplicate1);
		System.out.println("-----------------------------------------------");
		System.out.println(duplicates);
		System.out.println("-----------------------------------------------");

		if (checkDuplicate.size() != checkDuplicate1.size()) {
			System.out.println("Dupliactes are found");
		}

	}

}
