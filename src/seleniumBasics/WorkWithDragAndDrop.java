package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class WorkWithDragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//opens browser
		
		
		driver.manage().window().maximize();//maximize the browser window
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");//navigate to website
		
		Actions action=new Actions(driver);
		
		// By using Id's
//		action.dragAndDrop(driver.findElement(By.id("box1")), driver.findElement(By.id("box101"))).perform();
//		action.dragAndDrop(driver.findElement(By.id("box2")), driver.findElement(By.id("box102"))).perform();
//		action.dragAndDrop(driver.findElement(By.id("box3")), driver.findElement(By.id("box103"))).perform();
//		action.dragAndDrop(driver.findElement(By.id("box4")), driver.findElement(By.id("box104"))).perform();
//		action.dragAndDrop(driver.findElement(By.id("box5")), driver.findElement(By.id("box105"))).perform();
//		action.dragAndDrop(driver.findElement(By.id("box6")), driver.findElement(By.id("box106"))).perform();
//		action.dragAndDrop(driver.findElement(By.id("box7")), driver.findElement(By.id("box107"))).perform();
//		
//		
//		action.dragAndDrop(driver.findElement(By.id("box101")), driver.findElement(By.id("dropContent"))).perform();
//		action.dragAndDrop(driver.findElement(By.id("box102")), driver.findElement(By.id("dropContent"))).perform();
//		action.dragAndDrop(driver.findElement(By.id("box103")), driver.findElement(By.id("dropContent"))).perform();
//		action.dragAndDrop(driver.findElement(By.id("box104")), driver.findElement(By.id("dropContent"))).perform();
//		action.dragAndDrop(driver.findElement(By.id("box105")), driver.findElement(By.id("dropContent"))).perform();
//		action.dragAndDrop(driver.findElement(By.id("box106")), driver.findElement(By.id("dropContent"))).perform();
//		action.dragAndDrop(driver.findElement(By.id("box107")), driver.findElement(By.id("dropContent"))).perform();
//		
//		driver.navigate().refresh();
		
		//By using Xpath's
		action.dragAndDrop(driver.findElement(By.xpath("(//div[contains(text(),'Oslo')])[2]")), driver.findElement(By.xpath("//div[contains(text(),'Norway')]"))).perform();
		action.dragAndDrop(driver.findElement(By.xpath("(//div[contains(text(),'Rome')])[2]")), driver.findElement(By.xpath("//div[contains(text(),'Italy')]"))).perform();
		action.dragAndDrop(driver.findElement(By.xpath("(//div[contains(text(),'Seoul')])[2]")), driver.findElement(By.xpath("(//div[contains(text(),'South')])"))).perform();
		action.dragAndDrop(driver.findElement(By.xpath("(//div[contains(text(),'Copenha')])[2]")), driver.findElement(By.xpath("(//div[contains(text(),'Denmark')])"))).perform();
		action.dragAndDrop(driver.findElement(By.xpath("(//div[contains(text(),'Madrid')])[2]")), driver.findElement(By.xpath("(//div[contains(text(),'Spain')])"))).perform();
		action.dragAndDrop(driver.findElement(By.xpath("(//div[contains(text(),'Washington')])[2]")), driver.findElement(By.xpath("(//div[contains(text(),'United')])"))).perform();
		action.dragAndDrop(driver.findElement(By.xpath("(//div[contains(text(),'Stockholm')])[2]")), driver.findElement(By.xpath("(//div[contains(text(),'Sweden')])"))).perform();
		
		driver.quit();
	}

}
