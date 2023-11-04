package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;

public class MovieList1 extends ProjectSpecificMethod {
		
public SeatSelectionPage selectMovieTime() {
		
	
	boolean displayed = driver.findElement(By.className("name")).isDisplayed();
	String text = driver.findElement(By.className("name")).getText();
	System.out.println("Movie name displayed " + displayed);
	System.out.println(text);
	boolean enabled = driver.findElement(By.xpath("//a[@class='schedule available']")).isEnabled();
	System.out.println("Showtime is available " + enabled);
	String showdate = driver.findElement(By.xpath("//div[@class='date']")).getText();
	System.out.println(showdate);
	String showtime = driver.findElement(By.xpath("//a[@class='schedule available']")).getText();
	System.out.println(showtime);
	driver.findElement(By.xpath("//a[@class='schedule available']")).click();
	return new SeatSelectionPage();
	
	}



}
