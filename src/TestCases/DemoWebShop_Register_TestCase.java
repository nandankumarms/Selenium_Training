package TestCases;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestNGBasics.LearningReadExcel;
import framework_utility.BaseTest;

public class DemoWebShop_Register_TestCase extends BaseTest{
	
	@DataProvider(name="RegisterTestData")
	public String[][] testData() throws EncryptedDocumentException, IOException{
		return LearningReadExcel.readExcelData("Register");
		
		
		
	}
	
	
	@Test(dataProvider = "RegisterTestData")
	public void register(String firstName, String lastName, String email, String password, String confirmPassword) {
				
		driver.findElement(By.linkText("Register")).click();
		
		//Finding element Male button and clicking on it.
		WebElement maleButton=driver.findElement(By.id("gender-male"));
		
		//Click on male button
		maleButton.click();
		
		//Validate male button
		Assert.assertEquals(maleButton.isSelected(), true);
		
		//Finding the web element First name text field and sending sending characterss
		WebElement fName=driver.findElement(By.id("FirstName"));
		
		// Send data to firstName text field
		fName.sendKeys(firstName);
		
		// Validate first name text field
		
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPassword);
		driver.findElement(By.id("register-button")).click();		
		
		WebElement confirmMessage=driver.findElement(By.xpath("//li[contains(text(),'The specified email already exists')]"));
				
		Assert.assertEquals(confirmMessage.getText(), "The specified email already exists");
		
	}

}
