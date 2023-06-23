package Yatra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YatraBookingTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.yatra.com/");
		
		driver.findElement(By.xpath("//span[text()='Buses']")).click();
		
		driver.findElement(By.id("BE_bus_from_station")).click();
		

		
		List<WebElement> fromPoint = driver.findElements(By.xpath("//div[@class='viewport']/div/div/li"));
		
		for(WebElement from:fromPoint) {
			System.out.println(from.getText());
			if(from.getText().equalsIgnoreCase("Bangalore, Karnataka")) {
				from.click();
				break;
				
			}
		}
			
		
		List<WebElement> toPoint = driver.findElements(By.xpath("//div[@class='viewport']/div/div/li"));
			for(WebElement to:toPoint) {
				System.out.println(to.getText());
				if(to.getText().equalsIgnoreCase("Pune, Maharashtra")) {
					to.click();
					break;
					
				}
		
		}
		
	}

}
