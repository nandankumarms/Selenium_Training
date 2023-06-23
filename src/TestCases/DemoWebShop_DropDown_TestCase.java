package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import framework_utility.BaseTest;

public class DemoWebShop_DropDown_TestCase extends BaseTest{
	@Test
	public void dropdown() {
		
		
		//click on book
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		
		//find the sort by drop down on the web page
		WebElement sortBy=driver.findElement(By.id("products-orderby"));
		
		// select  the 3rd option present in the dropdown.
		Select select=new Select(sortBy);
		select.selectByIndex(2);
		
		
	}

}
