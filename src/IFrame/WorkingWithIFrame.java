package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithIFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//opens browser
		
		
		driver.manage().window().maximize();//maximize the browser window
		 Actions action=new Actions(driver);
		
		driver.get("file:///C:/Users/Nandankumar%20M%20S/Downloads/iframe.html");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Google")).click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
