package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAndClose {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//Insatantiate the browser specific clas
		WebDriver driver=new ChromeDriver();
		//Pass the main url of application
		driver.get("https://demoqa.com/browser-windows");
		//Identify the window button
		WebElement newwindowbutton=driver.findElement(By.id("windowButton"));
		newwindowbutton.click();
		System.out.println("NEW WINDOW OPENED SUCCESSFULLY.....");
		//driver.close();
		driver.quit();
	}

}
