package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class LeadsPage extends ProjectSpecificMethod{
	
	public LeadsPage(RemoteWebDriver driver,Properties prop) {
		this.driver=driver;
		this.prop=prop;
	}
	public CreateLeadPage clickcreateLead() {
		driver.findElement(By.linkText(prop.getProperty("LeadsPage.createLead.linktext"))).click();
		return new CreateLeadPage(driver,prop);
	}
	
	
	public Findleads clickfindsLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new Findleads();
	}
	
	

}
