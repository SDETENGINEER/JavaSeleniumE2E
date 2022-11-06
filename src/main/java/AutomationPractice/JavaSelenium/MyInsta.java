package AutomationPractice.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyInsta {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C://Users//pramo//eclipse-workspace//SeleniumJava//Driver//chromedriver.exe/");
		
		//WebDriver driver = new ChromeDriver();
		for(int i=1;i<5;i++)
		{
		//System.setProperty("webdriver.gecko.driver", "C://Users//pramo//eclipse-workspace//SeleniumJava//Driver//geckodriver.exe/");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C://Users//pramo//eclipse-workspace//SeleniumJava//Driver//chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pramod200887@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Insta@2022@123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[normalize-space()='Log in']")).click();
		Thread.sleep(2000);
		/*Navigate to Profile:
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pramod200887@gmail.com");
		Thread.sleep(1000);
		
		//FB login:
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Fb@2022@1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		Thread.sleep(3000);
		*/
		
		//driver.get("https://www.instagram.com/");
		
		/*driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pramod200887@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Insta@2022@123");
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='KPnG0']")).click();
		Thread.sleep(2000);
		*/
		//driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		
		
		Thread.sleep(8000);
		//Notification pop up not now
		driver.findElement(By.xpath("//button[normalize-space()='Not Now']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Not Now']")).click();
		
		
		//driver.findElement(By.xpath("//div[contains(text(),'Profile')]")).click();
		driver.findElement(By.xpath("//img[@class='_aa8j']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Reels']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_aajy'])[1]")).click();
		//Thread.sleep(30000);
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//svg[@class='_ab6-']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@normalize-space()='Add a comment…']")).sendKeys("H");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='Post']")).click();
		/*
		driver.findElement(By.xpath("//textarea[@aria-label='Add a comment…']")).sendKeys("A");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='Post']")).click();
		
		driver.findElement(By.xpath("//textarea[@aria-label='Add a comment…']")).sendKeys("P");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='Post']")).click();
		
		driver.findElement(By.xpath("//textarea[@aria-label='Add a comment…']")).sendKeys("P");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='Post']")).click();
		
		driver.findElement(By.xpath("//textarea[@aria-label='Add a comment…']")).sendKeys("Y");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='Post']")).click();
		
		driver.findElement(By.xpath("//textarea[@aria-label='Add a comment…']")).sendKeys("DIWALI");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='Post']")).click();
		*/
		
		driver.quit();
		}
	}

}
