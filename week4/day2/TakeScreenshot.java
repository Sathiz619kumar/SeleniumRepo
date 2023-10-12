package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		
		//select from & to stations
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MAS");
		driver.findElement(By.xpath("//div[text()='Mgr Chennai Ctr']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));		
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("MDU");
		driver.findElement(By.xpath("//div[text()='Madurai Jn']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//check on sort checkbox		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();	
		WebElement sortBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));

		if(sortBox.isSelected()==false) {
			System.out.println("Sort box is unchecked");
		}
		//Take Screenshot
		File fromTrainsrc = driver.getScreenshotAs(OutputType.FILE);
		File fromTraindest = new File("./snap/image.jpeg");
		FileUtils.copyFile(fromTrainsrc, fromTraindest);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		//driver.close();
	}

}
