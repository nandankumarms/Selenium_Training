package TestNGBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningSoftAssert {
	@Test
	public void WorkingOnSoftAssert() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		// To use SoftAssert we have to create object of SoftAssert class(assert is keyword you can not use it)
		SoftAssert sassert=new SoftAssert();
		sassert.assertEquals(driver.getTitle(), "Demo Web Shop");
		
		sassert.assertEquals(driver.getTitle(), "Demo  Shop");
		sassert.assertAll();
		driver.close();
	}

}
