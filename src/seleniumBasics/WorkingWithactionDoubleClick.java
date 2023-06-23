package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithactionDoubleClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//opens browser
		
		
		driver.manage().window().maximize();//maximize the browser window
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");//navigate to website
		
//		WebElement elementButton=driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		Actions action=new Actions(driver);
//		action.doubleClick(elementButton).perform();
//		Thread.sleep(2000);
		
		WebElement elementRightClick=driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		
		//Use contextClick() to perform the right click
		action.contextClick(elementRightClick).perform();
		
		//Identify the element
		WebElement elementEdit=driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));
		//Use action class object reference and call the click() method to perform click operation on the element
		action.click(elementEdit).perform();
		
		//Close the browser and 
		driver.quit();
	}

}
