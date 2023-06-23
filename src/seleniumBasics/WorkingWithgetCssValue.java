package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithgetCssValue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String cssColor=driver.findElement(By.partialLinkText("Books")).getCssValue("color");
				System.out.println(cssColor);
				
				String fontSize=driver.findElement(By.partialLinkText("Books")).getCssValue("font-size");
				System.out.println(fontSize);
	}

}
