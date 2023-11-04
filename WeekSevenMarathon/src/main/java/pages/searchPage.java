package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.annotations.DataProviderAnnotation;

import base.ProjectSpecificMethod;

public class searchPage extends ProjectSpecificMethod {

	

	public searchPage clickSearchCity() {
		driver.findElement(By.xpath("//a[@href='/cities']//span[1]")).click();
		return new searchPage();

	}
	

	public searchPage enterSearchCity() {
		driver.findElement(By.className("search")).sendKeys("Chennai");
		return new searchPage();
	}

	public MovieListPage selectSearchCity() {
		driver.findElement(By.xpath("(//div[text()='Chennai'])[2]")).click();
		return new MovieListPage();
	}
	
	
	
}
