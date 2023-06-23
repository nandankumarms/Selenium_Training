package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
//	driver.get("file:///C:/Users/Nandankumar%20M%20S/Downloads/xpath1.html");
//	
//	driver.manage().window().maximize();
//	
//	driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("Nandan");
//	driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys(" M S");
//	driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("TYSS");
//	driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("Bangalore");
	
	
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[1]")).click();// Done by copying the address
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();// done manually
}
}
