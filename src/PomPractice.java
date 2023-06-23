import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomPractice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ShoppingCart shoppingCart=new ShoppingCart(driver);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("nandanms@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("nandan@1234");
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
		driver.findElement(By.partialLinkText("BOOKS")).click();
		
		
		
//		int row=shoppingCart.getTableRowCount();
//		int col=shoppingCart.getColumCount();
		
		//System.out.println(shoppingCart.getAllRowElements());
		//Thread.sleep(2000);
		
		//shoppingCart.getRemoveButton(1).click();
//		System.out.println(shoppingCart.getProductImage(1).getText());
//		
//		
//		
//		System.out.println(shoppingCart.getProductDescription(1).getText());
//		
		

		
		// Get product quantity
//		System.out.println(shoppingCart.getProductPrice(1));
//		System.out.println(shoppingCart.getProductPrice(2));
//		System.out.println(shoppingCart.getProductPrice(3));
//		System.out.println(shoppingCart.getProductPrice(4));
//		
//		
//		
//		shoppingCart.setProductQuantity(1, "4");
//		shoppingCart.setProductQuantity(2, "3");
//		shoppingCart.setProductQuantity(3, "2");
//		shoppingCart.setProductQuantity(4, "1");
		
//		System.out.println(shoppingCart.getTotalPrice(1));
//		System.out.println(shoppingCart.getTotalPrice(2));
//		System.out.println(shoppingCart.getTotalPrice(3));
//		System.out.println(shoppingCart.getTotalPrice(4));
		
		
//		shoppingCart.clickOnItemLink(1);
//		driver.navigate().back();
//		
//		shoppingCart.clickOnItemLink(2);
//		driver.navigate().back();
//		shoppingCart.clickOnItemLink(3);
//		driver.navigate().back();
//		shoppingCart.clickOnItemLink(4);
//		driver.navigate().back();
//		
//		
//		shoppingCart.clickEditLink(1);
//		driver.navigate().back();
//
//		shoppingCart.clickEditLink(2);
//		driver.navigate().back();
//
//		shoppingCart.clickEditLink(3);
//		shoppingCart.clickEditLink(4);
		
		
		//shoppingCart.getRemoveButton(5);
		
		//System.out.println(driver.findElement(By.xpath("//table[@class='cart']/thead")).getText());
		
//		System.out.println(shoppingCart.getSubTotal());
//		System.out.println(shoppingCart.getShippingCharge());
//		System.out.println(shoppingCart.getTax());
//		System.out.println(shoppingCart.getTotalPrice());
		
//		System.out.println(driver.findElement(By.xpath("//table[@class='cart']/thead/tr")).getText());
//		System.out.println(driver.findElement(By.xpath("//table[@class='cart']/tbody/tr")).getText());
		
		
		
		
		
	}

}
