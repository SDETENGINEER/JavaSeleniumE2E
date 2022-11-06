package AutomationPractice.JavaSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverScope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//pramo//eclipse-workspace//SeleniumJava//Driver//chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Count of the links on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		//delimiting the webdriver section to footer section of the page only:
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement footerColumn= footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footerColumn.findElements(By.tagName("a")).size());
		
		//Clicking all the links on the footer column section
		
		for (int i=1;i<footerColumn.findElements(By.tagName("a")).size();i++)
		{
			String openInNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerColumn.findElements(By.tagName("a")).get(i).sendKeys(openInNewTab);
			Thread.sleep(7000);
			
			Set<String> windowHandles=driver.getWindowHandles();
			Iterator <String> it = windowHandles.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		}
		
	}

}
