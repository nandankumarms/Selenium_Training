package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Adding Chroome driver to the project.
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Creating the object of ChromeDriver class and upcasting it the WebDriver Interface
		WebDriver driver=new ChromeDriver();// Browser will get opened when this line is executed.
		
		//Navigating to website
		driver.get("https://demowebshop.tricentis.com/");
		
		//Finding the iperlink with name Register and clicking on that
		driver.findElement(By.linkText("Register")).click();
		
		//Finding element Male button and clicking on it.
		driver.findElement(By.id("gender-male")).click();
		
		//Finding the web element First name text field and sending sending characterss
		driver.findElement(By.id("FirstName")).sendKeys("NandanKumar");
		driver.findElement(By.id("LastName")).sendKeys("M S");
		driver.findElement(By.id("Email")).sendKeys("nandankumarms31@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Nandan@1618");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Nandan@1618");
		driver.findElement(By.id("register-button")).click();
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("nandankumarms31@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Nandan@1618");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();

	}

}
