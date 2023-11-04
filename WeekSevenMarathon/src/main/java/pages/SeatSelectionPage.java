package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;

public class SeatSelectionPage extends ProjectSpecificMethod {
	
	public SeatSelectionPage acceptTandC(){
		driver.findElement(By.xpath("//button[@type='button']")).click();
		return new SeatSelectionPage();
	}
	
	public SeatSelectionPage selectMovieSeat() throws InterruptedException{
		boolean seatEnabled = driver.findElement(By.xpath("//div[text()='J15']")).isEnabled();
		System.out.println("Seat enabled " + seatEnabled);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='J15']")).click();
		boolean seatEnabled1 = driver.findElement(By.xpath("//div[text()='J16']")).isEnabled();
		System.out.println("Seat enabled " + seatEnabled1);
		driver.findElement(By.xpath("//div[text()='J14']")).click();
		return new SeatSelectionPage();
	}
	
	public ReviewPage confirmSeatSelection(){
		driver.findElement(By.xpath("//div[contains(@class,'box progress')]//span[1]")).click();
		return new ReviewPage();
		
	}

}
