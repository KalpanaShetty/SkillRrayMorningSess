package dataDrivenByExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenSampleByExcelTest {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./TestData/ExcelTestData.xlsx");
         //open workbook in read mode
		Workbook wb = WorkbookFactory.create(fis);
		//get the control of the sheet
		Sheet sh = wb.getSheet("Sheet1");
		//get control of row
		Row row = sh.getRow(1);
		//get the control of cell and copy the data
		Cell cel = row.getCell(1);
		String data = cel.getStringCellValue();
		
		System.out.println(data);
		//close workbook
		wb.close();
	}

}
