package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnSelectOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");// Set System Property for Chrome Driver.
		WebDriver driver=new ChromeDriver();// This line will launch the browser.
		driver.get("file:///C:/Users/Nandankumar%20M%20S/Downloads/demo.html");
		
		//Identify the select tag web element
		WebElement cars=driver.findElement(By.id("standard_cars"));
		
		//create an object of select class and pass web element argumnet
		Select select=new Select(cars);
		//Thread.sleep(1000);
          List<WebElement> car=select.getOptions();
          
          for(WebElement carsName:car) {
        	  System.out.println(carsName.getText());
          }
	}	
	
}
