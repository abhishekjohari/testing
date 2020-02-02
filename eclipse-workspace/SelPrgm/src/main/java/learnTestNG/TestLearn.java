package learnTestNG;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLearn {
	
	@BeforeTest
	public void program1()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/Desktop/Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours");
		driver.manage().window().maximize();
		String expected = "Welcome: Mercury Tours";
		String actual= driver.getTitle();
	 Assert.assertEquals(actual,expected );
	}
	@Test
	public void program2() {
		ChromeDriver driver = new ChromeDriver();
		driver.findElementByXPath("//a[contains(text(),'REGISTER')]").click();
		
		
		String actual =driver.getTitle();
		String expected = "Register: Mercury Tours";
		Assert.assertEquals(actual, expected);
	}
	@AfterTest
		public void program3()
		{
			ChromeDriver driver = new ChromeDriver();
			driver.close();
		
		
	}
		 
	 
	}
	


