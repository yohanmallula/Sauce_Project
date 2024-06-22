package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Products_Page extends BasePage {
	
	WebDriver driver;

	public Products_Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@class=\"product_sort_container\"]")
	WebElement filter1;
	
	
	@FindBy(xpath = "//*[text() = 'Sauce Labs Fleece Jacket']")
	WebElement jucket;
	
	
	//click on back 
	@FindBy(xpath = "//*[@id=\"back-to-products\"]")
	WebElement back;
	
	@FindBy(xpath = "//*[text() = \"Sauce Labs Backpack\"]")
	WebElement product1;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart\"]")
	WebElement AddTo_cart;
	
	@FindBy(xpath = "//*[@class=\"shopping_cart_link\"]")
	WebElement open_Cart;
	
	public void fliter1() {
		
		// select class object
		Select saving = new Select(filter1);
		saving.selectByVisibleText("Price (low to high)");
		System.out.println("dropdown select  By  Yohan");
		
	}
	
	public void filter_high() {
		
		//select class object
		Select hight_To_Low = new Select(filter1);
		hight_To_Low.selectByVisibleText("Price (high to low)");
	}
	
	public void jucket() {
		jucket.click();
	}
	
	//back
	public void back() {
		back.click();
	}
	
	public void product1() {
		product1.click();
	}
	
	public void AddTo_cart() {
		AddTo_cart.click();
	}
	
	public void open_Cart() {
		open_Cart.click();
	}
	
}
