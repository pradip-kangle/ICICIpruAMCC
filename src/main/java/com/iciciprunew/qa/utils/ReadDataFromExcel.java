package com.iciciprunew.qa.utils;

import java.io.FileInputStream;

import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {

		GetDataFromRowColomn(
				"D:\\Hybrid TestNG Framework\\IciciPruNew\\src\\main\\java\\com\\iciciprunew\\qa\\testdata\\testdata.xlsx",
				"Login", 1, 1);
	}

	public static Object GetDataFromRowColomn(String ExcelFilePath, String SheetNamee, int Row, int col)
			throws IOException {
		// Path of the excel file
		FileInputStream fs = new FileInputStream(ExcelFilePath);
		// Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheet(SheetNamee);
		Row row = sheet.getRow(Row);
		Cell cell = row.getCell(col);
		CellType cellType = cell.getCellType();

		Object data = null;
		switch (cellType) {

		case STRING:
			data = cell.getStringCellValue();
			System.out.println(data);
			break;
		case NUMERIC:
			data = Integer.toString((int) cell.getNumericCellValue());
			System.out.println(data);
			break;
		case BOOLEAN:
			data = cell.getBooleanCellValue();
			System.out.println(data);
			break;

		}

		return data;
	}
}
