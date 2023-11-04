package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;

public class MovieListPage extends ProjectSpecificMethod {
		
	public MovieList1 selectAnyMovie() {
		
		driver.findElement(By.xpath("(//div[@class='poster']//img)[1]")).click();
		return new MovieList1();

	}



}
