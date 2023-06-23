import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalendor {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naukri.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Nandankumar%20M%20S/Desktop/Software%20Engineering/all-ui-elements-web-main/allUIElements.html");
		driver.findElement(By.xpath("//input[@type='datetime-local']")).click();
		driver.switchTo().alert();
		
	}

}
