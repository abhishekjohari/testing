package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/Desktop/Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		//driver.findElementByXPath("//a[contains(text(),'Login & Signup')]").click();
		driver.findElementByXPath("( //input[@type='text'])[2]").sendKeys("ajohari31@rediffmail.com");
		driver.findElementByXPath("//input[@type='password']").sendKeys("92192963922");
		driver.findElementByXPath("(//*[contains(text(),'Login')])[3]").click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@placeholder='Search for products, brands and more']").sendKeys("earphones");
		driver.findElementByXPath("//button[@type='submit']").click();		
		
		
		
		
		

	}

}
