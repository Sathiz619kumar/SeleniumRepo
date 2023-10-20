package week4.day2.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {

		
			
			
			
			
			
			
			
			
			
			
			
		
		//1) Go to  https://www.nykaa.com/
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//2) Mouseover on Brands and Search L'Oreal Paris
		//3) Click L'Oreal Paris
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions aa = new Actions(driver);
		aa.moveToElement(findElement).perform();
		WebElement findElement2 = driver.findElement(By.id("brandSearchBox"));
		aa.moveToElement(findElement2).perform();
	
		//3) Click L'Oreal Paris
		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oréal Paris");
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//a[contains(text(),'Oréal Paris')]")).click();
		
		//4) Check the title contains L'Oreal Paris(Hint-GetTitle)
		System.out.println(driver.getTitle());
		
		//5) Click sort By and select customer top rated
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("(//span[@class='title'])[4]")).click();
		
		//6) Click Category and click Hair->Click haircare->Shampoo
		//7) Click->Concern->Color Protection
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Hair')])[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Hair Care')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Shampoo')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Colour Protection']")).click();
		
		//8)check whether the Filter is applied with Shampoo
		boolean displayed = driver.findElement(By.xpath("(//span[contains(text(),'Shampoo')])[1]")).isDisplayed();
		System.out.println(displayed);
		
		//9) Click on L'Oreal Paris Colour Protect Shampoo
		String text = driver.findElement(By.xpath("//div[@class='css-xrzmfa']")).getText();
		System.out.println(text);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='css-xrzmfa']")).click();
		Thread.sleep(3000);
		
		
		//10) GO to the new window and select size as 175ml
		Set<String> windowHandles = driver.getWindowHandles();
		int size = windowHandles.size();
		System.out.println(size);
		List<String> bb = new ArrayList<String>(windowHandles);
		driver.switchTo().window(bb.get(1));
		int width = 600;
		int height = 400;
		Dimension dimension = new Dimension(width, height);
		driver.manage().window().setSize(dimension);
		driver.manage().window().maximize();
		
		//11) Print the MRP of the product
		String text2 = driver.findElement(By.xpath("//div[@class='css-f5j3vf']")).getText();
		String productPrice = text2.replaceAll("[^0-9]", "");
		System.out.println(productPrice);
		
		//12) Click on ADD to BAG
		//13) Go to Shopping Bag 
		//14) Print the Grand Total amount
		driver.findElement(By.xpath("(//button[@class=' css-13zjqg6'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='cart-count'])[1]")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		String text3 = driver.findElement(By.xpath("//span[text()='Proceed']")).getText();
		System.out.println("Button clicked "+text3);
		String text4 = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText();
		String grandTotal = text4.replaceAll("[^0-9]", "");
		System.out.println("Grand total is "+grandTotal);
		
		//15) Click Proceed
		//16) Click on Continue as Guest
		//17) Check if this grand total is the same in step 14
		//18) Close all windows
		
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		//driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		driver.findElement(By.xpath("(//img[@alt='Image'])[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@alt='Image'])[9]")).click();
		Thread.sleep(2000);
		String findElement3 = driver.findElement(By.xpath("(//div[@class='css-vlqrtx e1d9ugpt3'])[3]")).getText();
		String cartValue = findElement3.replaceAll("[^0-9]", "");
		System.out.println("cart amount is "+cartValue);
		if(cartValue.equals(grandTotal)) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are different");
		}
		
		//driver.close();
		
		
		
		
		
		
	}

}
