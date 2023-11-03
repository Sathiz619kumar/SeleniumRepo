package week7.marathon;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public RemoteWebDriver driver;
	
@Parameters({"browser", "url"})	
@BeforeMethod
	public void BaseCls(String browser, String url) {

		// 01) Launch Firefox / Chrome
		// add implicitlyWait
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// 02) Load https://sso.redhat.com
		// 03) Verify that the user is on the registration page.
		// 04) Click on the "Register for a Red Hat account" button.
		// 05) Verify that the registration form is displayed.
		// 06) Fill in valid values for the following fields:
		// * Username
		// * Password
		// * Confirm Password
		// * First Name
		// * Last Name
		// * Email
		// * Phone
		// 07) Choose the Account type as 'Personal'
		// 08) Fill in valid values for the following fields:
		// * Select "India" as the country from the dropdown.
		// * Address
		// * Postal Code
		// * City
		// 09) Select "Tamil Nadu" as the state.
		//Mavericmaveric@1234
	if(browser.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
	}
	
	if(browser.equalsIgnoreCase("chrome")) {
	ChromeOptions ch = new ChromeOptions();
	ch.addArguments("--disable-notifications");
	driver = new ChromeDriver(ch);
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get(url);
	
	}

@AfterMethod
public void BaseCls1(){
	//driver.close();
}

@DataProvider
public String[][] setData() throws IOException{
	
	String[][] fromXccel = DataFromXcel.fromXccel();
	return fromXccel;
	
}

}
