package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Login_Page  extends BasePage {
	
	WebDriver driver;
	
	public Login_Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@name=\"user-name\"]")
	WebElement username;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"login-button\"]")
	WebElement login;
	
	public void Username()
	{
		username.sendKeys("standard_user");
	}
	
	public void password()
	{
		password.sendKeys("secret_sauce");
	}
	
	public void login()
	{
		login.submit();
	}

}
