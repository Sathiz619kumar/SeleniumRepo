package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;

public class ProjectSpecificMethod {

	public  ChromeDriver driver;
	public String filename;
	public int sheetIndex;

	@Parameters({"browser","url"})
	@BeforeMethod
	public void preCondition(String url) {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}	
	
	@DataProvider(indices= {0,3})
	public String[][] sendData() throws IOException {		
		String[][] data = ReadExcel.readData(filename,sheetIndex);
		return data;
	}

}
