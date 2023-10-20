package week4.day2.assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import week4.day2.TakeScreenshot;

public class Myntra {

	private static String text;

	public static void main(String[] args) throws InterruptedException, IOException {
						
	
			
			
			
			
			
			
		
		//1) Open https://www.myntra.com/
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//2) Mouse hover on MeN 
		//3) Click Jackets 
		WebElement moveElement = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		Actions build = new Actions(driver);
		build.moveToElement(moveElement).perform(); 
		WebElement moveElement1 = driver.findElement(By.xpath("(//a[text()='Jackets'])[1]"));
		build.moveToElement(moveElement1).click().perform();
		
		//4) Find the total count of item 
		//5) Validate the sum of categories count matches
		Thread.sleep(2000);
		String totalCount = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		String totalCount1 = totalCount.replaceAll("[^0-9]", "");
		System.out.println("Total count is "+totalCount1);
		String categoryCount = driver.findElement(By.xpath("(//span[@class='categories-num'])[1]")).getText();
		String categoryCount1 = categoryCount.replaceAll("[^0-9]", "");
		System.out.println("Category count is "+categoryCount1);
		if(totalCount1.equalsIgnoreCase(categoryCount1)) {
			System.out.println("Both counts are equal");
		}
		
		else {
			System.out.println("Both counts are different");
		}
		
		//6) Check jackets
		driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[1]")).click();
		String filterSelected = driver.findElement(By.xpath("(//label[@class='common-customCheckbox vertical-filters-label'])[1]")).getText();
		System.out.println("Filter clicked "+ filterSelected);
		
		
		//7) Click + More option under BRAND
		//8) Type Duke and click checkbox
		//9) Close the pop-up x
		
		  driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		  driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).clear();
		  driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).sendKeys("Duke"); 
		  Thread.sleep(3000);
		  //driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']"))
		  //.sendKeys(Keys.ENTER);
		  driver.findElement(By.xpath("//label[@class=' common-customCheckbox']")).click(); 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']" )).click(); 
		 
		
		//10) Confirm all the Coats are of brand Duke Hint : use List 		
		  List<WebElement> brandSelected = driver.findElements(By.xpath("(//div[@class='product-productMetaInfo']/h3[@class='product-brand'])")); 
		  Thread.sleep(3000);
		  System.out.println("Counts of brands displayed "+brandSelected.size());
		  for(int i=0;i<brandSelected.size();i++) { 
			  System.out.println(brandSelected.get(i).getText()); 
			
		  }
		  
		//11) Sort by Better Discount
		driver.findElement(By.xpath("//div[@class='sort-sortBy']")).click();
		driver.findElement(By.xpath("(//label[@class='sort-label ']/parent::li)[4]")).click();
		 Thread.sleep(3000);
		 
		//12) Find the price of first displayed item & Click on the first product
		 WebElement firstProductPrice = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]"));
		System.out.println("First product price is "+firstProductPrice.getText());
		driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]")).click();
		Thread.sleep(2000);
		
		//13) Take a screen shot
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Current active windows "+ windowHandles.size());
		List<String> windowhandles1 = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowhandles1.get(1));
		driver.getTitle();
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snap/image5.jpeg");
		FileUtils.copyFile(src, desc);
		

		//14) Click on WishList Now
		//15) Close Browser
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-notWishlistedIcon sprites-notWishlisted pdp-flex pdp-center ']")).click();
		//driver.close();
		
		
		
		  
		 

		 
		
		
		
		
		
	}

}
