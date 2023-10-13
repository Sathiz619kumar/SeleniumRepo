package week4.day1.assignments;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TargetLocatorsAazonAssignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		
		
		
		
		
		
		//1.Load the URL https://www.amazon.in/
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//2.search as oneplus 9 pro 
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
		
		//3.Get the price of the first product
		String firstProductPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText().replaceAll("[^0-9]","");
		//float f=Float.parseFloat(firstProductPrice);
		
		System.out.println("The price of 1st product is "+firstProductPrice);
		
		
		//4. Print the number of customer ratings for the first displayed product
		driver.findElement(By.xpath("(//i[contains(@class, 'aok-align-bottom')])[1]")).click();
		Thread.sleep(1000);
		String firstProductCustomerRating = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-beside-button a-text-bold'])[1]")).getText();
		System.out.println("The customer rating of 1st product is "+firstProductCustomerRating);
		
		
		//5. Click the first text link of the first image
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		//6. Take a screen shot of the product displayed
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowhandles1 = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowhandles1.get(1));
		Thread.sleep(3000);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snap/image4.jpeg");
		FileUtils.copyFile(src, desc);
		
		//7. Click 'Add to Cart' button
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		//8. Get the cart subtotal and verify if it is correct.
		WebElement cartSubTotal = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-price a-text-bold']"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(cartSubTotal));
		String cartSubTotal1 = cartSubTotal.getText().replaceAll("[^0-9]","");
		String cartSubTotal2 = cartSubTotal1.substring(0, cartSubTotal1.length()-2);
		System.out.println("the cart total is "+cartSubTotal2);
		
		
		if(firstProductPrice.equals(cartSubTotal2)) {
			
		System.out.println("Both prices are equal");
			
		}
		else {
			System.out.println("Both prices are different");
		}
		
		//9.close the browser
		//driver.close();
		
	}

}
