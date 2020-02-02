package week1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/Desktop/Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement from = driver.findElementByXPath("(//a[@class='button button-orange'])[4]");
		WebElement to = driver.findElementByXPath("(//li[@class='placeholder'])[4]");
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
		
	}

}
