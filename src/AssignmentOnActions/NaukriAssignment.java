package AssignmentOnActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NaukriAssignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naukri.com");
		
		driver.manage().window().maximize();
		
		WebElement elementJobs=driver.findElement(By.xpath("(//div[contains(text(),'Jobs')])[1]"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(elementJobs).build().perform();
		
		WebElement elementJobsBySkill=driver.findElement(By.xpath("(//div[contains(text(),'Jobs by skill')])[1]"));
		
		action.moveToElement(elementJobsBySkill).click().perform();
		
		WebElement elementJavaJobs=driver.findElement(By.xpath("(//a[contains(text(),'Java Jobs')])[1]"));
		
		action.moveToElement(elementJavaJobs).click().perform();
	}

}
