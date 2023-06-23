package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithHiddenElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//opens browser
		
		
		driver.manage().window().maximize();//maximize the browser window
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");//navigate to website
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement scroll=driver.findElement(By.xpath("//legend[text()='Element Displayed Example']"));
		jse.executeScript("arguments[0].scrollIntoView(true)", scroll);
		
		
		driver.findElement(By.id("hide-textbox")).click();
		
		Thread.sleep(2000);
		
		WebElement dwe=driver.findElement(By.id("displayed-text"));
		jse.executeScript("arguments[0].value='Hello';", dwe);
		Thread.sleep(2000);
		
		

		
		driver.findElement(By.id("show-textbox")).click();
		
		
	}

}
