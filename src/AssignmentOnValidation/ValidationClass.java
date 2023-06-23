package AssignmentOnValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Navigate to website
		driver.get("https://demowebshop.tricentis.com/");
		
		//Find Register Button and click on it
		driver.findElement(By.partialLinkText("Register")).click();
		
		//Check weather the gender button is selected or not.
		
		//Find element(textfield) Male radio button select
		driver.findElement(By.id("gender-male")).click();
		
		//Validate weather the male button is selected or not
		System.out.println("Male button is displayed- "+driver.findElement(By.id("gender-male")).isDisplayed());
		
		//check if the male button is selected
		System.out.println("Male button is selected- "+driver.findElement(By.id("gender-male")).isSelected());
		
		//Find element Firstname text field and enter your name
		driver.findElement(By.id("FirstName")).sendKeys("Nandan");
		
		//Validate the name text field(displayed, value is inserted or not)
		driver.findElement(By.id("FirstName")).isDisplayed();
		
		System.out.println( driver.findElement(By.id("FirstName")).getAttribute("value"));
		
		//Find element last name and enter your last name
		driver.findElement(By.id("LastName")).sendKeys("M S");
		
		//Validate the password text field whether displayed, and display the value present in it.
		driver.findElement(By.id("LastName")).isDisplayed();
		String lastName=driver.findElement(By.id("LastName")).getAttribute("value");
		//Display last name on the console.
		System.out.println(lastName);
		
		//Find the element email and enter email address
		driver.findElement(By.id("Email")).sendKeys("a@gmail.com");
		
		//Validate email text field
		driver.findElement(By.id("Email")).isDisplayed();
		String email=driver.findElement(By.id("Email")).getAttribute("value");
		System.out.println(email);
		
		//Find the password text field and enter password according the condition
		driver.findElement(By.id("Password")).sendKeys("abcd@12340");
		
		//Validate the password text field
		String password=driver.findElement(By.id("Password")).getAttribute("value");
		System.out.println("Passsword : "+password);
		
		//Find the confirm password text field and retype the password as above
		driver.findElement(By.id("ConfirmPassword")).sendKeys("abcd@12340");
		
		//Validate the confirm password text field
		String confirm_password=driver.findElement(By.id("ConfirmPassword")).getAttribute("value");
		System.out.println("confirm password"+ confirm_password);
		
		//Search for Register button and click
		driver.findElement(By.id("register-button")).click();
		
		//Validate the Register button
		driver.findElement(By.id("register-button")).isDisplayed();
		System.out.println("enabled "+driver.findElement(By.id("register-button")).isEnabled());
		System.out.println("Selected "+driver.findElement(By.id("register-button")).isSelected());
		
		//Go back to home page
	    //driver.navigate().back();
	    
	    //Search for text field in NEWSLETTER and enter gmail in that text field
	    driver.findElement(By.id("newsletter-email")).sendKeys("a@gmail.com");
	    String newsletterEmail=driver.findElement(By.id("newsletter-email")).getAttribute("value");
	    System.out.println(newsletterEmail);
	    
	    //Search for Subscriber button and click on that
	    driver.findElement(By.id("newsletter-subscribe-button")).click();
	    
	    //Validate the subscribe button
	    Boolean iSButtonClicked=driver.findElement(By.id("newsletter-subscribe-button")).isEnabled();
	    
		//Go back to previous window
	    driver.navigate().back();
	    
	    // Search for community poll and select any radio button
	    driver.findElement(By.id("pollanswers-1")).click();
	    
	    //validate the button whether it is clicked or not.
	    boolean isSelected=driver.findElement(By.id("pollanswers-1")).isSelected();
		System.out.println(isSelected);
		
		
		//search for vote button and click on that
		driver.findElement(By.id("vote-poll-1")).click();
		
		
		
	}

}
