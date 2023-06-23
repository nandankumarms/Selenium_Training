package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithSelectClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");// Set System Property for Chrome Driver.
		WebDriver driver=new ChromeDriver();// This line will launch the browser.
		driver.get("file:///C:/Users/Nandankumar%20M%20S/Downloads/demo.html");
		
		//Identify the select tag web element
		WebElement cars=driver.findElement(By.id("standard_cars"));
		
		//create an object of select class and pass web element argumnet
		Select select=new Select(cars);
		Thread.sleep(1000);
		
		//use select class methods to select the options present in dropdown
		select.selectByVisibleText("BMW");
		Thread.sleep(1000);
		select.selectByValue("aud");
		Thread.sleep(1000);
		select.selectByIndex(5);
		System.out.println(select.isMultiple());
//		driver.close();
		
		
		
	}

}
