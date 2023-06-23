package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependantXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//input[contains(@id,'small')]/preceding-sibling::span/following-sibling::input")).sendKeys("Mobiles");
driver.findElement(By.xpath("//input[contains(@id,'small')]/preceding-sibling::span/following-sibling::input/following-sibling::input")).click();
	}

}
