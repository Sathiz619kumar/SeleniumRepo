package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundCheckBox {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("((//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])/div)[4]")).click();
		System.out.println("is the confirmation message displayed?");
		boolean displayed = driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed();
		System.out.println(displayed);
		Thread.sleep(3000);
		System.out.println("Choose your favorite language(s)");
		driver.findElement(By.xpath("((//div[@class='ui-chkbox ui-widget'])/div)[2]")).click();
		//Thread.sleep(2000);
		//String language1 = driver.findElement(By.xpath("((//div[@class='ui-chkbox ui-widget'])/div)[2]")).getText();
		//System.out.println(language1);
		driver.findElement(By.xpath("((//div[@class='ui-chkbox ui-widget'])/div)[6]")).click();
		//Thread.sleep(2000);
		//String language2 = driver.findElement(By.xpath("((//div[@class='ui-chkbox ui-widget'])/div)[6]")).getText();
		//System.out.println(language2);
		
				driver.findElement(By.xpath("((//div[@class='ui-chkbox ui-widget'])/div)[12]")).click();

		
		
	}

}
