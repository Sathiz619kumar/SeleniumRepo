package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearList {
	
	public static void main (String[] args) {
		String price;
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		/*
		 * List<WebElement> findNoOfLinks = driver.findElements(By.tagName("a"));
		 * System.out.println(findNoOfLinks.size()); System.out.println(findNoOfLinks);
		 */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> phonesInSearchResult = driver.findElements(By.className("a-price-whole"));
		int noOfPhonesInSearchResult = phonesInSearchResult.size();
		//List<String> priceList = new ArrayList<String>();
		List<Integer> priceList1=new ArrayList<Integer>();
		System.out.println(noOfPhonesInSearchResult);
		for(int i=0; i<=noOfPhonesInSearchResult-1;i++) {
			 price = phonesInSearchResult.get(i).getText();	
			 String phonePrice = price.replaceAll(",","");
			int convertToInteger = Integer.parseInt(phonePrice);
			 //System.out.println(convertToInteger);	
			 priceList1.add(convertToInteger);
		} 
		
		System.out.println(priceList1);
		Collections.sort(priceList1);
		Integer min = Collections.min(priceList1);
		System.out.println(priceList1);
		System.out.println(min);
		
		
		
		
		
		
		
	}

}
