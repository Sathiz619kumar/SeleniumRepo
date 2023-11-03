package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class learnCopyDataFromXcel {

	public static String[][] readData(String fileName, int sheetNo) throws IOException {
		
		XSSFWorkbook book = new XSSFWorkbook("./excelData/"+fileName+".xlsx"); // Step:1 set the path of the excelfile
		XSSFSheet sheet = book.getSheetAt(sheetNo); // Step:2 ->identify the sheet that have corresponding data
		XSSFRow row = sheet.getRow(1); // Step:3 -->From sheet identify the rows to read
		XSSFCell cell = row.getCell(0); // Step:4 -->From the row -->reach the cell to read
		String stringCellValue = cell.getStringCellValue(); // Step:5 -->Get the string from the cell
		//System.out.println(stringCellValue);
		
		// To read all the data from excel
		
		int rowCount = sheet.getLastRowNum(); // to find the number of rows in the excel book. This excludes ist row by default as it will consider it as heading
		int colCount = row.getLastCellNum(); // to get the count of the columns
		
		String[][] data = new String[rowCount][colCount]; 
		for (int i = 1; i <= rowCount; i++) { //row iteration
			for (int j = 0; j < colCount; j++) { //column iteration
				String stringCellValue2 = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue2);
				data[i-1][j]  = stringCellValue2; //i-1 cos data in array will be starts from [0][0] but the row starts from 1 cos first row in xcel will be heading
				
			}
			
			
		}
		book.close();
		return data;
		
		

	}

}
