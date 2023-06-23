package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import framework_utility.BaseTest;

public class DemoWebShop_Electronics_TestCase extends BaseTest{
	
	@Test
	public void elctronics() throws InterruptedException  {
				
		//Mouse hover on the electronics link
		WebElement electronics=driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
		Actions action=new Actions(driver);
		
		action.moveToElement(electronics).perform();
		
		
		//Click on cell phone link after hovering mouse on electronics
		driver.findElement(By.xpath("(//a[contains(text(),'Cell phones')])[1]")).click();
		
		driver.findElement(By.xpath("(//input[contains(@value,'Add to cart')])[1]")).click();
		
		System.out.println(driver.findElement(By.xpath("//p[1]")).getText());
		
		
		
		
		
		
	}

}
