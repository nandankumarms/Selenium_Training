package seleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFindElements {
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("nandanms@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("nandan@1234");
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
//		List<WebElement>book_List=driver.findElements(By.xpath("//a[contains(text(),'books')]"));
//		
//		for(int i=0;i<book_List.size();i++) {
//			String book=book_List.get(i).getText();
//			
//			System.out.println(book);
//			
//		}
//		System.out.println(book_List.size());
//		driver.quit();
//	
	
//	List<WebElement> recentlyViewedProducts = driver.findElements(By.xpath("//div[@class='block block-recently-viewed-products']//ul[@class='list']/li"));
//	if(recentlyViewedProducts.size()>0) {
//	for(WebElement recentProducts: recentlyViewedProducts) {
//		System.out.println(recentProducts.getTagName());
//		System.out.println(recentProducts.getText());
//	}
//	}
//	else {
//		System.out.println("No products to display");
//	}
	
	
	
	driver.findElement(By.xpath("(//a[@class='ico-cart'])[1]")).click();
	
	
	
	// Dynamic table elements
//	List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='cart']/tbody/tr"));
//	
//	for(WebElement row:tableRows) {
//		System.out.println(tableRows.size());
//		System.out.println(row.getTagName());
//		System.out.println(row.getText());
//	}
	
	
	
	
	}
	
	
	
	

}
