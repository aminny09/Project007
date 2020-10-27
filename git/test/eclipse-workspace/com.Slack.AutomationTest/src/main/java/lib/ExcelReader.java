package lib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
    static Sheet excelSheet;

		public static Object[][] excelDataToObjectArray(String fileName,String sheetName) throws IOException {
		// Object[][] tabArray;
		FileInputStream excelFileRead = new FileInputStream(fileName);//
		Workbook excelWBook = new XSSFWorkbook(excelFileRead);//
		excelSheet = excelWBook.getSheet(sheetName);

		int totalRows = excelSheet.getPhysicalNumberOfRows();// 4
		int totalCols = excelSheet.getRow(0).getPhysicalNumberOfCells();// 3
		// t[row][col]
		// deduct one row because of header row
		Object[][] tabArray = new Object[totalRows - 1][totalCols]; // 3X2
		for (int row = 1; row < totalRows; row++) {
		for (int col = 0; col < totalCols; col++) {
		// add row+1 to get data after header row
		tabArray[row - 1][col] = getCellData(row, col);// (0,0)donald,(0,1)trump,(0,2)1950
		}
		}
		//excelWBook.close();
		//excelFileRead.close();
		return tabArray;
		}
		public static String getCellData(int row, int col) {
		Cell cell = excelSheet.getRow(row).getCell(col);
		String celldata = "";
		// String cellData = cell.getStringCellValue().trim();
		// convert to string by using switch statement.

		if (cell.getCellType() == cell.CELL_TYPE_STRING) {
		celldata = cell.getStringCellValue().trim();
		} else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
		celldata = String.valueOf((int) cell.getNumericCellValue());
		}
		return celldata;
		}
	}
