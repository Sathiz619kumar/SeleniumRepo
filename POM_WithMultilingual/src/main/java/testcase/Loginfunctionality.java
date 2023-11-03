package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;
import pages.WelcomePage;

public class Loginfunctionality extends ProjectSpecificMethod{
	
	
		
	@Test
	public void runLogin() {
				
		System.out.println(driver);

		/*
		 * LoginPage lp=new LoginPage(); lp.enterUsername(); lp.enterPassword();
		 * 
		 * 
		 * WelcomePage wp= new WelcomePage(); wp.clickCrmsfa();
		 */
		
		new LoginPage(driver,prop).enterUsername().enterPassword().clickLogin().clickCrmsfa();
		
	}

}
