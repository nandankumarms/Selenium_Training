package AssignmentOnActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebShopAssignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//opens browser
		
		
		driver.manage().window().maximize();//maximize the browser window
		driver.get("https://demowebshop.tricentis.com/");//navigate to website
		
		//find the web element
		WebElement elementElectronics=driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(elementElectronics).build().perform();
		
		WebElement elementCamera=driver.findElement(By.xpath("(//a[contains(text(),'Camera')])[1]"));
		
		action.moveToElement(elementCamera).click().perform();
	}

}
