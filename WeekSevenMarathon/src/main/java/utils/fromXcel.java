package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fromXcel {
	
	public void readxcel() throws IOException {
		
		
		XSSFWorkbook book= new XSSFWorkbook("./excelData/xcelData.xlsx");
		XSSFSheet sheetAt = book.getSheetAt(0);
		XSSFRow row = sheetAt.getRow(1);
		XSSFCell cell = row.getCell(0);
		String stringCellValue = cell.getStringCellValue();
		int colNum = row.getLastCellNum();
		int rowNum = sheetAt.getLastRowNum();
		
	}

}
