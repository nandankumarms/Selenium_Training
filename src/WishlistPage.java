import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	WebDriver driver;
	public WishlistPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	//Get page heading
		@FindBy(xpath = "//h1")
		private WebElement pageHeading;
		
		public String getPageHeading() {
			return pageHeading.getText();
		}
		
		
		//Get table header
		@FindBy(xpath = "//table[@class='cart']/thead//tr")
		private WebElement tableHeader;

		public String getTableHeader() {
			return tableHeader.getText();
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
		public void clickRemoveButton(int row) {
			if(row>=1 && row<=rowCount) {
				driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[1]/input")).click();
			}
			else {
				System.out.println("Invalid row number or Row does not exists");

			}
		}
		
		
		//Click add to cart button
		public void clickAddToCartButton(int row) {
			if(row>=1 && row<=rowCount) {
				driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[2]/input")).click();
			}
			else {
				System.out.println("Invalid row number or Row does not exists");

			}
		}
		


		//Get product image
		public WebElement getProductImage(int row) {
			if(row>=1 && row<=rowCount) {
				return driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[3]/img"));
			}
			else {
				System.out.println("Invalid row number or Row does not exists");
				return null;
			}
		}

		//Get product description
		public String getProductDescription(int row) {
			if(row>=1 && row<=rowCount) {
				return driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[4]/div")).getText();
			}
			else {
				System.out.println("Invalid row number or Row does not exists");
				return null;
			}
		}


		//Click on item link
		public void clickItemLink(int row) {
			if(row>=1 && row<=rowCount) {
				driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[4]/a")).click();
			}
			System.out.println("Invalid row number or Row does not exists");
		}

		

		//Get product price
		public String getProductPrice(int row) {
			if(row>=1 && row<=rowCount) {
				return driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[5]/span[@class='product-unit-price']")).getText();

			}
			System.out.println("Invalid row number or Row does not exists");
			return "Price not found";
		}



		//Enter product quantity
		public void enterQuantity(int row, String quantity) {
			if(row>=1 && row<=rowCount) {
				WebElement productQuantity = driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[6]/input"));
				productQuantity.clear();
				productQuantity.sendKeys(quantity);
			}
			System.out.println("Invalid row number or Row does not exists");
		}

		//Get total price of each product
		public String getTotalPrice(int row) {
			if(row>=1 && row<=rowCount) {
				return driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[7]/span[@class='product-subtotal']")).getText();
			}
			System.out.println("Invalid row number or Row does not exists");
			return "Total price not found";
		}
		
		
		//Update wishlist button
		@FindBy(xpath = "//div[@class='common-buttons']/input[@name='updatecart']")
		private WebElement updateWishListButton;
		
		public void clickUpdateWishListButton() {
			updateWishListButton.click();
		}
		
		
		//Add to common cart button
		@FindBy(xpath = "//div[@class='common-buttons']/input[@name='addtocartbutton']")
		private WebElement commonAddToCartButton;
		
		public void clickCommonAddToCartButton() {
			commonAddToCartButton.click();
		}
		
		
		//Email a friend button
		@FindBy(xpath = "//div[@class='common-buttons']/input[@value='Email a friend']")
		private WebElement emailAFriend;
		
		public void clickEmailAFriendButton() {
			emailAFriend.click();
		}
		
		
		//Wishlist URL
		@FindBy(xpath = "//div[@class='share-info']//a")
		private WebElement wishlistUrl;
		
		public void clickWishlistUrl() {
			wishlistUrl.click();
		}


}
