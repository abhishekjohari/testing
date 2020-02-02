package week1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/abhishek/Desktop/Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://www.wikipedia.com");
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		

	}

}
