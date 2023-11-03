package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MultiLingualApp {

	public static void main(String[] args) throws IOException {
	

		//step the path of the file
		FileInputStream fis=new FileInputStream("./src/main/resources/config.properties");
		
		//to read the data from the prop file
		Properties prop=new Properties();
		prop.load(fis);	
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		
	}

}
