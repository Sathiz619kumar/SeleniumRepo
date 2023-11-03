package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String filename,int sheetIndex) throws IOException {

		XSSFWorkbook book = new XSSFWorkbook("./data/"+filename+".xlsx");
		XSSFSheet sheet = book.getSheetAt(sheetIndex);
		XSSFRow row = sheet.getRow(1);
		int rowCount = sheet.getLastRowNum(); // provide the count of rows with data
		int colCount = row.getLastCellNum();

		String[][] data = new String[rowCount][colCount];

		for (int i = 1; i <= rowCount; i++) { // row iteration -outerloop
			for (int j = 0; j < colCount; j++) {// col iteration-innerloop
				// book-->sheet-->row-->cell-->string
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				data[i - 1][j] = stringCellValue;
			}
		}

		book.close();// mandatory
		return data;
	}

}
