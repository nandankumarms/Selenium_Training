package TestNGBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingWithThreadPoolSize {
	/*
	 * First 5 Threads will be used to run the test at once,
	 *  whenever one thread completes execution. it will execute the test again. this will continue till the completion of al the tests. 
	 */
	@Test(threadPoolSize = 5,invocationCount = 10, groups = "FuncionalTest")// Run this test for times. use 5 threads to run test.
	public void DemoWebShop() {
		// set syste property
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				
				//Launch browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				//Enable implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//Navigate to wesite
				driver.get("https://demowebshop.tricentis.com");
				
				driver.close();
	}
	
	@Test(groups = "SmokeTest")
	public void a() {
		System.out.println("executing a");
	}
	
	@Test(groups = "SmokeTest")
	public void A() {
		System.out.println("Executing A");
	}

}
