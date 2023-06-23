package seleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithBrowserMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://www.google.co.in");
	driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in");
		Thread.sleep(3000);
		driver.navigate().to("https://www.autocarindia.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		//Thread.sleep(3000);
		driver.close();// we can also use driver.quit(); quit will close only the main browser.
		//driver.quit();
	}

}
