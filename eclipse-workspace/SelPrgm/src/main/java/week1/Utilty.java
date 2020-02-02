package week1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utilty {
	
	public static void captureScreenshot(ChromeDriver driver, String Screenshotname) {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("C:/Users/abhishek/Desktop/abhishek/" + Screenshotname+ ".png"));
			
		}
		catch(Exception e)
		{System.out.println("Error occured");
		}
		
	}

}
