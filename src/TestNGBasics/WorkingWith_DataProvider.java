package TestNGBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWith_DataProvider {
	
	@DataProvider(name="TestData")
	public  Object[] [] copyExcelToArray() throws EncryptedDocumentException, IOException {
		File file=new File("./TestData/TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workBook=WorkbookFactory.create(fis);
		
		Sheet sheet=workBook.getSheet("Register");
		
		
	int	rows=sheet.getPhysicalNumberOfRows();
	int column=sheet.getRow(0).getPhysicalNumberOfCells();
	
	Object data[][]=new Object[rows-1][column];
		for (int i = 1; i < rows; i++) {
			for(int j=0;j <column;j++) {
//				System.out.println(i+" "+j);
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
//				System.out.println(data[i][j]);
			}
			 
			}
		return data;
	}
	
	
	
	@Test(dataProvider = "TestData")
	public void dataDemo(String firstName, String lastName, String email, String password, String cpwd ) {
		// set system property
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				 WebDriver driver=new ChromeDriver();
				//Launch browser
				 driver=new ChromeDriver();
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				//Enable implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//Navigate to wesite
				driver.get("https://demowebshop.tricentis.com/");
				
				driver.findElement(By.linkText("Register")).click();
				
				driver.findElement(By.id("gender-male")).click();
				
				driver.findElement(By.id("FirstName")).sendKeys(firstName);
				
				driver.findElement(By.id("LastName")).sendKeys(lastName);
				
				driver.findElement(By.id("Email")).sendKeys(email);
				
				driver.findElement(By.id("Password")).sendKeys(password);
				
				driver.findElement(By.id("ConfirmPassword")).sendKeys(cpwd);
				
				driver.findElement(By.id("register-button")).click();
		
	}

}
