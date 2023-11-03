package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod{
	
	public MyHomePage(RemoteWebDriver driver,Properties prop) {
		this.driver=driver;
		this.prop=prop;
	}
	
	public LeadsPage clickLeads() {
		driver.findElement(By.linkText(prop.getProperty("MyHomePage.leads.linkText"))).click();
		return new LeadsPage(driver,prop);
	}
	
	}
