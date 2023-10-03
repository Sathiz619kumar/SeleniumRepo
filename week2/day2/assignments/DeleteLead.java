package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); // enter username
		driver.findElement(By.id("password")).sendKeys("crmsfa"); // enter password
		driver.findElement(By.className("decorativeSubmit")).click(); // click on login button
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();// click on the leads
		driver.findElement(By.linkText("Find Leads")).click(); // click on find leads
		driver.findElement(By.linkText("Phone")).click();// Click on Phone
		driver.findElement(By.name("phoneNumber")).sendKeys("9");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		Thread.sleep(2000);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String firststLead = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println(firststLead);
		Thread.sleep(2000);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click(); // click on find leads
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firststLead);
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		boolean enabled = driver.findElement(By.xpath("//div[@class='x-paging-info']")).isEnabled();
		System.out.println("the record is deleted " + enabled);
		driver.close();

	}

}
