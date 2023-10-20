package week4.day2.assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {

		
			
			
			
			
			
			
			
			
			
			//14. Take the snapshot of the shoes.
			//15. Close the current window
			//16. Close the main window
		
		
		//1. Launch https://www.snapdeal.com/
		ChromeOptions dd = new ChromeOptions();
		dd.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(dd);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		//2. Go to Mens Fashion
		//3. Go to Sports Shoes
		Actions build = new Actions(driver);
		build.moveToElement(driver.findElement(By.xpath("//span[@class='catText']"))).perform();
		build.moveToElement(driver.findElement(By.xpath("//span[text()='Sports Shoes']"))).perform();
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		//4. Get the count of the sports shoes
		String shoesCount = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		String shoesCount1 = shoesCount.replaceAll("[^0-9]", "");
		System.out.println("Total shoe count "+shoesCount1);
	
		//5. Click Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		//6. Sort by Low to High
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
		Thread.sleep(4000);
		
		//7. Check if the items displayed are sorted correctly
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		List<String> shoePrice = new ArrayList<String>();
		for(int i=0;i<findElements.size();i++) {
			String text = findElements.get(i).getText().replaceAll("[^0-9]", "");
			shoePrice.add(text);
			
		}
		System.out.println(shoePrice);
		
		List<Integer> mm = new ArrayList<Integer>();
		for(int j=0;j<shoePrice.size();j++) {
		int parseInt = Integer.parseInt(shoePrice.get(j));
		mm.add(parseInt);	
		
		}
		System.out.println(mm);
		/*int size = mm.size();
		
		for (int i = 1; i < size; i++) {
			if(mm.get(i-1)<=mm.get(i)) {
				System.out.println(mm.get(i-1)+" & "+ mm.get(i));
				
				
			}
			
			else {
				System.out.println("Sss");
			}*/
			
			
		//8.Select the price range (900-1200)
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("900");
		//driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("1200");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		//9.Filter with color Navy  - Colour not available
		//10 verify the all applied filters  - Check
		
		
		//11. Mouse Hover on first resulting Training shoes
		//12. click QuickView button
		//13. Print the cost and the discount percentage
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("(//div[@class='product-tuple-image '])[1]"))).perform();
		Thread.sleep(3000);
		
		  //builder.moveToElement(driver.findElement(By.xpath("(//div[contains(text(),'Quick View')])[1]"))).perform(); 
		  //Thread.sleep(3000);
		  driver.findElement(By.xpath("(//div[contains(text(),'Quick View')])[1]")).click();
		  String text =driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		  System.out.println(text);
		  String text2 =driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		  System.out.println(text2);
		  
		//14. Take the snapshot of the shoes.
		//15. Close the current window
		//16. Close the main window
		 File src= driver.getScreenshotAs(OutputType.FILE);
		 File desc = new File("./snap/image6.jpeg");
		 FileUtils.copyFile(src, desc);
		 driver.close();
		 //driver.quit();
		

		
		
		
		
		
		
		
		
	}

}
