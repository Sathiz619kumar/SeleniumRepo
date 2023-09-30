package week2.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		// 01) Launch Chrome
		// 02) Load https://www.amazon.in/ add implicitlyWait
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// 03) Type "Bags for" in the Search box
		// 04) Choose the item in the result (bags for boys)
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags for");
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		// driver.findElement(By.id("nav-search-submit-button")).click();

		// 05) Print the total number of results (like 50000) 1-48 of over 50,000
		// results for "bags for boys"
		WebElement totalResult = driver
				.findElement(By.xpath("((//div[@class='a-section a-spacing-small a-spacing-top-small'])/span)[1]"));
		String totalResult1 = totalResult.getText();
		System.out.println("Total count of search result is " + totalResult1.substring(13, 19));

		// 06) Select the first 2 brands in the left menu (like American Tourister,
		// Generic)
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		Thread.sleep(3000);
		WebElement brand = driver.findElement(By.xpath("((//div[@id='brandsRefinements'])//span)[8]"));
		String brand1 = brand.getText();
		System.out.println("First brand is " + brand1);
		WebElement brand2 = driver.findElement(By.xpath("((//div[@id='brandsRefinements'])//span)[12]"));
		String brand3 = brand2.getText();
		System.out.println("Second brand is " + brand3);

		// 07) Choose New Arrivals (Sort)
		driver.findElement(By.className("a-dropdown-prompt")).click();
		driver.findElement(By.xpath("(//li[@class='a-dropdown-item'])[5]")).click();

		// 08) Print the first resulting bag info (name, discounted price)
		WebElement brandNewArrival = driver
				.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
		String brandNewArrival1stResult = brandNewArrival.getText();
		System.out.println("New arrrival brand 1st search result is " + brandNewArrival1stResult);
		WebElement discounterPrice = driver.findElement(By.xpath("(//span[@aria-hidden='true'])[12]"));
		String discounterPrice1 = discounterPrice.getText();
		System.out.println("New arrrival brand discounted price is " + discounterPrice1);
		String title = driver.getTitle();
		System.out.println(title);

		// 09) Get the page title and close the browser(driver.close())
		driver.close();

	}

}
