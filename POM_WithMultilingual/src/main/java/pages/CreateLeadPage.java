package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod {

	public CreateLeadPage(RemoteWebDriver driver, Properties prop) {
		this.driver = driver;
		this.prop=prop;
	}

	public CreateLeadPage enterCompanyName(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
	}

	public CreateLeadPage enterFirstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}

	public CreateLeadPage enterLastName(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}

	public ViewLeadPages clickCreate() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPages(driver,prop);
	}

}
