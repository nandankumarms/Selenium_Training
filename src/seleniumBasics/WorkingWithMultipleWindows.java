package seleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithMultipleWindows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//opens browser
		
		driver.manage().window().maximize();//maximize the browser window
		driver.get("file:///C:/Users/Nandankumar%20M%20S/Downloads/MultipleWindow.html");//navigate to website
		
		String parentWindow=driver.getWindowHandle();
		
		driver.findElement(By.cssSelector("input[ type='button']")).click();
		Thread.sleep(2000);
		
		Set<String> child_Windows=driver.getWindowHandles();
		System.out.println(child_Windows);
		for(String childWindow:child_Windows) {
			driver.switchTo().window(childWindow);
//			driver.get
//			driver.close();
			Thread.sleep(2000);
			
		}
		
		
	}

}
