package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{
	
	
	public LoginPage(RemoteWebDriver driver,Properties prop) {
		this.driver=driver;
		this.prop=prop;
	}

	public LoginPage enterUsername() {
	
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
	//	LoginPage lp=new LoginPage();
		return this;
		
	}

	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		return this;

	}

	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver,prop);

	}

}
