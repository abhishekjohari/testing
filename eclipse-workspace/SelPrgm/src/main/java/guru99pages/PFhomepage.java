package guru99pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PFhomepage {
	
	WebDriver driver;
	@FindBy(xpath="//table//tr[@class='heading3']")

	WebElement homePageUserName;
	
	public PFhomepage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public String getHomepageDashboardUserName() {
		return homePageUserName.getText();
	}

}
