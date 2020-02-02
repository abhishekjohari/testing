package week1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTaps {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/Desktop/Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("Democsr");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[contains(text(),'Create Lead')]").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		driver.findElementByXPath("//input[@id=\"createLeadForm_firstName\"]").sendKeys("Abhishek");
		driver.findElementByXPath("//input[@id=\"createLeadForm_lastName\"]").sendKeys("Johari");
		driver.findElementByName("firstNameLocal").sendKeys("abhi");
		driver.findElementByName("lastNameLocal").sendKeys("joh");
		driver.findElementByName("personalTitle").sendKeys("MR");
		driver.findElementByName("generalProfTitle").sendKeys("Test");
		driver.findElementByXPath("//input[@id='createLeadForm_departmentName']").sendKeys("CSE");
		driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys("5,00,000,00");
		driver.findElementByName("numberEmployees").sendKeys("35000");
		driver.findElementByXPath("//input[@id='createLeadForm_sicCode']").sendKeys("NEW");
		driver.findElementByXPath("//textarea[@id='createLeadForm_description']").sendKeys("This is a test");
		driver.findElementByXPath("//textarea[@id='createLeadForm_importantNote']").sendKeys("Nothing important");
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
		
		
		
		
	}

}
