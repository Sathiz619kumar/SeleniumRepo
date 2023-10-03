package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("sasi");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		Thread.sleep(2000);
		String firststLead = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println(firststLead);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("ABC company");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		String updatedCompanyName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println(updatedCompanyName);
		int compareTo = updatedCompanyName.compareTo("ABC company " + "(" + firststLead + ")");
		System.out.println(compareTo);
		driver.close();

	}

}
