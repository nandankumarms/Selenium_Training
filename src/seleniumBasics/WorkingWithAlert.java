package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class WorkingWithAlert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//opens browser
		
		
		driver.manage().window().maximize();//maximize the browser window
		 Actions action=new Actions(driver);
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClick=driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		
		action.contextClick(rightClick).perform();
				
				
		List<WebElement> buttons = driver.findElements(By.xpath("//li/span"));
		
		
		for(WebElement element:buttons) {
			action.contextClick(rightClick).perform();
			action.moveToElement(element).click().perform();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			
		}
		
		driver.close();
		
	}

}
