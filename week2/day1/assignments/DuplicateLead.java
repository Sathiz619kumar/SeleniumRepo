package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login"); // open URL
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); // enter user name
		driver.findElement(By.id("password")).sendKeys("crmsfa"); // enter password
		driver.findElement(By.className("decorativeSubmit")).click(); // click on login button
		driver.findElement(By.linkText("CRM/SFA")).click(); // click on the link
		// create lead
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tesst1 Company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tesst1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Tesst1");
		// select value from drop down "source"
		WebElement source = driver.findElement(By.name("dataSourceId"));
		Select source1 = new Select(source);
		source1.selectByVisibleText("Employee");

		// select value from drop down "MarketingCampaignId"
		WebElement marketCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketCampaign1 = new Select(marketCampaign);
		marketCampaign1.selectByValue("9001");

		// select value from drop down "Ownership"
		WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
		Select Ownership1 = new Select(Ownership);
		Ownership1.selectByIndex(5);
		/*
		 * WebElement firstSelectedOption = Ownership1.getFirstSelectedOption();
		 * System.out.println(firstSelectedOption);
		 */

		// select value from drop down "Country"
		WebElement country = driver.findElement(By.name("generalCountryGeoId"));
		Select country1 = new Select(country);
		country1.selectByVisibleText("India");
		/*
		 * WebElement firstSelectedOption1 = country1.getFirstSelectedOption();
		 * System.out.println(firstSelectedOption1);
		 */
		// submit create lead
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear(); //clear existing value
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tesst2 Company");
		driver.findElement(By.id("createLeadForm_firstName")).clear(); //clear existing value
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tesst2");
		driver.findElement(By.id("createLeadForm_lastName")).clear(); //clear existing value
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Tesst2");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}
