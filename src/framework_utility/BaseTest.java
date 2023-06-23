package framework_utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
	public WebDriver driver;
	
	@Parameters("URL")
	@BeforeClass
	public void browserSetUp(String url) {
		// set system property
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Launch browser
		 driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Enable implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Url is :   "+url);
		//Navigate to wesite
		driver.get(url);
	}
	
	@AfterClass
	public void BrowserTearDown() {
		driver.close();
	}

}
