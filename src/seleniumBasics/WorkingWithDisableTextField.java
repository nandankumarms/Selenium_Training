package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDisableTextField {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//opens browser
		
		
		driver.manage().window().maximize();//maximize the browser window
		driver.get("https://demoapp.skillrary.com/index.php");//navigate to website
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		WebElement dwe=driver.findElement(By.xpath("//input[@class='form-control']"));
		jse.executeScript("arguments[0].value='Hello';", dwe);
	}

}
