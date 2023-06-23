package TestNGBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingWith_OrderOfExecution {
	
	@Test(priority=3,  groups = "FunctionalTest")
	public void search() {
//		// set syste property
//				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//				
//				//Launch browser
//				WebDriver driver=new ChromeDriver();
//				
//				//Maximize the browser
//				driver.manage().window().maximize();
//				
//				//Enable implicit wait
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//				
//				//Navigate to wesite
//				driver.get("https://demowebshop.tricentis.com");
//				
//				driver.findElement(By.id("small-searchterms")).sendKeys("abcd");
//				
//				driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println("Search test");
	}
	
	
	@Test(priority=2, dependsOnMethods = "RegisterTest", groups="SmokeTest")
	public void LoginTest() {
		System.out.println("Login test");
		
	}
	
	@Test(priority = 1, groups ="SmokeTest")
	public void RegisterTest() {
		System.out.println("Register test");
	}
	
	

}
