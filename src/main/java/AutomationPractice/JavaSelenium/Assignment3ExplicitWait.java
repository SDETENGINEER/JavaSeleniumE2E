package AutomationPractice.JavaSelenium;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3ExplicitWait {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//pramo//eclipse-workspace//SeleniumJava//Driver//chromedriver.exe/");
		WebDriver driver =new ChromeDriver();
		//ImplicitWait implementation to remove thread.sleep
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//Explicit wait to handle special cases and not for all inputs	
		WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='consult'")));
		driver.findElement(By.xpath("//option[@value='consult']")).click();
		
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link btn btn-primary']")));
		
		//Add product after finding the number of Add buttons present on the page:
		List <WebElement> items= driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for (int i=0;i<items.size();i++)
		{
			items.get(i).click();
		}
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		Utility.CaptureScreenshot(driver, "Checkout Page.jpg");
		driver.quit();
	}

}
