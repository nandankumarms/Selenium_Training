package TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestNGBasics.LearningReadExcel;
import framework_utility.BaseTest;

public class DemoWebShopLoginTestCase extends BaseTest{
	
	@DataProvider(name="LoginTestData")
	public String[][] loginData() throws EncryptedDocumentException, IOException {
		return LearningReadExcel.readExcelData("Login");
		
	}

	
	@Test(dataProvider = "LoginTestData")
	public void login(String email, String password) {
		
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys(email);
		
		driver.findElement(By.id("Password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Assert.assertEquals(driver.findElement(By.partialLinkText(email)).getText(), email);
		
		driver.navigate().back();
	}

}
