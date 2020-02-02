package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import guru99pages.PFhomepage;
import guru99pages.PGloginpage;

public class TestCase1 {
	WebDriver driver;
	PGloginpage objLogin;
	PFhomepage objHomePage;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/Desktop/Drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
		public void test_Home_Page_Appear_Correct() {
			
			objLogin = new PGloginpage(driver);
			
			try
			{
				String loginPageTitle = objLogin.getLoginTitle();
			Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
			}
			catch( Exception e)
			{
				System.out.println("Element incorrect");
			}
			 objLogin.loginToGuru99("mgr123", "mgr!23");
			 
			 objHomePage = new PFhomepage(driver);
			 Assert.assertTrue(objHomePage.getHomepageDashboardUserName().toLowerCase().contains("manger id: mgr123"));
			 
		}
}
