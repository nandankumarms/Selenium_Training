package seleniumBasics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ElementScreenShot {public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	
	
	
	WebElement loginLink = driver.findElement(By.partialLinkText("Log"));
	
	//Taking webelement screenshot( it will work only for 3.141.59 onwards only)
	File temp=loginLink.getScreenshotAs(OutputType.FILE);
	
	
	//Crete file and paste the image in the folder
	File dest=new File("./ScreenShots/WebElementscreenshot.jpg");
	
	//Copy the image into your folder in the project
	FileHandler.copy(temp, dest);
	
	driver.close();
	//List<WebElement> radioButtons=driver.findElements(By.xpath("//input[@type='radio']"));
}


}
