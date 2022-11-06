package AutomationPractice.JavaSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//pramo//eclipse-workspace//SeleniumJava//Driver//chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		driver.findElement(By.cssSelector("a[class=blinkingText]")).click();
		Set<String> windows= driver.getWindowHandles();
		System.out.println(windows);
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		System.out.println(driver.switchTo().window(childId).getTitle());
		driver.switchTo().window(childId);
		
		//Now extracting the message from the child window
		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
		
		String uName= driver.findElement(By.partialLinkText("mentor@")).getText();
		
		//switching back to parent window
		driver.switchTo().window(parentId);
		
		//find the username text box and enter the text in it
		driver.findElement(By.id("username")).sendKeys(uName);
		
		
		

	}

}
