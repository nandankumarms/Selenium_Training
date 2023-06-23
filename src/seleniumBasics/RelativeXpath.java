package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@ class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@ id='gender-male']")).click();
		
		driver.findElement(By.xpath("//input[@ id='FirstName']")).sendKeys("Nnadan");
		
		driver.findElement(By.xpath("//input[@ id='LastName']")).sendKeys("M S");
		
		driver.findElement(By.xpath("//input[@ id='Email']")).sendKeys("nandan@gmail.com");
		
		driver.findElement(By.xpath("//input[@ id='Password']")).sendKeys("Nandan@1618");
		
		driver.findElement(By.xpath("//input[@ id='ConfirmPassword']")).sendKeys("Nandan@1618");
		
		driver.findElement(By.xpath("//input[@ id='register-button']")).click();
		
		String message=driver.findElement(By.xpath("//li[text()='The specified email already exists']")).getText();
		System.out.println(message);
		
		driver.navigate().back();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//input[@ id='pollanswers-1']")).click();
		
		driver.findElement(By.xpath("//input[@ id='vote-poll-1']")).click();
		
		String errorMessage=driver.findElement(By.xpath("//div[ @ id='block-poll-vote-error-1']")).getText();
		System.out.println(errorMessage);
		
		
		
		
		
	}

}
