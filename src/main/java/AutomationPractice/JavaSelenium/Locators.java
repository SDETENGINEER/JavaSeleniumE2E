package AutomationPractice.JavaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//pramo//eclipse-workspace//SeleniumJava//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://automationpractice.com/index.php");
		//driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		
		//get Windows Title
		System.out.println(driver.getTitle());
		
		//Email Address for Create an Account:
		
		driver.findElement(By.id("email_create")).sendKeys("pramod200887@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		//checking the error shown: CSS syntax ---> Select= tagname.classname
		//implicit wait - to wait for the specified time
		System.out.println(driver.findElement(By.xpath("//li[contains(text(),'An account using this')]")).getText());
		//Forgot password:
		
		//driver.findElement(By.linkText("http://automationpractice.com/index.php?controller=password")).click();
		driver.findElement(By.cssSelector("a[title='Recover your forgotten password']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("pramod200887@gmail.com");
		//clicking retrieve password:
		driver.findElement(By.xpath("//span[normalize-space()='Retrieve Password']")).click();
		//showing message displayed after successful email validation
		//System.out.println(driver.findElement(By.cssSelector(".alert.alert-success")).getText());
		System.out.println(driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText());
		
		//Redirecting to login page:
		driver.findElement(By.xpath("//a[@title='Back to Login']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		//Entering password after reset password to sign in
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pramod200887@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Password#3");
		Thread.sleep(3000);
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
	}

}
