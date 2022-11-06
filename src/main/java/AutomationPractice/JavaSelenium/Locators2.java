package AutomationPractice.JavaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://Users//pramo//eclipse-workspace//SeleniumJava//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String email = getEmailText(driver);
		driver.get("http://automationpractice.com/index.php");
		// driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();

		// get Windows Title
		System.out.println(driver.getTitle());
		// Entering password after reset password to sign in using extracted email from
		// email validation message
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Password#3");
		Thread.sleep(2000);
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		System.out.println(driver.findElement(By.xpath("//p[@class='info-account']")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//p[@class='info-account']")).getText(),
				"Welcome to your account. Here you can manage all of your personal information and orders.");
		// checking the user name after login:
		System.out.println(driver.findElement(By.tagName("span")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//a/span")).getText(), "PRAMOD YADAV");
		// Signing out
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		driver.close();

	}

	public static String getEmailText(WebDriver driver) throws InterruptedException {
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.className("login")).click();

		// get Windows Title
		System.out.println(driver.getTitle());

		// Email Address for Create an Account:

		driver.findElement(By.id("email_create")).sendKeys("pramod200887@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		// checking the error shown when already registered email address is entered:
		System.out.println(driver.findElement(By.xpath("//li[contains(text(),'An account using this')]")).getText());
		// Forgot password:
		// driver.findElement(By.linkText("http://automationpractice.com/index.php?controller=password")).click();
		driver.findElement(By.cssSelector("a[title='Recover your forgotten password']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("pramod200887@gmail.com");
		// clicking retrieve password:
		driver.findElement(By.xpath("//span[normalize-space()='Retrieve Password']")).click();
		// showing message displayed after successful email validation
		// System.out.println(driver.findElement(By.cssSelector(".alert.alert-success")).getText());
		System.out.println(driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText());
		String registeredEmail = driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText();
		String[] emailArray = registeredEmail.split(":");
		String email1 = emailArray[1].split(".com")[0];
		String email = email1 + ".com";

		System.out.println("This is splitted/extracted content" + email);
		return email;
	}
}
