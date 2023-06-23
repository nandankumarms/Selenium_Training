package AssignmentsOnWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebShopaAndFacebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//opens browser
		
		driver.manage().window().maximize();//maximize the browser window
		driver.get("https://demowebshop.tricentis.com/");//navigate to website
		
		String parentWindw=driver.getWindowHandle();
		
		System.out.println(parentWindw);
		
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		Thread.sleep(2000);
		
		Set<String> childWindows=driver.getWindowHandles();
		System.out.println(childWindows);
		
		for(String childWindow:childWindows) {
		
			driver.switchTo().window(childWindow);
			Thread.sleep(9000);
			String 	title=driver.getTitle();
			System.out.println(title);
			if(title.contains("Facebook")){
				
				
				driver.close();
				
				
			}

			
		}
	}

}
