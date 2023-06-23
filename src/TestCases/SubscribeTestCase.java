package TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestNGBasics.LearningReadExcel;
import framework_utility.BaseTest;

public class SubscribeTestCase extends BaseTest{
	
	
	@DataProvider(name="SubscribeTestData")
	public String[][] subscribeData() throws EncryptedDocumentException, IOException{
		return LearningReadExcel.readExcelData("Subscribe");
		
	}


	@Test(dataProvider = "SubscribeTestData")
	public void demo(String email) throws InterruptedException {
		
				
				driver.findElement(By.id("newsletter-email")).sendKeys(email);
				
				driver.findElement(By.id("newsletter-subscribe-button")).click();
				
				driver.navigate().refresh();
				
		
}
}
