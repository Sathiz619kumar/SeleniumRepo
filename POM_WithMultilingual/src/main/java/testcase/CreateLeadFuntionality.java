package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class CreateLeadFuntionality extends ProjectSpecificMethod{
	
	
		
	@Test(dataProvider="sendData")
	public void runCreate(String cname,String fname,String lname) {
		System.out.println(driver);
		new LoginPage(driver,prop).enterUsername().enterPassword().clickLogin().clickCrmsfa()
		.clickLeads().clickcreateLead().enterCompanyName(cname).enterFirstName(fname).enterLastName(lname).clickCreate().verifyCreateLead();
		
	}
	
	@BeforeTest
	public void setValues() {
		filename="Leads";
		sheetIndex=0;
	}

}
