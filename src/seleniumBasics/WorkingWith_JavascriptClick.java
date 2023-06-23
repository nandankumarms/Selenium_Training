package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWith_JavascriptClick {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Launch chrome browser
		WebDriver driver=new ChromeDriver();
		
		// Use implicitlyWait for synchronization
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Navigate to website
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		
		//Scroll by 1000 pixels using JavaScriptExecutor method
		
		driver.findElement(By.partialLinkText("jdk-8u371-linux-aarch64.rpm")).click();
		
		WebElement button=driver.findElement(By.partialLinkText("Download jdk-8u371-linux-aarch64.rpm"));
		//Typecast the driver reference to JavaScriptExecutor type
		JavascriptExecutor je=(JavascriptExecutor) driver;
		
		// Scroll by 1000 pixels
		je.executeScript("arguments[0].click();", button);
	}

}
