package DemoWebShop_SystemTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DWS_DD_007 {
	public static void main(String[] args) throws InterruptedException {
		//Set system property
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Launch browser
		WebDriver driver=new ChromeDriver();
		//WebDriverWait
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Navigate to demo web shop
		driver.get("https://demowebshop.tricentis.com/");
		
		//Login
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		//Thread.sleep(2000);
		
		//Enter email
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[contains(@id,'Email')]"))));
		driver.findElement(By.xpath("//input[contains(@id,'Email')]")).sendKeys("nandanms1999@gmail.com");
		//Thread.sleep(2000);
		
		//Enter password
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[contains(@id,'Password')]"))));
		driver.findElement(By.xpath("//input[contains(@id,'Password')]")).sendKeys("abcd@1234");
		//Thread.sleep(2000);
		
		//Click on login button
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[contains(@value,'Log in')]"))));
		driver.findElement(By.xpath("//input[contains(@value,'Log in')]")).click();
		//Thread.sleep(2000);
		
		//Find Digital downloads Tab and click on it.
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//a[contains(text(),'Digital download')])[1]"))));
		driver.findElement(By.xpath("(//a[contains(text(),'Digital download')])[1]")).click();
		//Thread.sleep(2000);
		
		//Click on the product or item
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//div/a/img[1])[3]"))));
				driver.findElement(By.xpath("(//div/a/img[1])[3]")).click();
				//Thread.sleep(2000);
				
				//Click on add to cart 
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@ id='add-to-cart-button-53']")));
				driver.findElement(By.xpath("//input[@ id='add-to-cart-button-53']")).click();
				//Thread.sleep(2000);
		
//		//Display the the success message
//        String successMessage=driver.findElement(By.xpath("//div[@id=\"bar-notification\"]/p")).getText();
//		System.out.println(successMessage);
		
		//Click on shopping cart
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]"))));	
		driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
		//Thread.sleep(2000);
		
		//Check the terms of service button
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@ id='termsofservice']"))));
		driver.findElement(By.xpath("//input[@ id='termsofservice']")).click();
		
		//click on checkout button
		
		driver.findElement(By.xpath("//button[@ id='checkout']")).click();
		//Thread.sleep(2000);
		
		//Fill adress
		//Select existing Address
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='billing-address-select']")));
				WebElement addressDropdown=driver.findElement(By.xpath("//select[@id='billing-address-select']"));
				Select address=new Select(addressDropdown);
				address.selectByIndex(0);
				//Thread.sleep(2000);
				
		//Click on continue button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@ title='Continue']")));		
		driver.findElement(By.xpath("//input[@ title='Continue']")).click();
		//Thread.sleep(6000);
		
		
		
		//Select payment method as Cash on delivery
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@ id='paymentmethod_1']")));
		driver.findElement(By.xpath("//input[@ id='paymentmethod_1']")).click();
		//Thread.sleep(5000);
		//
		
		//Click on continue
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@ value='Continue'])[2]")));
		driver.findElement(By.xpath("(//input[@ value='Continue'])[2]")).click();
	//	Thread.sleep(6000);
		
		//Display the Payment method
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr/td/p")));
		System.out.println(driver.findElement(By.xpath("//tbody/tr/td/p")).getText());
		//Thread.sleep(6000);
		
		//Confirm your payment method by clicking on continue method
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@ value='Continue'])[3]")));
		driver.findElement(By.xpath("(//input[@ value='Continue'])[3]")).click();
		//Thread.sleep(5000);
		
		//Click on confirm button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@ value='Confirm']")));
		driver.findElement(By.xpath("//input[@ value='Confirm']")).click();
		//Thread.sleep(5000);
		
		//Display the confirmation button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()='Your order has been successfully processed!']")));
		System.out.println(driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']")).getText());
		//Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//li[contains(text(),'Order number')]")).getText());
		//Thread.sleep(2000);
		
		//click on continue to complete the ordering process
		driver.findElement(By.xpath("//input[@ value='Continue']")).click();
		//Thread.sleep(4000);
		
		
		//Close driver
		driver.close();

	}


}
