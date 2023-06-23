package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnSortByIndex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//opens browser
		
		
		driver.manage().window().maximize();//maximize the browser window
		driver.get("https://demowebshop.tricentis.com/");//navigate to website
		
		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(2000);
		
		
		WebElement positions=driver.findElement(By.id("products-orderby"));
		
		Select selectOption=new Select(positions);
		List<WebElement> sizeOfOptions=selectOption.getOptions();
		
	    
		for(int i=0; i<sizeOfOptions.size();i++) {
			WebElement position=driver.findElement(By.id("products-orderby"));
			Select selectOptions=new Select(position);
			Thread.sleep(2000);
			selectOptions.selectByIndex(i);
			
			
		}
	}

}
