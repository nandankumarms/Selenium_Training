package TestNGBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


//Method to read the String cell values.
public class GenericReadFromExcel {
	public String stringRead(String sheetName, int rowNum, int colNum) throws EncryptedDocumentException, IOException{
		File file=new  File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetName);
		
		return sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		
	}
	
	// Method to read numeric values.
	public double numericRead(String sheetName, int rowNum, int colNum) throws EncryptedDocumentException, IOException{
		
		File file=new  File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetName);
		
		return  sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		
	}
	
	
//	method to read boolan values
	
public boolean booleanRead(String sheetName, int rowNum, int colNum) throws EncryptedDocumentException, IOException{
		
		File file=new  File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetName);
		
		return  sheet.getRow(rowNum).getCell(colNum).getBooleanCellValue();
		
	}
		
	}


