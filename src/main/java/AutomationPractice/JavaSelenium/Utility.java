package AutomationPractice.JavaSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	public static void CaptureScreenshot(WebDriver driver, String filename) throws IOException
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//To capture or save in dedicated path:
		FileUtils.copyFile(src, new File("C://Users//pramo//eclipse-workspace//SeleniumJava//Screenshots//" +filename + ""));
	}

}
