package AutomationPractice.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C://Users//pramo//eclipse-workspace//SeleniumJava//Driver//chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Jack Sparrow");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("TuckerBobbyUSA@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Password");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement Staticdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select (Staticdropdown);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.id("inlineRadio1")).click();
		System.out.println(driver.findElement(By.id("inlineRadio1")).getText());
		Assert.assertTrue(driver.findElement(By.id("inlineRadio1")).isSelected());
		driver.findElement(By.name("bday")).sendKeys("11/11/1989");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
		System.out.println("Assignment 2 is completed!! Thank you Rahul:)");
		driver.quit();
		
		
	}

}
