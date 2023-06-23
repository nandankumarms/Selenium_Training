package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnCssSelector {
	 public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//opens browser
		
		driver.manage().window().maximize();//maximize the browser window
		driver.get("https://demowebshop.tricentis.com/");//navigate to website
//		driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("Computer");//search for element  Search bar and type Computer
//		driver.findElement(By.cssSelector("input[value='Search']")).click();// search for webelement search button and click on it
		driver.findElement(By.name("q")).sendKeys("ansn");
		//driver.findElement(By.cssSelector(null))
	}

}
