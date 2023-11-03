package week6.day1;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;



public class CreateLead extends BaseClass  {

	//public static void main(String[] args) 
	@Test(dataProvider = "sendData") // mandatory annotation
	public void createLd(String cname, String fname, String lname, String phone){
		//WebDriverManager.chromedriver().setup();
		System.out.println(Thread.currentThread().getId());
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phone);
		driver.findElement(By.name("submitButton")).click();
		
}

	@BeforeTest
public void setValue() {
	fileName = "excelData";
	sheetNo= 0;
}
	
}






