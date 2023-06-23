package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignentOnItemPresent {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//opens browser
		
		
		driver.manage().window().maximize();//maximize the browser window
		driver.get("https://demowebshop.tricentis.com/");//navigate to website
		
		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(2000);
		
		//Identify the webelement
		WebElement positions=driver.findElement(By.id("products-orderby"));
		
		String str="Name: A to Z";
		Select select=new Select(positions);
		
		//get the list of webelements
		List<WebElement> listOfOptions=select.getOptions();
		
		//check whether the text is same or not and print the index of the option which matches  the given String.
		for(int i=0;i<listOfOptions.size();i++) {
//			WebElement position=driver.findElement(By.id("products-orderby"));
//			Select selectOption=new Select(positions);
			
			if(listOfOptions.get(i).getText().equals(str)) {
				select.selectByIndex(i);
				System.out.println("the index is :"+i);
				break;
			}
			Thread.sleep(1000);
			
		}
		
		
	}

}
