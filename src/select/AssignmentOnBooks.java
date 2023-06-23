package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnBooks {
	public static void main(String[] args) throws InterruptedException {
		// Set the system property
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Launch chrome browser
		WebDriver driver=new ChromeDriver();//opens browser
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//navigate to website
		driver.get("https://demowebshop.tricentis.com/");
		
		//Identify the element and call the method to perform action on it.
		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(2000);
		
		//Find the dropdown which is inside <select> tag
		WebElement positions=driver.findElement(By.id("products-orderby"));
		
		//Create Object of Select Class
		Select selectOptions=new Select(positions);
	
		//Select the option using methods of Select class
		selectOptions.selectByVisibleText("Name: A to Z");
		selectOptions.deselectByVisibleText("Name: A to Z");
		Thread.sleep(2000);
		
		WebElement display=driver.findElement(By.id("products-pagesize"));
		Select selectDiplay=new Select(display);
		selectDiplay.selectByIndex(2);
		Thread.sleep(2000);
		
		WebElement viewAs=driver.findElement(By.id("products-viewmode"));
		Select selectViewAs=new Select(viewAs);
		selectViewAs.selectByIndex(1);
		
		//Wait for 2 seconds 
		Thread.sleep(2000);
		driver.close();
		
	}

}
