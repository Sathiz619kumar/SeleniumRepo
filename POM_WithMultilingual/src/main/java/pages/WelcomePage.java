package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod {
	public WelcomePage(RemoteWebDriver driver,Properties prop) {
		this.driver = driver;
		this.prop=prop;
		
	}

	public MyHomePage clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver,prop);
	}

	public LoginPage clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver,prop);
	}

}
