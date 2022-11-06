package AutomationPractice.JavaSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandlesAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//pramo//eclipse-workspace//SeleniumJava//Driver//chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		Set<String> windows= driver.getWindowHandles();
		Iterator <String> it= windows.iterator();
		String parentId= it.next();
		String childId= it.next();
		//Switching to the child window
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector("div.example")).getText());
		//Switching to parent window
		driver.switchTo().window(parentId);
		String parentText= driver.findElement(By.cssSelector("div.example")).getText().split("Click")[0];
		System.out.println(parentText);
		driver.quit();
		
	}

}
