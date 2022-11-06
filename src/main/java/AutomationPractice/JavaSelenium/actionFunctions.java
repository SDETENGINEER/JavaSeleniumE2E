package AutomationPractice.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//pramo//eclipse-workspace//SeleniumJava//Driver//chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		//To validate mouseover interactions to move to specific element:
		
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		//Highlighting the search textbox
		WebElement searchText = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		a.moveToElement(searchText).click().keyDown(Keys.SHIFT).sendKeys("ryan").build().perform();

	}

}
