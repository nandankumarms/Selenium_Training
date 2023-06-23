package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalNumberOfLinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		
		for(int i=0;i<links.size();i++) {
			String linkName=links.get(i).getText();
			System.out.println(linkName);
		}
		System.out.println("Total Number of links in demo web shop"+links.size());
	}

}
