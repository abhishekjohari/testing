package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailTableData {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/abhishek/Desktop/Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://erail.in");
		driver.manage().window().maximize();
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
		boolean selected = driver.findElementByXPath("//input[@id='chkSelectDateOnly']").isSelected();
		if(selected)
		{
			driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
			
		}
		Thread.sleep(5000);
		
		WebElement entireTable = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		 //List<WebElement> eachrow = entireTable.findElement(By.tagName(tagName))
		}

	}


