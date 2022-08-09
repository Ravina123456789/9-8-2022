package pomclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage {

	WebDriver driver;
	
	//webElement
	private By emailfield = By.xpath("//input[@class='_2IX_2- VJZDxU']");
	private By passwordField = By.xpath("//input[@type='password']");
	private By loginBtn = By.xpath("(//button[@type='submit'])[2]");
	
	
	//constructor
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	//public methods
	public void enterEmail()
	{
		driver.findElement(emailfield).sendKeys("9673371657");
	}
	public void enterPassword()
	{
		driver.findElement(passwordField).sendKeys("ravina123");
		
	}
	


	public void clickLoginBtn() {
		// TODO Auto-generated method stub
		driver.findElement(loginBtn).click();
		
	}
}
