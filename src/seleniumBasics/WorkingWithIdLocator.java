package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIdLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
//		driver.findElement(By.id("APjFqb")).sendKeys("hi");
//		driver.findElement(By.className("gNO89b")).click();
		driver.findElement(By.name("q")).sendKeys("HI bro");
		//driver.findElement();
	}
	

}
