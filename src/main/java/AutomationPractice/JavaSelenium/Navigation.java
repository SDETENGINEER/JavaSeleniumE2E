package AutomationPractice.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://Users//pramo//eclipse-workspace//SeleniumJava//Driver//chromedriver.exe/");
		WebDriver driver =new ChromeDriver();
		//Another way to find Locator from bottom to Top (child to Parent) with the use of Absolute or relative xpath
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pramod200887@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Password#3");
		Thread.sleep(2000);
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		System.out.println(driver.findElement(By.xpath("//p[@class='info-account']")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//p[@class='info-account']")).getText(), "Welcome to your account. Here you can manage all of your personal information and orders.");
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
