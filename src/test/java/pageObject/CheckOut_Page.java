package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOut_Page extends BasePage {
	
	
	WebDriver driver;

	public CheckOut_Page(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(xpath = "//*[@id=\"checkout\"]")
	WebElement Checkoutbutton;
	
	//checkout information
	@FindBy(xpath = "//*[@id=\"first-name\"]")
	WebElement firstname;
	
	@FindBy(xpath = "//*[@id=\"last-name\"]")
	WebElement lastname;
	
	@FindBy(xpath = "//*[@id=\"postal-code\"]")
	WebElement PinCode;
	
	@FindBy(xpath = "//*[@id=\"continue\"]")
	WebElement continue_button;
	
	
	//Finish
	@FindBy(xpath = "//*[@id=\"finish\"]")
	WebElement Finish_button;
	
	@FindBy(xpath = "//*[@class=\"complete-header\"]")
	WebElement Text1;
	
	public void Checkoutbutton() {
		Checkoutbutton.click();
	}
	
	public void firstname() {
		firstname.sendKeys("Yohan");
	}
	public void lastname()
	{
		lastname.sendKeys("mallula");
	}
	public void PinCode()
	{
		PinCode.sendKeys("69699");
	}
	
	public void continue_button()
	{
		continue_button.submit();
	}
	
	public void Finish_button()
	{
		Finish_button.click();
	}
	
	public void Text1()
	{
	  String text2 =	Text1.getText();
	 String  origaniltext = text2;
	 
	 if(text2 == origaniltext )
	 {
		 System.out.println(text2 + " passs");
	 }else {
		 System.out.println(text2 +" Fail");
	 }
		
	}

	


}
