package pages;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class ViewLeadPages extends ProjectSpecificMethod{

	
	public ViewLeadPages(RemoteWebDriver driver, Properties prop) {
		this.driver=driver;
		this.prop=prop;
	}
	
	public ViewLeadPages verifyCreateLead() {
		System.out.println(driver.getTitle());
		return this;
	}
}
