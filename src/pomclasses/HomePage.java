package pomclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	private By profileName = By.xpath("//div[text()='My Account']");
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	

	public String getProfileName() {
		// TODO Auto-generated method stub
		String pName = driver.findElement(profileName).getText();
    	return pName;
		
		
	}




	
}
