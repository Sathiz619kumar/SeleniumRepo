package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("//span[text()='Click']")).click();
        String titleExpected = "Dashboard";
        System.out.println("Expected title is "+titleExpected);
        String titleOfThePage = driver.getTitle();
        System.out.println("current title of the page is "+titleOfThePage );
        System.out.println("Are the title expected & actual are the same?");
        boolean resultOfTitle = titleOfThePage.equalsIgnoreCase(titleExpected);
        System.out.println(resultOfTitle);
        driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
        driver.findElement(By.xpath("//i[@class='pi pi-fw pi-mobile layout-menuitem-icon']")).click();
        System.out.println("is the button enabled?");
        boolean enabledOrDisbled = driver.findElement(By.xpath("//button[@disabled='disabled']")).isEnabled();
        System.out.println(enabledOrDisbled);
        Point locationOfSubmitButton = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).getLocation();
        System.out.println("Location of submit button is "+locationOfSubmitButton);
        WebElement colour = driver.findElement(By.xpath("//span[text()='Save']"));
        String cssValue = colour.getCssValue("background-color");
        System.out.println("Background colour of the button is "+cssValue);
        Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
        System.out.println("size of the button is "+size);
        driver.close();
        
        
        
	}

}
