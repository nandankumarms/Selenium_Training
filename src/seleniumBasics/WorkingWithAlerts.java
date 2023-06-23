package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithAlerts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//opens browser
		
		
		driver.manage().window().maximize();//maximize the browser window
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");//navigate to website
		
		//Find the element
		WebElement doubleClickButton=driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		
		//Create object of Action class and pass driver instance.
		Actions action=new Actions(driver);
		
		//move mouse to the specified web element
		action.doubleClick(doubleClickButton).perform();
		Thread.sleep(2000);
		
		//Move to alert and handle
		driver.switchTo().alert().accept();
		
		//Navigate to website
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		//Find the element
		driver.findElement(By.name("cusid")).sendKeys("1234");
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClick = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		
		//Edit
		action.contextClick(rightClick).perform();
		driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		//Cut
        action.contextClick(rightClick).perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'Cut')]")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		//Copy
        action.contextClick(rightClick).perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'Copy')]")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//Paste
        action.contextClick(rightClick).perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		//Delete
        action.contextClick(rightClick).perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'Delete')]")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		//Quit
        action.contextClick(rightClick).perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'Quit')]")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//Close Browser
		driver.close();
		
	}
	

}
