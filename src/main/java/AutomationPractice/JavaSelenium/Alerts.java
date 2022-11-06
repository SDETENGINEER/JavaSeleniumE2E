package AutomationPractice.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://Users//pramo//eclipse-workspace//SeleniumJava//Driver//chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[class='inputs']")).sendKeys("Jack");
		driver.findElement(By.cssSelector("input[value='Alert']")).click();

		// Getting text from the alert box:
		System.out.println(driver.switchTo().alert().getText());
		// Switching to alert and accepting
		driver.switchTo().alert().accept();

		// Alert handling when alert got ok & cancel option, the way it comes up when
		// confirm button is entered:

		driver.findElement(By.xpath("//input[@value='Confirm']")).click();

		// Accepting (OK)
		// driver.switchTo().alert().accept();

		// Cancel
		driver.switchTo().alert().dismiss();

		driver.quit();
	}

}
