package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import framework_utility.BaseTest;

public class DemoWebShop_FollowUs_TestCase  extends BaseTest{
	@Test
	public void followUs() {
				
	List<WebElement>	followUsOn=driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li"));
		
	for(WebElement follow:followUsOn) {
		
	  System.out.println(follow.getText());
	}
	
	
	}

}
