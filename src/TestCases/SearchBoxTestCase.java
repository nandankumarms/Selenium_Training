package TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestNGBasics.LearningReadExcel;
import framework_utility.BaseTest;

public class SearchBoxTestCase extends BaseTest{
	
	@DataProvider(name="SearchTestData")
	public String[][] searchData() throws EncryptedDocumentException, IOException{
		return LearningReadExcel.readExcelData("SearchBox");
	}

	
	@Test(dataProvider = "SearchTestData")
	public void demo(String product) {
		
				
				driver.findElement(By.id("small-searchterms")).sendKeys(product);
				
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				
				
		
	}
	

}
