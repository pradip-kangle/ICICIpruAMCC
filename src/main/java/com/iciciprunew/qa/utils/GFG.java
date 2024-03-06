package com.iciciprunew.qa.utils;

//Java Program to Demonstrate Creation Of Cell
//At Specific Position in Excel File

//Importing required classes
import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

//Class
//CreateCellAtSpecificPosition
public class GFG {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		EnterDataIntoSpeciedRowColomn("D:\\Hybrid TestNG Framework\\IciciPruNew\\src\\main\\java\\com\\icicipunew\\qa\\testdata\\NewFile.xlsx","PracticeSheet", 0, 3, "kangle");
	}
 // Main driver method
 public static void EnterDataIntoSpeciedRowColomn(String Path,String SheetName,int Row,int colomn,String Value)
     throws FileNotFoundException, IOException
 {

     // Creating a workbook instances
     Workbook wb = new HSSFWorkbook();

     // Creating output file
     OutputStream os
         = new FileOutputStream(Path);

     // Creating a sheet using predefined class
     // provided by Apache POI
     Sheet sheet = wb.createSheet(SheetName);

     // Creating a row at specific position
     // using predefined class provided by Apache POI

     // Specific row number
     Row row = sheet.createRow(Row);

     // Specific cell number
     Cell cell = row.createCell(colomn);

     // putting value at specific position
     cell.setCellValue(Value);

     // Finding index value of row and column of given
     // cell
     int rowIndex = cell.getRowIndex();
     int columnIndex = cell.getColumnIndex();

     // Writing the content to Workbook
     wb.write(os);

     // Printing the row and column index of cell created
     System.out.println("Given cell is created at "
                        + "(" + rowIndex + ","
                        + columnIndex + ")");
 }
}
