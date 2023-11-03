package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class ViewLeadPages extends ProjectSpecificMethod{

	
	public ViewLeadPages(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	
	public ViewLeadPages verifyCreateLead() {
		System.out.println(driver.getTitle());
		return this;
	}
}
