package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithActions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//opens browser
		
		
		driver.manage().window().maximize();//maximize the browser window
		driver.get("https://demowebshop.tricentis.com/");//navigate to website
		
		//Find the element
		WebElement elementComputer=driver.findElement(By.xpath("//a[contains(text(),'Computer')]"));
		
		//Create object of Action class and pass driver instance.
		Actions action=new Actions(driver);
		
		//move mouse to the specified web element
		action.moveToElement(elementComputer).build().perform();
		
		
		//move mouse to the specified webelement and clickon it.
		action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"))).click().perform();
		
		//Searchbox automation using Actions class
		WebElement searchBoxElement=driver.findElement(By.id("small-searchterms"));
		
		action.moveToElement(searchBoxElement).click().sendKeys("Mobiles");
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_UP).perform();
		
		
		
		//Doubleclick action
		
		
	}

}
