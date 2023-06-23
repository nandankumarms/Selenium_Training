package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnSortBy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//opens browser
		
		
		driver.manage().window().maximize();//maximize the browser window
		driver.get("https://demowebshop.tricentis.com/");//navigate to website
		
		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(2000);
		
		WebElement positions=driver.findElement(By.id("products-orderby"));
		Select selectOptions=new Select(positions);
		List<WebElement> sortBy=selectOptions.getOptions();
		
		for(WebElement position:sortBy) {
			System.out.println(position.getText());
		}
	}

}
