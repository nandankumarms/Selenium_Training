package AssignmentsOnWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebShopAndFaceBookandWebSearch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//opens browser
		
		driver.manage().window().maximize();//maximize the browser window
		driver.get("https://demowebshop.tricentis.com/");//navigate to website
		
		String parentWindw=driver.getWindowHandle();
		String parentTitle=driver.getTitle();
		System.out.println(parentWindw);
		
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		Thread.sleep(2000);
		
		Set<String> childWindows=driver.getWindowHandles();
		System.out.println(childWindows);
		
		for(String childWindow:childWindows) {
			driver.switchTo().window(childWindow);
			if(!(driver.getTitle().equals(parentTitle))){
				driver.switchTo().window(childWindow);
				Thread.sleep(2000);
				driver.close();
				}

}
		
		driver.switchTo().window(parentWindw);
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
	}
}
