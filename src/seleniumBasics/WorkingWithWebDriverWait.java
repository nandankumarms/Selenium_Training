package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithWebDriverWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Create the onject of WebDriverWait class
	//	WebDriverWait wait=new WebDriverWait(driver, 30);
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobies");
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//input[@type='submit'])[1]"))));
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//strong[@ class='result']"))));
		
		
		System.out.println(driver.findElement(By.xpath("//strong[@ class='result']")).getText());
		
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Register"))));
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.quit();
		
	}

}
