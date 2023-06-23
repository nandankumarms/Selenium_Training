import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
	private WebDriver driver; 
	public ShoppingCart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Get table header
	@FindBy(xpath = "//table[@class='cart']/thead")
	private WebElement header;
	
	public String getHeader() {
		return header.getText();
	}
	
	
	//Find All row elements
	@FindBy(xpath = "//table[@class='cart']/tbody/tr")
	List<WebElement> rowElements;
	
	// Row Count
	int rowCount;
	
	//Return table row size
	public int getTableRowCount() {
		if(rowElements.size()>0) {
		 rowCount=rowElements.size();
		return rowCount;
		}
		return 0;
	
	}
	
	
	//Get single row elements
	public WebElement getElements(int rowNumber) {
		return rowElements.get(rowNumber);
	}
	
	//Find column elements
	@FindBy(xpath="//table[@class='cart']/tbody/tr[1]/td")
	List<WebElement> elementsInRow;
	
	
   //column count
	int columnCount;
	
	public int getColumCount() {
		if(rowElements.size()>0) {

		columnCount=elementsInRow.size();
		return columnCount;
		}
		return 0;
	}
	
	
	//click on remove button
	public WebElement getRemoveButton(int row) {
		if(row>=1 && row<=rowCount) {
		return driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[1]/input"));
	}
		else {
			System.out.println("Invalid row number or Row does not exists");
			return null;
		}
	}
	
	
	//Get product image
	public WebElement getProductImage(int row) {
		if(row>=1 && row<=rowCount) {
		return driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[2]/img"));
	}
		else {
			System.out.println("Invalid row number or Row does not exists");
			return null;
		}
	}

	//Get product description
	public WebElement getProductDescription(int row) {
		if(row>=1 && row<=rowCount) {
		return driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[3]/div"));
	}
		else {
			System.out.println("Invalid row number or Row does not exists");
			return null;
		}
	}
	
	
	//Click on item link
		public void clickOnItemLink(int row) {
			if(row>=1 && row<=rowCount) {
				driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[3]/a")).click();
			}
			System.out.println("Invalid row number or Row does not exists");
		}
		
		//Click on edit link
		public void clickEditLink(int row) {
			if(row>=1 && row<=rowCount) {
				driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[3]/div/a")).click();
			}
			System.out.println("Invalid row number or Row does not exists");
		}
	
	
	//Get product price
	public String getProductPrice(int row) {
		if(row>=1 && row<=rowCount) {
			return driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[4]/span[@class='product-unit-price']")).getText();
			
		}
		System.out.println("Invalid row number or Row does not exists");
		return "Price not found";
	}
	
	
	
	//Enter product quantity
	public void setProductQuantity(int row, String quantity) {
		if(row>=1 && row<=rowCount) {
			WebElement productQuantity = driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[5]/input"));
			productQuantity.clear();
			productQuantity.sendKeys(quantity);
		}
		System.out.println("Invalid row number or Row does not exists");
	}
	
	//Get total price of each product
	public String getTotalPrice(int row) {
		if(row>=1 && row<=rowCount) {
			return driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[6]/span[@class='product-subtotal']")).getText();
		}
		System.out.println("Invalid row number or Row does not exists");
		return "Total price not found";
	}
	
	
	//Sub total
		@FindBy(xpath = "//table[@class='cart-total']//span[text()='Sub-Total:']/../following-sibling::td/span")
		private WebElement subTotal;
		
		public String getSubTotal() {
			return subTotal.getText();
		}
		
		
		//Shipping price
		@FindBy(xpath = "//table[@class='cart-total']//span[contains(text(),'Shipping:')]/../following-sibling::td/span")
		private WebElement shippingCharge;
		
		public String getShippingCharge() {
			return shippingCharge.getText();
		}
		
		
		//Tax
		@FindBy(xpath = "//table[@class='cart-total']//span[contains(text(),'Tax: ')]/../following-sibling::td/span")
		private WebElement tax;
		
		public String getTax() {
			return tax.getText();
		}
		
		
		//Total price
		@FindBy(xpath = "(//table[@class='cart-total']//span[contains(text(),'Total')]/../following-sibling::td/span)[2]")
		private WebElement totalPrice;
		
		public String getTotalPrice() {
			return totalPrice.getText();
		}
	
	
}
