package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LogoutFuntionality extends ProjectSpecificMethod {

	@Test
	public void runLogout() {

		/**
		 * LoginPage lp=new LoginPage(); lp.enterUsername(); lp.enterPassword();
		 * 
		 * WelcomePage wp= new WelcomePage(); wp.clickCrmsfa();
		 */
		new LoginPage(driver,prop).enterUsername().enterPassword().clickLogin().clickLogout();

	}

}
