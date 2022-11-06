package AutomationPractice.JavaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class InvokeDriver 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "C://Users//pramo//eclipse-workspace//SeleniumJava//Driver//chromedriver.exe");
        
    	WebDriver driver =new ChromeDriver();
    	//URL Passing
    	driver.get("http://automationpractice.com/index.php");
    	//GetTitle of the page
    	System.out.println(driver.getTitle());
    	
    	//Checking the current URL
    	System.out.println(driver.getCurrentUrl());
    	System.out.println( "Let's Exit Now >>>>>>>!" );
    	driver.close();
    }
}
