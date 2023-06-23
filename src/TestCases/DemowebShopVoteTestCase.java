package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import framework_utility.BaseTest;

public class DemowebShopVoteTestCase extends BaseTest {

	@Test
	public void demo() {
						
				driver.findElement(By.id("pollanswers-1")).click();
				
				driver.findElement(By.id("vote-poll-1")).click();
				
				
		
}
}
