package week7.marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegistrationFormPage extends BaseClass {
@Test(dataProvider = "setData")
	public void RegistrationFP(String username, String password, String cpassword, String fname, String lname, String email, String pnum, String job, String country, String add1, String add2, String add3, String add4, String post, String City, String state) {
		// TODO Auto-generated method stub
	boolean displayed = driver.findElement(By.xpath("//pfe-navigation[@id='pfe-navigation']/div[2]/a[1]")).isDisplayed();
	if (displayed==true) {
		System.out.println("Registration page displayed");
	}
	else {
		System.out.println("Registration page is not displayed");
	}
	
	driver.findElement(By.xpath("//pfe-navigation[@id='pfe-navigation']/div[2]/a[1]")).click();
		boolean displayed2 = driver.findElement(By.xpath("//h1[text()='Register for a Red Hat account']")).isDisplayed();
		if (displayed2==true) {
			System.out.println("Registration form page displayed");
		}
		else {
			System.out.println("Registration form page is not displayed");
		}	
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("confirmPassword")).sendKeys(cpassword);
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("user.attributes.phoneNumber")).sendKeys(pnum);
		driver.findElement(By.id("user.attributes.jobTitle")).sendKeys(job);
		driver.findElement(By.id("personal")).click();
		WebElement findElement = driver.findElement(By.id("user.attributes.country"));
		Select bn = new Select(findElement);
		bn.selectByVisibleText(country);
		driver.findElement(By.id("user.attributes.addressLine1")).sendKeys(add1);
		driver.findElement(By.id("user.attributes.addressLine2")).sendKeys(add2);
		driver.findElement(By.id("user.attributes.addressLine3")).sendKeys(add3);
		driver.findElement(By.id("user.attributes.addressLine4")).sendKeys(add4);
		driver.findElement(By.id("user.attributes.addressPostalCode")).sendKeys(post);
		driver.findElement(By.id("user.attributes.addressCityText")).sendKeys(City);
		WebElement findElement2 = driver.findElement(By.id("user.attributes.addressState"));
		Select bn1 = new Select(findElement2);
		bn1.selectByValue(state);

	}

}
