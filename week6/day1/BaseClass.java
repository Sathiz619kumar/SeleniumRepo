package week6.day1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;




public class BaseClass {
  
	public RemoteWebDriver driver;
	public String fileName;
	public int sheetNo;
  
  @Parameters({"url","username","password","browser"})
  @BeforeMethod
  public void beforeMethod(String url, String username, String password, String browser ) {
	  System.out.println(Thread.currentThread().getId());
		if (browser.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click(); 
		driver.findElement(By.linkText("Leads")).click();
  }

	
	  @AfterMethod public void afterMethod() {
	  
	  //driver.close(); 
		  }
	  
	/*
	 * @BeforeClass public void beforeClass() { }
	 * 
	 * @AfterClass public void afterClass() { }
	 * 
	 * @BeforeTest public void beforeTest() { }
	 * 
	 * @AfterTest public void afterTest() { }
	 * 
	 * @BeforeSuite public void beforeSuite() { }
	 * 
	 * @AfterSuite public void afterSuite() { }
	 */
	  @DataProvider
		public String[][] sendData() throws IOException {
			/*
			 * String[][] dd = new String[2][4]; dd[0][0] = "ABC"; dd[0][1] = "Sathish";
			 * dd[0][2] = "Kumar"; dd[0][3] = "90"; dd[1][0] = "XYZ"; dd[1][1] =
			 * "Shanmugam"; dd[1][2] = "S"; dd[1][3] = "98";
			 * 
			 * return dd;
			 */
			
			String[][] d = learnCopyDataFromXcel.readData(fileName, sheetNo); //className.javaMethodName()
			return d;
		}
	  
}
