package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;

public class ReviewPage extends ProjectSpecificMethod {
	
	public ReviewPage SelectPaymentMethod() throws InterruptedException{
		Thread.sleep(3000);
		String movieNameReview = driver.findElement(By.xpath("//span[@class='primary']")).getText();
		System.out.println(movieNameReview);
		String seatReview = driver.findElement(By.xpath("(//div[@class='box'])[1]")).getText();
		System.out.println(seatReview);
		String totalCostreview = driver.findElement(By.xpath("//span[text()='₹ ']/following-sibling::span")).getText();
		System.out.println(totalCostreview);
		driver.findElement(By.xpath("(//div[@class='title'])[2]")).click();
		return new ReviewPage();
	}
	
	public ReviewPage enterCardNumDetails(){
		driver.findElement(By.xpath("//input[@placeholder='XXXX XXXX XXXX XXXX']")).sendKeys("1111111111111111");
		return new ReviewPage();
		
		
	}
	
public ReviewPage enterCardExpiryDetails(){
	driver.findElement(By.xpath("//input[@placeholder='MM / YYYY']")).sendKeys("111111");
	return new ReviewPage();
	
	}
	
public ReviewPage enterCVVDetails(){
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
	return new ReviewPage();
	
		
}
	
public ReviewPage enterNameDetails(){
	driver.findElement(By.xpath("//label[text()='Name']/following::input")).sendKeys("sathish");
	return new ReviewPage();
	
	
}

public ReviewPage enterMailDetails(){
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sa@gmail.com");
	return new ReviewPage();
	
	
}
	
public ReviewPage enterPNumDetails(){
	driver.findElement(By.xpath("//span[text()='+91']/following::input")).sendKeys("9999999999");
	boolean enterCardDetails = driver.findElement(By.xpath("//span[text()='Enter Valid Card Number']"))
			.isDisplayed();
	System.out.println("Enter valid card details field is displayed " + enterCardDetails);
	return new ReviewPage();
	
}


}
