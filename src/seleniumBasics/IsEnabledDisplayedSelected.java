package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledDisplayedSelected {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		String text=driver.findElement(By.partialLinkText("Register")).getCssValue("color");
		
	System.out.println(text);
	
	System.out.println(driver.findElement(By.id("pollanswers-1")).isSelected());
	System.out.println(driver.findElement(By.id("pollanswers-1")).isEnabled());
	
	driver.findElement(By.id("pollanswers-1")).click();
	System.out.println(driver.findElement(By.id("pollanswers-1")).isDisplayed());
	System.out.println(driver.findElement(By.id("pollanswers-1")).isSelected());
	
	System.out.println(driver.findElement(By.id("pollanswers-1")).isEnabled());
	
	//System.out.println(driver.getPageSource());
	}
	
	

	

}
