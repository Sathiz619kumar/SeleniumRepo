package week7.marathon;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DataFromXcel {
	
	public static String[][] fromXccel() throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./excelData/excelDataMarathon.xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row = sheet.getRow(1);
		//XSSFCell cell1 = row.getCell(0);
		//String stringCellValue = cell1.getStringCellValue();
		//System.out.println(stringCellValue);
		int rowCount = sheet.getLastRowNum();
		int columnCount = row.getLastCellNum();
		System.out.println(rowCount+" "+columnCount);
		String[][] data = new String[rowCount][columnCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				String rowValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(rowValue);
				data[i-1][j]=rowValue;
				
			}
			
		}
		wb.close();
		return data;
		
	}

}
