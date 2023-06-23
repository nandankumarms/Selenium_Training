package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithPartialLinkTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.partialLinkText("Reg")).click();
		driver.findElement(By.partialLinkText("oppi")).click();
		driver.findElement(By.partialLinkText("Log")).click();
		
	}

}
