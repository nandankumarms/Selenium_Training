package javascript_executor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithJavascriptExecutor {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//opens browser
		
		
		driver.manage().window().maximize();//maximize the browser window
		driver.get("https://www.zomato.com/india");//navigate to website
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
//		jse.executeScript("window.scrollBy(0,700)");
//		Thread.sleep(2000);
//		jse.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(2000);
//		
//		jse.executeScript("window.scrollTo(0,300);");
//		
//		Thread.sleep(2000);
//		jse.executeScript("window.scrollTo(0,400)");
		
		List<WebElement> country=driver.findElements(By.xpath("//div[@class='sc-bke1zw-0 fIuLDK']/div"));
		WebElement cc=country.get(108);
				
		// Scroll till the specified element is present
		jse.executeScript("arguments[1].scrollIntoView(true);", country,cc);
		
	}

}
