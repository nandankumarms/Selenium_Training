package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithgetText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		
		
		String text=driver.findElement(By.id("small-searchterms")).getAttribute("value");
		System.out.println(text);
		
		driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
		
String s2=driver.findElement(By.id("small-searchterms")).getAttribute("value");
		System.out.println(s2);
	}

}
