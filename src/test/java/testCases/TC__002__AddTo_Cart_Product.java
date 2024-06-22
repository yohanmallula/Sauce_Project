package testCases;

import org.testng.annotations.Test;

import pageObject.Login_Page;
import pageObject.Products_Page;
import testBase.TestBase;

public class TC__002__AddTo_Cart_Product extends TestBase {

	@Test
	public void AddTo_cart()   {
		Login_Page login = new Login_Page(driver);
		login.Username();
		login.password();
		login.login();
		
		Products_Page product = new Products_Page(driver);
		product.fliter1();
		product.filter_high();
		product.jucket();
		product.back();
		product.product1();
		product.AddTo_cart();
		product.open_Cart();
	}
	
	
	
}
