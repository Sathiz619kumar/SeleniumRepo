package week4.marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException, IOException {

		
			
	
			
			
			
			
	
			
			
		
		//1. Load the url as https://www.tatacliq.com/
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		//2. MouseHover on 'Brands'
		//3. MouseHover on 'Watches & Accessories'
		WebElement brandElement = driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryAndBrand'])[2]"));
		Actions build = new Actions(driver);
		build.moveToElement(brandElement).perform();
		
		Thread.sleep(5000);
		WebElement watchElement = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		Actions build1 = new Actions(driver);
		build1.moveToElement(watchElement).perform();
		
		//4. Choose the first option from the 'Featured brands'.
		driver.findElement(By.xpath("(//div[@class='DesktopHeader__brandsDetails'])[1]")).click();
		Thread.sleep(5000);
		
		//5. Select sortby: New Arrivals		
		  WebElement sortElement = driver.findElement(By.xpath("(//div[@class='SelectBoxDesktop__base'])/select")); 
		  Select sortBy = new Select(sortElement); sortBy.selectByIndex(3);
		  
		//6. choose men from categories filter.
		//7. print all price of watches
		  String textMen = driver.findElement(By.xpath("//div[@class='FilterDesktop__newFilName']")).getText();
		  if("Men".equalsIgnoreCase(textMen)) {
			  System.out.println("Men watch filter clicked");
			  driver.findElement(By.xpath("//div[@class='FilterDesktop__newFilName']")).click();			  
		  }
		  else {
			  System.out.println("Men watch filter is not selected");
		  }
		  Thread.sleep(2000);
		  List<WebElement> priceList = driver.findElements(By.xpath("//h3[@class='ProductDescription__boldText']"));
		  List<String> comparePrice = new ArrayList<String>();
		  
		 
		  for(int i=0; i<priceList.size();i++) {
			  if(i%2!=0) {
			  System.out.println(priceList.get(i).getText().substring(1));
			  comparePrice.add(priceList.get(i).getText().substring(1).trim());
			  }
			  
		  } 
		  
		  
		  List<Integer> compareprice1 = new ArrayList<Integer>();
		  for(String S:comparePrice) {
			  compareprice1.add(Integer.valueOf(S));
		  }
		  
		//8. click on the first resulting watch.
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]")).click();
		  
		//9. compare two price a re similar
		 // Collections.sort(compareprice1);
		  //System.out.println("Sorted price are");
		  System.out.println(compareprice1);
		  System.out.println(compareprice1.get(0)+" "+compareprice1.get(1));
		  if (compareprice1.get(0).equals(compareprice1.get(1))) {
			  System.out.println("1st & 2nd price are both are same price");		  
			System.out.println("1st watch " +compareprice1.get(0));
			System.out.println("2nd watch " +compareprice1.get(1));
		}
		  else {
			  System.out.println("1st & 2nd price are both are different price");
			  System.out.println("1st watch " +compareprice1.get(0));
				System.out.println("2nd watch " +compareprice1.get(1));
		  }
		  
		   Set<String> windowHandles = driver.getWindowHandles();
		  System.out.println("Active windows are "+windowHandles.size());
		  List<String> windowHandles1=new ArrayList<String>(windowHandles);
		  driver.switchTo().window(windowHandles1.get(1));
		  //String title = driver.getTitle();
		  //System.out.println(title);
		  
		//10. click Add to cart and get count from the cart icon.
		//11. Click on the cart
		  driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		  String cartCount = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		  System.out.println("items in the cart "+cartCount);
		  driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		  
		//12. Take a snap of the resulting page. 

			Thread.sleep(5000);
		  File src = driver.getScreenshotAs(OutputType.FILE);
		  File dsc = new File("./snap/image3.jpeg");
		  FileUtils.copyFile(src,dsc); 
		  
			//13. All the opened windows one by one.
		  driver.switchTo().window(windowHandles1.get(1)).close();
		  driver.switchTo().window(windowHandles1.get(0));
		  System.out.println(driver.getTitle());
		
		  
		  
		  
		
		
		
		
		
		
		
	}

}
