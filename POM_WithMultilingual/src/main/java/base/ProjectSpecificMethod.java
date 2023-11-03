package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;

public class ProjectSpecificMethod {

	public RemoteWebDriver driver;
	public String filename;
	public int sheetIndex;
	public Properties prop;

	@Parameters({ "language" })
	@BeforeMethod
	public void preCondition(String language) throws IOException {
		if (language.equalsIgnoreCase("english")) {
			FileInputStream fis = new FileInputStream("./src/main/resources/config_en.properties");
			// to read the data from the prop file
			prop = new Properties();
			prop.load(fis);
			driver = new ChromeDriver();
		} else if (language.equalsIgnoreCase("french")) {
			FileInputStream fis = new FileInputStream("./src/main/resources/config_fr.properties");
			// to read the data from the prop file
			prop = new Properties();
			prop.load(fis);
			driver = new EdgeDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}

	@DataProvider(indices = { 0, 3 })
	public String[][] sendData() throws IOException {
		String[][] data = ReadExcel.readData(filename, sheetIndex);
		return data;
	}

}
