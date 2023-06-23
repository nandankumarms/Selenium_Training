package DemoWebShop_SystemTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DWS_DD_011 {
	public static void main(String[] args) throws InterruptedException {
		//Set system property
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Launch browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Navigate to demo web shop
		driver.get("https://demowebshop.tricentis.com/");
		
		//Login
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		Thread.sleep(2000);
		
		//Enter email
		driver.findElement(By.xpath("//input[contains(@id,'Email')]")).sendKeys("nandanms1999@gmail.com");
		Thread.sleep(2000);
		
		//Enter password
		driver.findElement(By.xpath("//input[contains(@id,'Password')]")).sendKeys("abcd@1234");
		Thread.sleep(2000);
		
		//Click on login button
		driver.findElement(By.xpath("//input[contains(@value,'Log in')]")).click();
		Thread.sleep(2000);
		
		//Find Digital downloads Tab and click on it.
		driver.findElement(By.xpath("(//a[contains(text(),'Digital download')])[1]")).click();
		Thread.sleep(2000);
		
		//Click on the product or item
		driver.findElement(By.xpath("(//div/a/img[1])[3]")).click();
		Thread.sleep(2000);
		
		//Click on add to cart 
		driver.findElement(By.xpath("//input[@ id='add-to-cart-button-51']")).click();
		Thread.sleep(2000);
		
//		//Display the the success message
//        String successMessage=driver.findElement(By.xpath("//div[@id=\"bar-notification\"]/p")).getText();
//		System.out.println(successMessage);
		
		//Click on shopping cart
		driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
		Thread.sleep(2000);
		
		//Check the terms of service button
		driver.findElement(By.xpath("//input[@ id='termsofservice']")).click();
		
		//click on checkout button
		driver.findElement(By.xpath("//button[@ id='checkout']")).click();
		Thread.sleep(2000);
		
		//Fill adress
		//Select new Address
		WebElement addressDropdown=driver.findElement(By.xpath("//select[@id='billing-address-select']"));
		Select address=new Select(addressDropdown);
		address.selectByVisibleText("New Address");
		Thread.sleep(2000);
		
		//Select country as india
		WebElement countryDropDown=driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
		Select country=new Select(countryDropDown);
		country.selectByValue("41");
		
		//Enter City
		driver.findElement(By.xpath("//input[@ id='BillingNewAddress_City']")).sendKeys("Bangalore");
		
		//Enter address1 
		driver.findElement(By.xpath("//input[@ id='BillingNewAddress_Address1']")).sendKeys("Gopalan coworks");
		
		//Enter postal code
		driver.findElement(By.xpath("//input[@ id='BillingNewAddress_ZipPostalCode']")).sendKeys("560091");
		
		//Enter Phone number
		driver.findElement(By.xpath("//input[@ id='BillingNewAddress_PhoneNumber']")).sendKeys("7090046379");
		
		//Click on continue button
		driver.findElement(By.xpath("//input[@ title='Continue']")).click();
		Thread.sleep(6000);
		
		
		
		//Select payment method as Cash on delivery
		driver.findElement(By.xpath("//input[@ id='paymentmethod_1']")).click();
		Thread.sleep(5000);
		//
		
		//Click on continue
		driver.findElement(By.xpath("(//input[@ value='Continue'])[2]")).click();
		Thread.sleep(6000);
		
		//Display the Payment method
		System.out.println(driver.findElement(By.xpath("//tbody/tr/td/p")).getText());
		Thread.sleep(6000);
		
		//Confirm your payment method by clicking on continue method
		driver.findElement(By.xpath("(//input[@ value='Continue'])[3]")).click();
		Thread.sleep(5000);
		
		//Click on confirm button
		driver.findElement(By.xpath("//input[@ value='Confirm']")).click();
		Thread.sleep(5000);
		
		//Display the confirmation button
		System.out.println(driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']")).getText());
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//li[contains(text(),'Order number')]")).getText());
		Thread.sleep(2000);
		
		//click on continue to complete the ordering process
		driver.findElement(By.xpath("//input[@ value='Continue']")).click();
		Thread.sleep(4000);
		
		
		//Close driver
		driver.close();

	}


}
