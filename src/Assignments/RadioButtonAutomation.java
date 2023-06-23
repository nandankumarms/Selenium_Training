package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAutomation {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	List<WebElement> radioButtons=driver.findElements(By.xpath("//input[@type='radio']"));
	
	for(int i=0;i<radioButtons.size();i++) {
		radioButtons.get(i).click();
	}
	//Thread.sleep(1000);
}

}
