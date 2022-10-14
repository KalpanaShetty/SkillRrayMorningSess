package com.skilrary.genericUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class consist of methods related to apache poi 
 * @author Kalpana Shetty
 *
 */
public class ExcelUtility {
	/**
	 * This method isnused to get the data from the excel sheet
	 * @param sheetName
	 * @param rowNum
	 * @param celNum
	 * @throws Throwable
	 */
public void getDataFromExcel(String sheetName, int rowNum, int celNum) throws Throwable {
	FileInputStream fis=new FileInputStream("./TestData/ExcelTestData.xlsx");
    //open workbook in read mode
	Workbook wb = WorkbookFactory.create(fis);
	//get the control of the sheet
	Sheet sh = wb.getSheet(sheetName);
	//get control of row
	Row row = sh.getRow(rowNum);
	//get the control of cell and copy the data
	Cell cel = row.getCell(celNum);
	String data = cel.getStringCellValue();
	
	System.out.println(data);
	//close workbook
	wb.close();
}
/**
 * used to get last row number on specified sheet
 * @param sheetName
 * @return
 * @throws Throwable
 * @throws Throwable
 */
public int getRowCount(String sheetName) throws Throwable, Throwable {
	FileInputStream fis=new FileInputStream("./TestData/ExcelTestData.xlsx");
    //open workbook in read mode
	Workbook wb = WorkbookFactory.create(fis);
	//get the control of the sheet
	Sheet sh = wb.getSheet(sheetName);
	wb.close();
	return sh.getLastRowNum();
	
}

}
