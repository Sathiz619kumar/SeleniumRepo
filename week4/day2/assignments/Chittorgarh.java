package week4.day2.assignments;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chittorgarh {

	public static void main(String[] args) {

		//1. Launch the URL https://www.chittorgarh.com/
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		
		//2. Click on stock market
		//3. Click on NSE bulk Deals
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'NSE Bulk Deals')])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//4. Get all the Security names
		WebElement mainTable = driver.findElement(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']"));
		List<WebElement> noOfRows = mainTable.findElements(By.tagName("tr"));
		Set<String> bb = new LinkedHashSet<String>();
		Set<String> aa = new LinkedHashSet<String>();
		System.out.println(noOfRows.size());
		for (int i = 1; i < noOfRows.size(); i++) {
			WebElement findElement = driver.findElement(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']/tbody/tr["+i+"]/td[1]"));
		
		System.out.println(findElement.getText());
		bb.add(findElement.getText());
		if(bb.add(findElement.getText())==false) {
			aa.add(findElement.getText());
		}
		
		}
		System.out.println("Duplicates are "+aa);
		System.out.println(aa.size());
		
		
		//5. Ensure whether there are duplicate Security names
		if(noOfRows.size()!= bb.size()) {
			System.out.println("There are duplicates "+noOfRows.size()+" "+bb.size());
			
		}
		
		else {
			System.out.println("There are no duplicates "+noOfRows.size()+" "+bb.size());
		}
		
		
		
	}

}
