package week1;

import org.openqa.selenium.chrome.ChromeDriver;

public class learnTakescreenshot {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/Desktop/Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Utilty.captureScreenshot(driver, "driver started");
		
		
		
	}

}
	