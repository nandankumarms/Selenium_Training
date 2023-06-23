package TestNGBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Working_with_parameters {
	
	@Parameters("URL")
	@Test
	public void parameter_demo(String url)
	{
		// set system property
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				//Launch browser
				 driver=new ChromeDriver();
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				//Enable implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				System.out.println(url);
				//Navigate to wesite
				driver.get(url);
				
				driver.quit();
	}
}
