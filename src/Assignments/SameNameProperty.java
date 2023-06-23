package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SameNameProperty {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Nandankumar%20M%20S/Downloads/demo.html");
		
		
		//To enter name in  all Textfields
		List<WebElement> name=driver.findElements(By.xpath("//input[@name='fname']"));
		
		for(int i=0;i<name.size();i++) {
			name.get(i).sendKeys("Nandan");
			//System.out.println(linkName);
		}
		System.out.println("Number of text fields = "+name.size());
		
		
		//To select all checkboxes
		List<WebElement> checkboxe=driver.findElements(By.xpath("//input[@name='download']"));
		
		for(WebElement element:checkboxe) {
			element.click();
		}
		System.out.println("Number of check boxes = "+checkboxe.size());
		
		//To click on on Download Links
		List<WebElement> downloadLinks=driver.findElements(By.xpath("//a[text()='Download']"));
		
		for(WebElement link:downloadLinks) {
			link.click();
		}
		System.out.println("Number of Download link = "+downloadLinks.size());
	}

}
