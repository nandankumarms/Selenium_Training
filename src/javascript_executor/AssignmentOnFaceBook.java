package javascript_executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnFaceBook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		
		JavascriptExecutor je=(JavascriptExecutor) driver;
		
		WebElement optionalGender = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		
		je.executeScript("arguments[0].value='Hello';", optionalGender);
		 
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
		
	}

}
