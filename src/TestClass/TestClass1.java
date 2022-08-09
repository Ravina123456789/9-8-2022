package TestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomclasses.HomePage;
import pomclasses.LoginPage;

public class TestClass1 {
	
	static WebDriver driver;

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();        
		
		driver.get("https://www.flipkart.com/");    
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		verifyUserCanLogin();
		
	}

	public static void verifyUserCanLogin() throws InterruptedException {
	
	LoginPage lp = new LoginPage(driver);
	
	lp.enterEmail();
	lp.enterPassword();
	lp.clickLoginBtn();
	
	Thread.sleep(5000);
	
	HomePage hp = new HomePage(driver);
	
	String pName = hp.getProfileName();
	
	if(pName.equals("My Account"))

	{
		System.out.println("Test is passed");
	}
	else
	{
		System.out.println("Test failed");
	}
}}
