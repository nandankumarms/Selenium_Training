package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getPageSource());
//		driver.manage().window().maximize();
		
		driver.findElement(By.className("search-box-text ui-autocomplete-input")).click();

	}

}
