package week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLeads {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/Desktop/Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		driver.findElementByXPath("//a[contains(text(),'Merge Leads')]").click();
		driver.findElementByXPath("//img[@alt='Lookup'][1]").click();
		Set<String> allwind = driver.getWindowHandles();
		List<String> list = new ArrayList();
		list.addAll(allwind);
		driver.switchTo().window(list.get(1));
		driver.findElementByXPath("//input[@name='id']").sendKeys("10135");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		driver.switchTo().window(list.get(0));
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		Set<String> allwind1 = driver.getWindowHandles();
		List<String>list1= new ArrayList<>();
		list1.addAll(allwind1);
		driver.switchTo().window(list1.get(1));
		driver.findElementByXPath("//input[@name='id']").sendKeys("10136");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		driver.switchTo().window(list1.get(0));
		driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		driver.switchTo().alert().accept();
		
		
		
		
		
		

	}

}