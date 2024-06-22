package testCases;

import org.testng.annotations.Test;

import pageObject.Login_Page;
import testBase.TestBase;

public class TC__001__LoginPage extends TestBase  {
	
	
	@Test
	public void login() {
		Login_Page login = new Login_Page(driver);
		login.Username();
		login.password();
		login.login();
	}

}
