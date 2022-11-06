package AutomationPractice.JavaSelenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class AmazonBasics {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//To Open Chrome in Incognito Mode!! Else, if frequently access, Amazon blocks the selenium calls and present with Captcha, thinkings its a bot!!
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.setCapability(ChromeOptions.CAPABILITY, options);
        */
        
		System.setProperty("webdriver.chrome.driver", "C://Users//pramo//eclipse-workspace//SeleniumJava//Driver//chromedriver.exe/");
		//WebDriver driver = new ChromeDriver(options);
		WebDriver driver = new ChromeDriver();
		
		/*System.setProperty("webdriver.gecko.driver", "C://Users//pramo//eclipse-workspace//SeleniumJava//Driver//geckodriver.exe/");
		
		//To open FF in incognito mode: Else, if frequently access, Amazon blocks the selenium calls and present with Captcha, thinkings its a bot!!
		
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.addArguments("-private-window");
		WebDriver driver = new FirefoxDriver(firefoxOptions);
		*/
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com");
		Utility.CaptureScreenshot(driver, "TilePage.Jpg");
		
		/*Date utility if to save files name with current date
		Date currentDate= new Date();
		System.out.println(currentDate);
		
		//String ScreenshotFileName = currentDate.toString().replace(" ", "-").replace(":", "-");
		 */
		
		System.out.println("This is page title: " +driver.getTitle());
		driver.findElement(By.xpath("//span[@class='hm-icon-label']")).click();
		Utility.CaptureScreenshot(driver, "HamburgerOption_Clicked.png");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='see all'])[1]")).click();
		Thread.sleep(1000);
		Utility.CaptureScreenshot(driver, "SeeAll_Clicked.png");
		
		//To Select computers
		driver.findElement(By.xpath("//div[text()='Computers']")).click();
		Thread.sleep(500);
		Utility.CaptureScreenshot(driver, "Computers_OptionClicked.png");
		//To Click Monitors
		driver.findElement(By.xpath("//a[text()='Monitors']")).click();
		System.out.println(driver.getTitle());
		Utility.CaptureScreenshot(driver, "Monitor_OptionClicked.png");
		//To filter based on LG brand:
		driver.findElement(By.xpath("//a[text()='LG']")).click();
		Thread.sleep(500);
		Utility.CaptureScreenshot(driver, "LG_BrandClicked.png");
		System.out.println(driver.getTitle());
		//Sort by High to Low: Descending order
		Thread.sleep(500);
		driver.findElement(By.xpath("//option[@value='price-desc-rank']")).click();	
		System.out.println("Actal filter selected is this: "+driver.findElement(By.xpath("//option[@value='price-desc-rank']")).getText());
		Utility.CaptureScreenshot(driver, "Price_High-to-Low.png");
		Thread.sleep(1000);
		
		//Selecting the 2nd Highest Price item and displaying on Console
		System.out.println(driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]")).getText());
		
		//Getting 2nd item from the Descending order items:
		System.out.println(driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[2]")).getAttribute("href"));
		//Storing the URL/Link in the string to open product details new tab instance
		String item2 =driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[2]")).getAttribute("href");
		Thread.sleep(1000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		Utility.CaptureScreenshot(driver, "NewTab_Opened.png");
		Thread.sleep(500);
		driver.get(item2);
		Thread.sleep(1500);
		Utility.CaptureScreenshot(driver, "ItemOpened_NewTab.png");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
	}

}
