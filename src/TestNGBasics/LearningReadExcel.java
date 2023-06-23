package TestNGBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LearningReadExcel {
	public static void SingleReadExcel() throws EncryptedDocumentException, IOException {
		File file=new File("./TestData/TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workBook=WorkbookFactory.create(fis);
		
		Sheet sheet=workBook.getSheet("Login");
		
		Row row=sheet.getRow(1);
		
		Cell cell=row.getCell(1);
		
		System.out.println(cell.toString());
	}
	
	
	public static void multipleReadExcel(String sheetName) throws EncryptedDocumentException, IOException {
		File file=new File("./TestData/TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workBook=WorkbookFactory.create(fis);
		
		Sheet sheet=workBook.getSheet(sheetName);
	int	rows=sheet.getPhysicalNumberOfRows();
	int column=sheet.getRow(0).getPhysicalNumberOfCells();
		for (int i = 1; i < rows; i++) {
			
			for (int j = 1; j < column; j++) {
				System.out.println(sheet.getRow(i).getCell(j).toString());
			}
		}
	}
	
	
	//Method to store data of excel in two dimentional array
	public static String[][] readExcelData(String sheetName) throws EncryptedDocumentException, IOException {
		File file=new File("./TestData/TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workBook=WorkbookFactory.create(fis);
		
		Sheet sheet=workBook.getSheet(sheetName);
		
		
	int	rows=sheet.getPhysicalNumberOfRows();
	int column=sheet.getRow(0).getPhysicalNumberOfCells();
	
	String array[][]=new String[rows-1][column];
		for (int i = 1; i < rows; i++) {
			
			for (int j = 0; j < column; j++) {
				
				array[i-1][j]= sheet.getRow(i).getCell(j).toString();
				
			}
		}
		
//        for (int i = 0; i < rows-1; i++) {
//			
//			for (int j = 0; j < column; j++) {
//				
//				System.out.println(array[i][j]);
//				
//			}
//		}
        
        return array;
		
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//SingleReadExcel();
		//multipleReadExcel("Login");
		readExcelData("Register");
	}

}
